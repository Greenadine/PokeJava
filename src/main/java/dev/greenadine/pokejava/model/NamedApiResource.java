package dev.greenadine.pokejava.model;

public class NamedApiResource extends ApiResource {

    private final String name;

    public NamedApiResource(final int id, final String category, final String name) {
        super(id, category);

        this.name = name;
    }

    /**
     * Gets the name of the resource.
     *
     * @return the name of the resource.
     */
    public String getName() {
        return name;
    }
}
