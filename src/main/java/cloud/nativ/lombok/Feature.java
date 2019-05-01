package cloud.nativ.lombok;

import lombok.*;

import javax.json.bind.annotation.JsonbPropertyOrder;

/**
 * Lombok Feature POJO.
 */
@JsonbPropertyOrder({"name", "description", "stable"})
@Data
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
@Builder
public class Feature {

    private String name;
    private String description;
    @Builder.Default
    private boolean stable = true;

}
