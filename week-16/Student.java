
public class Student { // class

    // instance variable
    private String name;
    private int age;
    private String school;
    private int grade;
    private String citizenship;
    private String phone;

    // Constructor
    public Student(String name, int age, String school, int grade, String citizenship, String phone) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.grade = grade;
        this.citizenship = citizenship;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // first characters

    public String getNameInitials() {
        String[] firstChar = name.split(" ");
        String initialChar = "";
        for (String s : firstChar) {

            initialChar += s.charAt(0);

        }
        return initialChar;
    }

    public String toString() {
        return String.format("format: %-22s | %2d | Grade %2d | %s",
                name, age, grade, school);
    }

}