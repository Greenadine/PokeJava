# PokéJava ![](https://img.shields.io/badge/version-0.1.0-blue?style=flat-square) ![](https://img.shields.io/github/license/Greenadine/PokeJava?style=flat-square)
A Java 16+ wrapper for the PokéAPI. This wrapper is still a work in progress, and does not yet support all data provided by the PokéAPI.

Currently supported endpoints:
- [x] [Abilities](https://pokeapi.co/docs/v2#abilities)
- [x] [Characteristics](https://pokeapi.co/docs/v2#characteristics)
- [x] [Egg Groups](https://pokeapi.co/docs/v2#egg-groups)
- [x] [Genders](https://pokeapi.co/docs/v2#genders)
- [x] [Growth rates](https://pokeapi.co/docs/v2#growth-rates)
- [x] [Pokéathlon Stats](https://pokeapi.co/docs/v2#pokeathlon-stats)
- [x] [Pokémon](https://pokeapi.co/docs/v2#pokemon)
- [x] [Pokémon Species](https://pokeapi.co/docs/v2#pokemon-species)
- [x] [Pokémon Forms](https://pokeapi.co/docs/v2#pokemon-forms)
- [x] [Pokémon Shapes](https://pokeapi.co/docs/v2#pokemon-shapes)
- [x] [Pokémon Habitats](https://pokeapi.co/docs/v2#pokemon-habitats)
- [x] [Pokémon Colors](https://pokeapi.co/docs/v2#pokemon-colors)
- [x] [Moves](https://pokeapi.co/docs/v2#moves)
- [x] [Move Categories](https://pokeapi.co/docs/v2#move-categories)
- [x] [Move Targets](https://pokeapi.co/docs/v2#move-targets)
- [x] [Move Ailments](https://pokeapi.co/docs/v2#move-ailments)
- [x] [Move Battle Styles](https://pokeapi.co/docs/v2#move-battle-styles)
- [x] [Move Damage Classes](https://pokeapi.co/docs/v2#move-damage-classes)
- [x] [Move Learn Methods](https://pokeapi.co/docs/v2#move-learn-methods)
- [x] [Natures](https://pokeapi.co/docs/v2#natures)
- [x] [Stats](https://pokeapi.co/docs/v2#stats)
- [x] [Types](https://pokeapi.co/docs/v2#types)

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
        <version>0.1.0</version>
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
    implementation 'dev.greenadine:pokejava:0.1.0'
}
```

## Documentation
* Coming soon
* [JavaDocs](https://javadocs.greenadine.dev/pokejava/0.1.0/)

## Built with
- [Jackson](https://github.com/FasterXML/jackson) - JSON library
- [OkHttp](https://github.com/square/okhttp) & [Retrofit](https://github.com/square/retrofit) - HTTP client
