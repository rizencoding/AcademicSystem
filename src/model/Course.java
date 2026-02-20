package model;

import java.util.List;
import java.util.UUID;

public class Course {
    private UUID id;
    private String name;
    private int workload;
    private Professor responsibleTeacher;
    private List<Student> students;

    public Course(UUID id, String name, int workload, Professor responsibleTeacher, List<Student> students) {
        this.id = id;
        this.name = name;
        this.workload = workload;
        this.responsibleTeacher = responsibleTeacher;
        this.students = students;
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

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public Professor getResponsibleTeacher() {
        return responsibleTeacher;
    }

    public void setResponsibleTeacher(Professor responsibleTeacher) {
        this.responsibleTeacher = responsibleTeacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
