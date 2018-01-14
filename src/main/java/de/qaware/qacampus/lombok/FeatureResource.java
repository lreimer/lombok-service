package de.qaware.qacampus.lombok;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;
import java.util.logging.Logger;

@RequestScoped
@Path("features")
public class FeatureResource {

    private static final Logger LOGGER = Logger.getLogger(FeatureResource.class.getName());

    private FeatureRepository repository;

    /**
     * Default constructor.
     */
    FeatureResource() {
    }

    @Inject
    public FeatureResource(final FeatureRepository repository) {
        this.repository = repository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFeatures() {
        LOGGER.info("Getting all features.");

        Collection<Feature> features = repository.findAll();
        return Response.ok(features).build();
    }

}
