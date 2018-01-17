package de.qaware.qacampus.lombok;

import lombok.*;

import javax.json.bind.annotation.JsonbPropertyOrder;

/**
 * Lombok Feature POJO.
 */
@JsonbPropertyOrder({"name", "description", "stable"})
@ToString(doNotUseGetters = true)
@EqualsAndHashCode(doNotUseGetters = true)
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
public class Feature {

    private String name;
    private String description;
    private boolean stable = true;

}
