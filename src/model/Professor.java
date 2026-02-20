package model;

import java.util.List;
import java.util.UUID;

public class Professor {
    private UUID id;
    private String name;
    private String department;
    private List<String> courses;

    public Professor(UUID id, String name, String department, List<String> courses) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.courses = courses;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
