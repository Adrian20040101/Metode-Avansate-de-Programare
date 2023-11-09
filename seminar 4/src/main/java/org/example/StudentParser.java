package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StudentParser {
    List<Student> students = new ArrayList<>();

    BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

    ObjectMapper mapper = new ObjectMapper();

    JsonNode root = mapper.readTree(bufferedReader);

        for (JsonNode studentNode: root.path("students")) {
        Student student = new Student();
        Address address = new Address();

        student.setId(studentNode.path("id").asInt());
        student.setName(studentNode.path("name").asText());
        student.setUni(studentNode.path("uni").asText());

        JsonNode addressNode = studentNode.get("address");
        address.setCity(addressNode.path("city").asText());
        address.setStreet(addressNode.path("street").asText());

        student.setAddress(address);
        students.add(student);
    }

        return students;
}
