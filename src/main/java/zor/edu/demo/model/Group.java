package zor.edu.demo.model;

import java.time.LocalDateTime;

public class Group
{
    private String id;
    private String name;
    private String description;
    private Cafedra cafedra;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Group(){

    }
    public Group(String id, String name, String description, Cafedra cafedra, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Group(String name, String description, Cafedra cafedra) {
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
    }

    public Group(String id, String name, String description, Cafedra cafedra) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Cafedra getCafedra() {
        return cafedra;
    }

    public void setCafedra(Cafedra cafedra) {
        this.cafedra = cafedra;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
