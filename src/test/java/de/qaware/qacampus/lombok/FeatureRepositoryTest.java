package de.qaware.qacampus.lombok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * JUnit 5 test case for our {@link FeatureRepository}.
 */
class FeatureRepositoryTest {

    private FeatureRepository repository;

    @BeforeEach
    void setUp() {
        repository = new FeatureRepository();
        repository.initialize();
    }

    @Test
    @DisplayName("Find all Lombok features.")
    void findAll() {
        Collection<Feature> features = repository.findAll();

        assertFalse(features.isEmpty(), "Features should not be empty.");
        assertTrue(features.size() > 1, "There should be more than one feature.");
    }
}