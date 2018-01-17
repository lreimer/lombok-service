package de.qaware.qacampus.lombok;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
