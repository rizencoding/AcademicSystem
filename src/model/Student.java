package model;

import java.util.List;
import java.util.UUID;

public class Student {
    private UUID id;
    private String name;
    private String email;
    private List<String> matriculas;

    public Student(UUID id, String name, String email, List<String> matriculas) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.matriculas = matriculas;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<String> matriculas) {
        this.matriculas = matriculas;
    }
}
