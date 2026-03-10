# Changelog

## 0.1.0-alpha.4 (2026-03-10)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/ArcadeAI/arcade-java/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

## 0.1.0-alpha.3 (2026-03-09)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/ArcadeAI/arcade-java/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### Features

* **api:** api update ([4a4a38b](https://github.com/ArcadeAI/arcade-java/commit/4a4a38bd6eb8848183c7a553ab23d28f44a7ca6e))
* **api:** api update ([b62bebe](https://github.com/ArcadeAI/arcade-java/commit/b62bebeaa3c5341aed692f28cdb76c24ef4588d7))
* **api:** api update ([ab083dc](https://github.com/ArcadeAI/arcade-java/commit/ab083dc5b22c66bd1a216107ed5d427270f7535f))
* **api:** api update ([a9067a6](https://github.com/ArcadeAI/arcade-java/commit/a9067a6b9e05ec27d0a4c3bd5a50b5fd568a617f))
* **api:** Enable publishing for Java SDK ([4e1dd23](https://github.com/ArcadeAI/arcade-java/commit/4e1dd23facb1daf92135fde91bbeb1fefc9e1b76))


### Chores

* **ci:** skip uploading artifacts on stainless-internal branches ([e37cb5d](https://github.com/ArcadeAI/arcade-java/commit/e37cb5d7f6f23e6be986ae5e3784898e3854a79c))
* **internal:** bump palantir-java-format ([b1ebae8](https://github.com/ArcadeAI/arcade-java/commit/b1ebae8ff127b1402785df354f2687408ff248b0))
* **internal:** codegen related update ([8837560](https://github.com/ArcadeAI/arcade-java/commit/883756053127934e8dc3d1ee90148f51c0a48f28))
* **test:** do not count install time for mock server timeout ([4432b39](https://github.com/ArcadeAI/arcade-java/commit/4432b393c3ce20da89bb217f019dbf3221d41d0e))

## 0.1.0-alpha.2 (2026-02-28)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/ArcadeAI/arcade-java/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### Features

* add Java-friendly convenience methods for JsonValue and tool response output ([#9](https://github.com/ArcadeAI/arcade-java/issues/9)) ([c44efc8](https://github.com/ArcadeAI/arcade-java/commit/c44efc838f588171cb9f5dc2ab75be58479567fc))
* **api:** api update ([1c45d3e](https://github.com/ArcadeAI/arcade-java/commit/1c45d3ed9c42bcf23ffc18c4877599e5d793b4dc))
* **api:** api update ([bb94f57](https://github.com/ArcadeAI/arcade-java/commit/bb94f5702271dd02242fcf349e4f6a454ba5cbda))
* **api:** api update ([04fcbf1](https://github.com/ArcadeAI/arcade-java/commit/04fcbf1d46d1556e107f33d49e72ed906c2fabf8))
* **api:** api update ([6b1998f](https://github.com/ArcadeAI/arcade-java/commit/6b1998f5e5b4be5fc38204fa5176a6cba6758cf3))
* **api:** api update ([cb15386](https://github.com/ArcadeAI/arcade-java/commit/cb1538608fd7d030860ed13ed1ffcf6b01d94a28))
* **api:** api update ([d965caa](https://github.com/ArcadeAI/arcade-java/commit/d965caad240981417886b04d41b7cfb6c6807425))
* **api:** api update ([5f47131](https://github.com/ArcadeAI/arcade-java/commit/5f471314476dfce0cd0595fbdcabf7119ffd8266))
* **api:** api update ([8edb811](https://github.com/ArcadeAI/arcade-java/commit/8edb811c4e9729e9b5ddc88a694bf9b81834327b))
* **api:** api update ([bdacc08](https://github.com/ArcadeAI/arcade-java/commit/bdacc081f002a2ea9e44b4b8577b3f0f419a7f9d))
* **client:** add `HttpRequest#url()` method ([8840c08](https://github.com/ArcadeAI/arcade-java/commit/8840c08871296bd8c8954e69d8b8d9a215383e28))
* **client:** add connection pooling option ([c227e1f](https://github.com/ArcadeAI/arcade-java/commit/c227e1f817f7cc5bc96d545854a85709d1c9abfb))
* **client:** allow configuring dispatcher executor service ([6a9cf95](https://github.com/ArcadeAI/arcade-java/commit/6a9cf95d67e77e46159d652442250d93aeb9b1a7))
* **client:** send `X-Stainless-Kotlin-Version` header ([4708f4d](https://github.com/ArcadeAI/arcade-java/commit/4708f4d106ba6d1e250f652da7155f92a0be3a60))


### Bug Fixes

* **client:** disallow coercion from float to int ([a73ee11](https://github.com/ArcadeAI/arcade-java/commit/a73ee115e09984525883d5334ceb6b5afad7934e))
* **client:** fully respect max retries ([ff68350](https://github.com/ArcadeAI/arcade-java/commit/ff68350ed3a78064eee3dc46c2caccd71faf5f97))
* **client:** preserve time zone in lenient date-time parsing ([ab98898](https://github.com/ArcadeAI/arcade-java/commit/ab988986ff4782e4218f189bd1cee26138a66516))
* **client:** send retry count header for max retries 0 ([ff68350](https://github.com/ArcadeAI/arcade-java/commit/ff68350ed3a78064eee3dc46c2caccd71faf5f97))
* date time deserialization leniency ([f7f0332](https://github.com/ArcadeAI/arcade-java/commit/f7f0332fbd4e6bb3de2f0738ca1072a2ccfed169))
* **tests:** add missing query/header params ([63d142a](https://github.com/ArcadeAI/arcade-java/commit/63d142a789cd0bd2170cfb30ea04d0f9ff8cd6d5))


### Chores

* **ci:** upgrade `actions/github-script` ([bc708e6](https://github.com/ArcadeAI/arcade-java/commit/bc708e664167b55d6da8adc5e5b5248151dd76fb))
* **ci:** upgrade `actions/setup-java` ([cb10ea7](https://github.com/ArcadeAI/arcade-java/commit/cb10ea791a3ef48655eafe4cf0a42691cad4794d))
* drop apache dependency ([cbf0f1e](https://github.com/ArcadeAI/arcade-java/commit/cbf0f1eab15563592bed7c6be68b11a38de68a5c))
* **internal:** allow passing args to `./scripts/test` ([09fdab4](https://github.com/ArcadeAI/arcade-java/commit/09fdab4518905c63d49be270b68517c1b3e1436a))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([54eaec7](https://github.com/ArcadeAI/arcade-java/commit/54eaec7dc0bc56c4059e5bdbf087cd14119e8f3e))
* **internal:** codegen related update ([2a1703d](https://github.com/ArcadeAI/arcade-java/commit/2a1703d633b6f1ef888c84bb0f97a489707fdf2b))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([3aa593e](https://github.com/ArcadeAI/arcade-java/commit/3aa593e3a04a5cb8d5d06d856fce71384550dfc1))
* **internal:** depend on packages directly in example ([ff68350](https://github.com/ArcadeAI/arcade-java/commit/ff68350ed3a78064eee3dc46c2caccd71faf5f97))
* **internal:** expand imports ([161104e](https://github.com/ArcadeAI/arcade-java/commit/161104ee63b0976f5d826af2e741c8f5174fe3e3))
* **internal:** improve maven repo docs ([19dfe71](https://github.com/ArcadeAI/arcade-java/commit/19dfe71adecbf10499e215da519ad33829056e35))
* **internal:** make `OkHttp` constructor internal ([6976ff2](https://github.com/ArcadeAI/arcade-java/commit/6976ff257c45b8eee1f6cc0ce942381aa87d6665))
* **internal:** support uploading Maven repo artifacts to stainless package server ([1587d95](https://github.com/ArcadeAI/arcade-java/commit/1587d95ebf6354001281ddf48f90c6975d0ff42e))
* **internal:** update `actions/checkout` version ([4e3d119](https://github.com/ArcadeAI/arcade-java/commit/4e3d1190db673cb73830d46e8f33ddd3282c081b))
* **internal:** update `TestServerExtension` comment ([3d433ba](https://github.com/ArcadeAI/arcade-java/commit/3d433bafa9702fa980cff7ad77a6ae6d5c5406ac))
* **internal:** update maven repo doc to include authentication ([9293d09](https://github.com/ArcadeAI/arcade-java/commit/9293d093fdfa5b73def69fa6ee378b9ed4a7c0b5))
* **internal:** upgrade AssertJ ([83fbe85](https://github.com/ArcadeAI/arcade-java/commit/83fbe85d88fb970705ba160c9ecd78711aba0066))
* make `Properties` more resilient to `null` ([a6e14e5](https://github.com/ArcadeAI/arcade-java/commit/a6e14e52dff5cb2d1bd22e47f62f9bc922dd9dfb))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/ArcadeAI/arcade-java/issues/3240) in tests ([f7f0332](https://github.com/ArcadeAI/arcade-java/commit/f7f0332fbd4e6bb3de2f0738ca1072a2ccfed169))


### Documentation

* add comment for arbitrary value fields ([5697f14](https://github.com/ArcadeAI/arcade-java/commit/5697f14e1f875679a2c99990f3600776a58ad4b1))
* add more examples ([ad5a7c6](https://github.com/ArcadeAI/arcade-java/commit/ad5a7c6b1a79255af06b764c2d609699b68414c9))


### Refactors

* **client:** handling of absent pagination total ([d44e78d](https://github.com/ArcadeAI/arcade-java/commit/d44e78daeaf4a3421cc39102c78920cfc6f20322))

## 0.1.0-alpha.1 (2025-12-08)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/ArcadeAI/arcade-java/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** api update ([f2a8654](https://github.com/ArcadeAI/arcade-java/commit/f2a8654351c4a197d666dcb2b2eb0190bcdab2e2))
* **api:** api update ([867c358](https://github.com/ArcadeAI/arcade-java/commit/867c358d06c3d5af9306d304a4e41320b1c0c67b))


### Chores

* configure new SDK language ([7a33653](https://github.com/ArcadeAI/arcade-java/commit/7a336537713407720db5315850b1f0fcd3f79442))
* **internal:** update java config ([e61bcc1](https://github.com/ArcadeAI/arcade-java/commit/e61bcc109789d0c8546626df6f50f4487bfa4da8))
* update SDK settings ([cb6b641](https://github.com/ArcadeAI/arcade-java/commit/cb6b641e3fc81f0640a0712edaf0d42e549cb236))


### Documentation

* add source file links to readme ([1801e21](https://github.com/ArcadeAI/arcade-java/commit/1801e21404a817fe4d68fdf1969af49f088ce154))
