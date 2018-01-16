package de.qaware.qacampus.lombok;

import javax.json.bind.annotation.JsonbPropertyOrder;
import java.util.Objects;

/**
 * Lombok Feature POJO.
 */
@JsonbPropertyOrder({"name", "description", "stable"})
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
        this.name = name;
        this.description = description;
        this.stable = true;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isStable() {
        return stable;
    }

    public void setStable(boolean stable) {
        this.stable = stable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Feature feature = (Feature) o;
        return stable == feature.stable &&
                Objects.equals(name, feature.name) &&
                Objects.equals(description, feature.description);
    }

    @Override
    public String toString() {
        return "Feature{" + "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", stable=" + stable + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, stable);
    }

}
