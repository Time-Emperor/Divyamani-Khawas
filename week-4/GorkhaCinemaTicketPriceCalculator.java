import java.util.Scanner;

public class GorkhaCinemaTicketPriceCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("   Welcome to XFX Cinema, Dharan!");
        System.out.println("   Automated Ticket Calculation System");
        System.out.println("=========================================\n");

        System.out.println("Select Age Group:");
        System.out.println("1. Child");
        System.out.println("2. Adult");
        System.out.println("3. Senior");
        System.out.print("Enter your choice (1-3): ");
        int ageChoice = scanner.nextInt();
        
        System.out.println("\nSelect Movie Language:");
        System.out.println("1. Nepali");
        System.out.println("2. Hindi");
        System.out.println("3. English");
        System.out.print("Enter your choice (1-3): ");
        int languageChoice = scanner.nextInt();

        System.out.print("\nAre you a student with valid ID? (yes/no): ");
        String studentInput = scanner.next();
        boolean isStudent = studentInput.equalsIgnoreCase("yes") || 
                           studentInput.equalsIgnoreCase("y");
   
        System.out.print("Is it a festival day? (yes/no): ");
        String festivalInput = scanner.next();
        boolean isFestival = festivalInput.equalsIgnoreCase("yes") || 
                            festivalInput.equalsIgnoreCase("y");
        
        double basePrice = 0.0;
        String ageGroup = "";
        
        if (ageChoice == 1) {
            basePrice = 150.0;
            ageGroup = "Child";
        } else if (ageChoice == 2) {
            basePrice = 250.0;
            ageGroup = "Adult";
        } else if (ageChoice == 3) {
            basePrice = 200.0;
            ageGroup = "Senior";
        } else {
            System.out.println("\nInvalid age group selection!");
            scanner.close();
            return;
        }
        
 
        double surcharge = 0.0;
        String language = "";
        
        if (languageChoice == 1) {
            surcharge = 0.0;
            language = "Nepali";
        } else if (languageChoice == 2) {
            surcharge = 50.0;
            language = "Hindi";
        } else if (languageChoice == 3) {
            surcharge = 100.0;
            language = "English";
        } else {
            System.out.println("\nInvalid language selection!");
            scanner.close();
            return;
        }
        
 
        double priceAfterSurcharge = basePrice + surcharge;
        
 
        double studentDiscount = 0.0;
        double priceAfterStudent = priceAfterSurcharge;
        
        if (isStudent) {
            studentDiscount = priceAfterSurcharge * 0.20;
            priceAfterStudent = priceAfterSurcharge - studentDiscount;
        }
        
        double festivalDiscount = 0.0;
        double finalPrice = priceAfterStudent;
        
        if (isFestival) {
            festivalDiscount = priceAfterStudent * 0.15;
            finalPrice = priceAfterStudent - festivalDiscount;
        }
 
        System.out.println("\n=========================================");
        System.out.println("        TICKET PRICE BREAKDOWN");
        System.out.println("=========================================");
        System.out.println("Age Group: " + ageGroup);
        System.out.println("Movie Language: " + language);
        System.out.println("\nBase Price (Nepali Movie): Rs. " + basePrice);
        
        if (surcharge > 0) {
            System.out.println("Language Surcharge: Rs. " + surcharge);
            System.out.println("Price after Surcharge: Rs. " + priceAfterSurcharge);
        }
        
        if (isStudent) {
            System.out.println("\nStudent Discount (20%): -Rs. " + 
                             String.format("%.2f", studentDiscount));
            System.out.println("Price after Student Discount: Rs. " + 
                             String.format("%.2f", priceAfterStudent));
        }
        
        if (isFestival) {
            System.out.println("\nFestival Discount (15%): -Rs. " + 
                             String.format("%.2f", festivalDiscount));
        }
        
        System.out.println("\n-----------------------------------------");
        System.out.println("FINAL TICKET PRICE: Rs. " + 
                         String.format("%.2f", finalPrice));
        System.out.println("-----------------------------------------");
        System.out.println("\nThank you for choosing XFX Cinema!");
        System.out.println("Enjoy your movie!");
        System.out.println("=========================================\n");
        
        scanner.close();
    }
}