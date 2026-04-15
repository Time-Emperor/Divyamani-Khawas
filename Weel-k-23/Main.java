import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Main{
    public static void main(String[] args){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("c3.txt"))) {
            bw.write("Hello World!");
            bw.newLine();
            bw.write("I am Divyamani Khawas");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}