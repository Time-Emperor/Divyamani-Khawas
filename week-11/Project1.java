import java.util.ArrayList;
public class Project1{
public static void main(String[] args){
ArrayList <String> names = new ArrayList<>();


names.add("Biraj");
names.add("Yodin");
names.add("Divyamani");

System.out.println(names.get(1));
names.remove(2);

names.indexOf("Biraj");
names.contains("Yodin");
names.isEmpty();
System.out.println(names);

}
}