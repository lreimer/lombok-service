package cloud.nativ.lombok;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.logging.Logger;

/**
 * An in-memory repository implementation for Lombok features.
 */
@ApplicationScoped
public class FeatureRepository {

    private static final Logger LOGGER = Logger.getLogger(FeatureRepository.class.getName());

    private final Set<Feature> features = new LinkedHashSet<>();

    /**
     * Package private default constructor.
     */
    FeatureRepository() {
    }

    /**
     * Initialize the in-memory data for this repository.
     */
    @PostConstruct
    void initialize() {
        features.add(new Feature("val", "Finally! Hassle-free final local variables."));
        features.add(new Feature("@NonNull", "or: How I learned to stop worrying and love the NullPointerException."));
        features.add(new Feature("@Cleanup", "Automatic resource management: Call your close() methods safely with no hassle."));
        features.add(new Feature("@Getter", "Never write public int getFoo() {return foo;} again."));
        features.add(new Feature("@Setter", "Never write public void setFoo(int foo) {this.foo = foo;} again."));
        features.add(new Feature("@ToString", "No need to start a debugger to see your fields: Just let lombok generate a toString for you!"));
        features.add(new Feature("@EqualsAndHashCode", "Equality made easy: Generates hashCode and equals implementations from the fields of your object."));
        features.add(new Feature("@NoArgsConstructor", "Constructors made to order: Generates constructors that take no arguments."));
        features.add(new Feature("@RequiredArgsConstructor", "Constructors made to order: Generates constructors that take one argument per final / non-null field."));
        features.add(new Feature("@AllArgsConstructor", "Constructors made to order: Generates constructors that take one argument for every field."));
        features.add(new Feature("@Data", "All together now: A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, and @Setter on all non-final fields, and @RequiredArgsConstructor!"));
        features.add(new Feature("@Value", "Immutable classes made very easy."));
        features.add(new Feature("@Builder", "... and Bob's your uncle: No-hassle fancy-pants APIs for object creation!"));
        features.add(new Feature("@SneakyThrows", "To boldly throw checked exceptions where no one has thrown them before!"));
        features.add(new Feature("@Synchronized", "synchronized done right: Don't expose your locks."));
        features.add(new Feature("@Getter(lazy=true)", "Laziness is a virtue!"));
        features.add(new Feature("@Log", "Captain's Log, stardate 24435.7: \"What was that line again?\""));
    }

    /**
     * Finds and returns all Lombok features.
     *
     * @return the unmodifiable view on features
     */
    public Collection<Feature> findAll() {
        LOGGER.info("Finding all Lombok features.");
        return Collections.unmodifiableCollection(features);
    }
}
