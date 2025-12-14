public class MiniSeating {
    public static void main(String[] args){
        String[][] seats = new String[2][3];
        seats[0][0] = "Biraj";
        seats[0][1] = "Divyamani";
        seats[0][2] = "Yodin";
        System.out.println("Seating Chart: ");
        for (int i = 0; i<seats.length; i++){
            System.out.print("Row " + (i+1) + ": ");
            for(int j = 0; j<seats[i].length; j++){
                if (seats[i][j] == null || seats[i][j].equals("")) {
                    System.out.print("[empty] ");
                } else {
                    System.out.print("[" + seats[i][j] + "] ");
                 }
             }
                System.out.println();
            }
        }
    } 