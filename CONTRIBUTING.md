## Modifying/Adding code

Most of the SDK is generated code. Modifications to code will be persisted between generations, but may
result in merge conflicts between manual patches and changes from the generator. The generator will never
modify the contents of the `arcade-java/lib/` and `arcade-java-examples/` directories.

## Adding and running examples

Set the following environment variables:

| ENV Var           | Description                                                             |
|-------------------|-------------------------------------------------------------------------|
| `ARCADE_USER_ID`  | Arcade user Id or email address                                         |
| `ARCADE_API_KEY`  | [Arcade API key](https://docs.arcade.dev/en/get-started/setup/api-keys) |
| `ARCADE_BASE_URL` | Arcade URL, defaults to: `https://api.arcade.dev`                       |

Use `./gradlew :arcade-java-example:run -Pexample=<Name>` to run `<Name>Example`

For example, if you have the `potify.ResumePlayback` tool configured, you can run:
```shell
export ARCADE_API_KEY='your-api-key'
export ARCADE_USER_ID='your-arcade-user'
./gradlew :arcade-java-example:run -Pexample=PlaySpotify
```

## Building the repository from source

If you’d like to use the repository from source, you can build and install it from git:

```sh
git clone git@github.com/ArcadeAI/arcade-java.git
SKIP_MOCK_TESTS=true ./gradlew build publishToMavenLocal # This will skip the integration tests, see below on info on how to run them.
```
## Running tests

Most tests require you to [run a mock server](https://github.com/stoplightio/prism) against the OpenAPI spec to run the tests.

```sh
# you will need npm installed
./scripts/mock --daemon
```

The mock server will run in the background allowing you to run tests from the command line `./gradlew test` or from your IDE.

To stop the mock server run:
```shell
pkill -f prism
```

## Linting and formatting

This repository uses [Spotless](https://github.com/diffplug/spotless/tree/main/plugin-gradle) to lint and format the code in the repository.

To lint:

```sh
$ ./scripts/lint
```

To format and fix all issues automatically:

```sh
$ ./scripts/format
```

## Release and pull request process

As mentioned above, most of the code in this repository is generated. So the pull requests process may different from what you are expecting. Here are the steps:

- Custom code changes should target the `next` branch in [`ArcadeAI/arcade-java`](https://github.com/arcadeai/arcade-java).
- Be selective on what you are changing, as this may cause [merge conflicts](https://www.stainless.com/docs/sdks/configure/custom-code) with the generated code.
- Create a new pull request against `next`, CI will build and test it.
- Once it is merged to `next`, and when there have been upstream changes to the OpenAPI spec, you will see a pull request titled "release: <version>" (where `<version>` is the next version to be released)
- Review it, most of the changes will have been generated, make sure the changes from your pull request are included.
- Approve the PR, and merge it.
  - The `next` branch will be rebased to `main`, so you will need to rewrite the branch, something like: `git fetch origin next && git reset --hard origin/next`
- Once changes are merged to `main` a CI job will deploy the version to [Maven Central](https://central.sonatype.com/search?q=arcade-java). There may be a delay between the time it is published until the time it shows up in the Maven Central search results.

## Troubleshooting tips

If you are running into issues deploying to Maven Central, run the [`Release Doctor`](https://github.com/ArcadeAI/arcade-java/actions/workflows/release-doctor.yml) CI job, this will check that the required environment variables are set correctly.

The [`CI` workflow](https://github.com/ArcadeAI/arcade-java/blob/main/.github/workflows/ci.yml), includes a couple of `if` statments that look like: `github.repository == 'stainless-sdks/arcade-engine-java'`. These are ONLY used for pre-release builds when the Stainless SDK code is generated. These are NOT used currently (in the future if there are multiple Java project repositories, this Maven repository could be used to test nightly builds). Otherwise, [build from source](#building-the-repository-from-source).
