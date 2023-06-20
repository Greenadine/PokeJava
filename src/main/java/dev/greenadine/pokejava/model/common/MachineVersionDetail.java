package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.ApiResource;

/**
 * Machine version detail lists the version group and the specific machine.
 *
 * @param machine the machine that teaches a move from an item.
 * @param versionGroup the version group of this specific machine.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record MachineVersionDetail(@JsonProperty("machine") ApiResource machine,
                                   @JsonProperty("version_group") ApiResource versionGroup) {
}
