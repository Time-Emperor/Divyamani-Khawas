package workshop;

public class Student {
    private final String studentId;
    private final String name;
    private final String course;
    private final String gender;
    private final String ExpireDate;
    private final String CollegeName;
    public Student(String studentId, String name, String course, String gender, String ExpireDate, String CollegeName) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.gender = gender;
        this.ExpireDate=ExpireDate;
        this.CollegeName=CollegeName;
    }
public String getname() {
        return name;
    }
    public String toHtmlCard() {
        // formated text for Jlabel
        return "<html>"+
        "<h1>Student ID Card</h1>" +
                "<b>StudentID:</b> " + studentId + "<br>" +
                "<b>Name:</b> " + name + "<br>" +
                "<b>Course:</b> " + course + "<br>" +
                "<b>Gender:</b> " + gender + "<br>" +
                "<b>Expire Date:</b>" + ExpireDate + "<br>" +
                "<b>College Name:</b>" + CollegeName + "<br>"
        + "</html>";
    }

}
