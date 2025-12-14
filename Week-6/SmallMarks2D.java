public class SmallMarks2D{
    public static void main(String[] args){
        int[][] marks = { {80,75},{90,85} };
        System.out.println("Marks Table:");
        System.out.println("Student S.N\tNepali\tEnglish");
        for (int i = 0; i < marks.length; i++){
            int total = 0;
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];
            }
             System.out.println("Total: " + total);
        }
    }
}