package dev.greenadine.pokejava.annotation;

/**
 * Represents a category of an {@link dev.greenadine.pokejava.model.ApiResource}.
 *
 * @since 0.1.0
 * @see dev.greenadine.pokejava.model.Resource
 * @see dev.greenadine.pokejava.model.ApiResource
 * @see dev.greenadine.pokejava.model.NamedApiResource
 * @author Greenadine
 */
public @interface Category {
    String value();
}
