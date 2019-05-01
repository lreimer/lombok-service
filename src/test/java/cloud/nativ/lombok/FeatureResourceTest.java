package cloud.nativ.lombok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 test case for the {@link FeatureResource}.
 */
class FeatureResourceTest {

    private FeatureResource resource;
    private FeatureRepository repository;

    @BeforeEach
    void setUp() {
        repository = new FeatureRepository();
        repository.initialize();

        resource = new FeatureResource(repository);
    }

    @Test
    void getFeatures() {
        Response response = resource.getFeatures();

        assertNotNull(response, "There should be a non-null response.");
        assertEquals(200, response.getStatus(), "The status should be 200.");
        assertIterableEquals(repository.findAll(), (Iterable<?>) response.getEntity());
    }
}