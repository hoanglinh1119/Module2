package DeadLine;

import java.io.Serializable;
import java.util.Comparator;

public class StudentObjects implements Serializable {
    private String Id;
    private String Name;
    private String Email;
    private String course;
    private String status;
    private String score;
    public StudentObjects(){

    }

    public StudentObjects(String Id, String Name, String Email, String course, String status, String score){
        this.Id=Id;
        this.Name=Name;
        this.Email=Email;
        this.course= course;
        this.status=status;
        this.score=score;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
