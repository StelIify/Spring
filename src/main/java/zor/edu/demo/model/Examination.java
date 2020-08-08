package zor.edu.demo.model;

import java.time.LocalDateTime;

public class Examination
{
    private String id;
    private Student student;
    private int grade;
    private String subject;
    private LocalDateTime date;
    private Teacher teacher;
    private LocalDateTime createdAt, updatedAt;

    public Examination(){

    }

    public Examination(String id, Student student, int grade, String subject,
                       LocalDateTime date, Teacher teacher, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.student = student;
        this.grade = grade;
        this.subject = subject;
        this.date = date;
        this.teacher = teacher;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Examination(Student student, int grade, String subject, LocalDateTime date, Teacher teacher) {
        this.student = student;
        this.grade = grade;
        this.subject = subject;
        this.date = date;
        this.teacher = teacher;
    }

    public Examination(String id, Student student, int grade, String subject, LocalDateTime date, Teacher teacher) {
        this.id = id;
        this.student = student;
        this.grade = grade;
        this.subject = subject;
        this.date = date;
        this.teacher = teacher;
    }
}
