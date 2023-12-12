package ra.academy.dto;

import ra.academy.model.Subject;

public class SubjectDto {
    private String subjectId;
    private String subjectName;
    private Integer priority;

    public SubjectDto() {
    }

    public SubjectDto(Subject subject) {
        this.subjectId = subject.getSubjectId();
        this.subjectName = subject.getSubjectName();
        this.priority = subject.getPriority();
    }

    public SubjectDto(String subjectId, String subjectName, Integer priority) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.priority = priority;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
