package eu.crystal.system;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @JsonProperty("<Name>")
    private String name;
    @JsonProperty("<Age>")
    private int age;
}
