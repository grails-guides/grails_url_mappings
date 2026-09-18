# grails_url_mappings

Sample app for the apache/grails-static-website guide [Grails URL Mappings](https://grails.apache.org/guides/grails_url_mappings/8/guide/index.html).

This branch is the Grails 8 companion for **configuring routes and endpoints**: default URL mappings, custom patterns, HTTP methods, grouped mappings, multiple `UrlMappings` files, and `UrlMappingsUnitTest`.

## Layout

| Directory | What it is |
|---|---|
| [`initial/`](initial/) | Grails 8 web starter (`web` profile, Hibernate, Tomcat, DevTools, H2). Start here and follow the guide. |
| [`complete/`](complete/) | The same starter with `Talk` / `Speaker` / `Agenda` / `Conference` controllers, `ConferenceUrlMappings`, and a unit test. |

## Running

Requires JDK 21+.

```bash
cd complete
./gradlew test
./gradlew bootRun
```

Then browse to http://localhost:8080/conf/talks

## Branches

| Branch | Grails version |
|---|---|
| `grails8` | Apache Grails 8.0.0-M5 |
| `grails5` | Apache Grails 5 (published guide baseline) |

## Guide prose

Published narrative lives on [grails.apache.org/guides](https://grails.apache.org/guides/) in [apache/grails-static-website](https://github.com/apache/grails-static-website) under `guides/grails_url_mappings/`.

## License

Apache License 2.0. See [LICENSE](LICENSE).
