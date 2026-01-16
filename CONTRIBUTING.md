## Modifying/Adding code

Most of the SDK is generated code. Modifications to code will be persisted between generations, but may
result in merge conflicts between manual patches and changes from the generator. The generator will never
modify the contents of the `arcade-java/lib/` and `arcade-java-examples/` directories.

## Adding and running examples

TODO

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

The mock serer will run in the background allowing you to run tests from the command line `./gradlew test` or from your IDE.

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
