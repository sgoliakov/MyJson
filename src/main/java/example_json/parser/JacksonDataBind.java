package example_json.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import example_json.entity.Person;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {
    public static void parseJson(String path) {
        ObjectMapper mapper = new ObjectMapper();
        Person person = null;
        try {
             person = mapper.readValue(new File(path), Person.class);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(person);
        System.out.println(person.getLastName());

    }
}
