class Person{
    String name;
    int age;
    
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("This is from the Person class");
    }
}

class Student extends Person{
    @Override
    public void displayInfo(){
        System.out.println("This is from the Student class");
    }
}
class Teacher extends Student{
    public void displayData(){
        System.out.println("Display the data");
    }
}
public class Main{
    public static void main(String[] args){
        Student s1=new Student();
        s1.displayInfo();
    }
}