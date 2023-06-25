# PokéJava ![](https://img.shields.io/badge/version-0.1.0-blue?style=flat-square) ![](https://img.shields.io/github/license/Greenadine/PokeJava?style=flat-square)
A Java 16+ wrapper for the PokéAPI. This wrapper is still a work in progress, and does not yet support all endpoints.

For a list of currently-supported endpoints, see the [latest release](https://github.com/Greenadine/PokeJava/releases).

## Installation
### Maven
```xml
<repositories>
    <repository>
        <id>greenadine-repo</id>
        <url>https://repo.greenadine.dev/releases/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>dev.greenadine</groupId>
        <artifactId>pokejava</artifactId>
        <version>[VERSION]</version> <!-- Replace [VERSION] with the desired version -->
    </dependency>
</dependencies>
```

### Gradle
```groovy
repositories {
    maven {
        url 'https://repo.greenadine.dev/releases/'
    }
}

dependencies {
    implementation 'dev.greenadine:pokejava:[VERSION]' // Replace [VERSION] with the desired version
}
```

## Documentation
* [PokéAPI v2 Documentation](https://pokeapi.co/docs/v2)
* [JavaDocs](https://javadocs.greenadine.dev/pokejava/0.1.0/)


## Built with
- [Jackson](https://github.com/FasterXML/jackson) - JSON library
- [OkHttp](https://github.com/square/okhttp) & [Retrofit](https://github.com/square/retrofit) - HTTP client
