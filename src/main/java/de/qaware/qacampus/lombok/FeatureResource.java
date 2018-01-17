package de.qaware.qacampus.lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.logging.Logger;

/**
 * The REST resource implementation for Lombok features.
 */
@RequestScoped
@Path("features")
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor(onConstructor = @__({@Inject}))
public class FeatureResource {

    private static final Logger LOGGER = Logger.getLogger(FeatureResource.class.getName());

    private FeatureRepository repository;

    /**
     * Get the list of features as JSON.
     *
     * @return list if features with status 200
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFeatures() {
        LOGGER.info("Getting all features.");

        Collection<Feature> features = repository.findAll();
        return Response.ok(features).build();
    }

}
