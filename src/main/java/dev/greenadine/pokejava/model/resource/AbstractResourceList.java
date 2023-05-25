package dev.greenadine.pokejava.model.resource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Represents a list of resources from the API.
 *
 * @param <T> the type of {@link Resource}s in the list.
 */
public abstract class AbstractResourceList<T extends Resource> implements ResourceList<T> {

    private final int count;
    private final String next;
    private final String previous;
    private final List<T> results;

    protected AbstractResourceList(int count, String next, String previous, List<T> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    @Nullable
    public String getNext() {
        return next;
    }

    @Override
    @Nullable
    public String getPrevious() {
        return previous;
    }

    @Override
    @NotNull
    public List<T> getResults() {
        return results;
    }
}
