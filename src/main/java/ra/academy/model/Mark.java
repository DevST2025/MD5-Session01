package ra.academy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Mark {
    @EmbeddedId
    @JsonIgnore
    private MarkId markId;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "studentId")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @MapsId("subjectId")
    @JoinColumn(name = "subjectId")
    @JsonIgnore
    private Subject subject;

    private Double point;

    public Mark() {
    }

    public Mark(MarkId markId, Student student, Subject subject, Double point) {
        this.markId = markId;
        this.student = student;
        this.subject = subject;
        this.point = point;
    }

    public MarkId getMarkId() {
        return markId;
    }

    public void setMarkId(MarkId markId) {
        this.markId = markId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }
}
