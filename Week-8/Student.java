class Student
{
    String name;
    String studentID;
    int age;
    String course;
    double grade;
    public Student(String name,String studentID,int age,String course,double grade){
        this.name=name;
        this.studentID=studentID;
        this.age=age;
        this.course=course;
        this.grade=grade;
    }
    public boolean isAdult(){
        return age>=18;
    }
    public void updateGrade(double grade){
        this.grade=grade;
    }
    public void displayInfo(){
        System.out.println("name: "+name);
        System.out.println("studentID: "+studentID);
        System.out.println("age: "+age);
        System.out.println("course: "+course);
        System.out.println("grade: "+grade);
    }
    public static void main(String[] args){
        Student s1=new Student("Biraj Shrestha","BS664T",17,"BIT",3.5);
        s1.updateGrade(3.6);
        s1.displayInfo();
        System.out.println(s1.isAdult());
        System.out.println();
        System.out.println("-----------------------------------------------");
        Student s2=new Student("Yodin Raya","YS8759",19,"BIT",3.2);
        s2.updateGrade(3.3);
        s2.displayInfo();
        System.out.println(s2.isAdult());
        System.out.println();
        System.out.println("-----------------------------------------------");
        Student s3=new Student("Divyamani Khawas","DS6467",19,"BIT",3.1);
        s3.updateGrade(3.2);
        s3.displayInfo();
        System.out.println(s3.isAdult());
        System.out.println();
        System.out.println("-----------------------------------------------");

        
    }
}