class Student
{
    String name;
    String studentID;
    int age;
    String course;
    public Student(String name,String studentID,int age,String course){
        this.name=name;
        this.studentID=studentID;
        this.age=age;
        this.course=course;
    }
    public static void main(String[] args){
        Student s1=new Student("Biraj Shrestha","BS664T",17,"BIT");
        Student s2=new Student("Yodin Raya","YS8759",19,"BIT");
        Student s3=new Student("Divyamani Khawas","DS6467",19,"BIT");
        System.out.println("--------------------------------------------------------|");
        System.out.println(s1.name+"  | "+s1.studentID+"  |  "+s1.age+" |  "+s1.course);
        System.out.println("--------------------------------------------------------|");
        System.out.println(s2.name+"  | "+s2.studentID+"  |  "+s2.age+" |  "+s2.course);
        System.out.println("--------------------------------------------------------|");
        System.out.println(s3.name+"  | "+s3.studentID+"  |  "+s3.age+" |  "+s3.course);
        System.out.println("--------------------------------------------------------|");
    }
}
