package de.qaware.qacampus.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.json.bind.annotation.JsonbPropertyOrder;

/**
 * Lombok Feature POJO.
 */
@JsonbPropertyOrder({"name", "description", "stable"})
@ToString(doNotUseGetters = true)
@EqualsAndHashCode(doNotUseGetters = true)
@Getter
@Setter
public class Feature {

    private String name;
    private String description;
    private boolean stable;

    /**
     * Package private default constructor required by CDI.
     */
    Feature() {
    }

    /**
     * Initialize a stable Feature with given attributes.
     *
     * @param name        the feature name
     * @param description the description
     */
    public Feature(String name, String description) {
        this(name, description, true);
    }

    /**
     * Initialize a Feature with attributes.
     *
     * @param name        the feature name
     * @param description the description
     * @param stable      is feature stable
     */
    public Feature(String name, String description, boolean stable) {
        this.name = name;
        this.description = description;
        this.stable = stable;
    }

}
