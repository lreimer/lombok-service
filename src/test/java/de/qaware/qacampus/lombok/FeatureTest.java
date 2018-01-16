package de.qaware.qacampus.lombok;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * JUnit 5 test case for the {@link Feature} POJO.
 */
class FeatureTest {

    @Test
    @DisplayName("Check hashCode() / equals() contract")
    void hashCodeEquals() {
        Feature f1 = createFeature("name", "description", true);
        Feature f2 = createFeature("name", "description");

        assertEquals(f1, f1);
        assertEquals(f1, f2);

        assertFalse(f1.equals(null));
        assertFalse(f1.equals("something"));

        assertEquals(f1.hashCode(), f1.hashCode());
        assertEquals(f1.hashCode(), f2.hashCode());

        assertEquals(f1.toString(), f2.toString());
    }

    private Feature createFeature(String name, String description, boolean stable) {
        Feature f = new Feature();
        f.setName(name);
        f.setDescription(description);
        f.setStable(stable);

        return f;
    }

    private Feature createFeature(String name, String description) {
        return new Feature(name, description);
    }
}