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
        Feature f1 = Feature.builder().name("name").description("description").stable(true).build();
        Feature f2 = Feature.builder().name("name").description("description").build();

        assertEquals(f1, f1);
        assertEquals(f1, f2);

        assertFalse(f1.equals(null));
        assertFalse(f1.equals("something"));

        assertEquals(f1.hashCode(), f1.hashCode());
        assertEquals(f1.hashCode(), f2.hashCode());

        assertEquals(f1.toString(), f2.toString());
    }

}