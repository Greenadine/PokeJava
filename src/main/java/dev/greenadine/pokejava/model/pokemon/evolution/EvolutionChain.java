package dev.greenadine.pokejava.model.pokemon.evolution;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourceCategory;
import dev.greenadine.pokejava.model.common.resource.ApiResource;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents an evolution chain.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@ResourceCategory("evolution-chain")
public class EvolutionChain extends ApiResource {

    private final NamedApiResource item;
    private final ChainLink chain;

    public EvolutionChain(@JsonProperty("id") int id,
                          @JsonProperty("baby_trigger_item") NamedApiResource item,
                          @JsonProperty("chain") ChainLink chain) {
        super(id);

        this.item = item;
        this.chain = chain;
    }

    /**
     * Gets the item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
     *
     * @return the item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
     */
    public NamedApiResource getItem() {
        return item;
    }

    /**
     * Gets the base chain link object. Each link contains evolution details for a Pokémon in the chain.
     *
     * @return the base chain link object. Each link contains evolution details for a Pokémon in the chain.
     */
    public ChainLink getChain() {
        return chain;
    }
}
