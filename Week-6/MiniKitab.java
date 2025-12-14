public class MiniKitab extends SmallMarks2D {
    public static void main(String[] args) {

        String[] categories = {"Fiction", "Nepali"};

        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        titles[0][0] = "Asahamati - 5";
        prices[0][0] = 750.0;

        titles[1][0] = "Palpasa Cafe";
        prices[1][0] = 5500.0;
        
        double total = 0.0;
        System.out.println("Mini Kitab Corner\n");
        for (int i = 0; i < categories.length; i++) {
            System.out.println("Category: " + categories[i]);
            System.out.println("Title: " + titles[i][0]);
            System.out.printf("Price: %.2f\n\n", prices[i][0]);
            total += prices[i][0];
        }
        System.out.printf("Total Value: %.2f\n", total);
    }
}