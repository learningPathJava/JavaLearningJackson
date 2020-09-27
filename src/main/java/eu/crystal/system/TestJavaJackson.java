package eu.crystal.system;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJavaJackson {
    
    public static void main(String[] args) throws JsonProcessingException {

        // Serialize
        Person serializePerson =
                Person.builder()
                        .name("John")
                        .age(20)
                .build();

        ObjectMapper objectMapper = new ObjectMapper();

        String jsonString = objectMapper.writeValueAsString(serializePerson);
        System.out.println(jsonString);

        // Deserialize
        Person deserializedPerson = objectMapper.readValue(jsonString, Person.class);
        System.out.println("Name Value: " + deserializedPerson.getName());
        System.out.println("Age Value: " + deserializedPerson.getAge());
    }
}
