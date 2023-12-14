package ex2;

import java.util.List;

public class Student {

    List<Pair<String, Integer>> course;
    private String name;
    private String university;

    public List<Pair<String, Integer>> getCourse() {
        return course;
    }

    public Student(String name, String university, List<Pair<String, Integer>> course) {
        this.course = course;
        this.name = name;
        this.university = university;
    }

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
