public class GymMemberNepal {
    //Attributes
    private String memberName;
    private String membershipType;
    private double monthlyFee;
    private String joinDate;
    private int monthsSinceJoined;
    //Constructor to initialize all attributes
    public GymMemberNepal(String name, String type, double fee, String date, int months) {
        this.memberName = name;
        this.membershipType = type;
        this.monthlyFee = fee;
        this.joinDate = date;
        this.monthsSinceJoined = months;
    }
    // Calculate yearly cost with 13% VAT
    public double calculateAnnualFee() {
        double yearly = monthlyFee * 12;
        return yearly + (yearly * 0.13);
    }
    // Returns discounted monthly fee for students/seniors
    public double getDiscountedFee(double discountPercent) {
        return monthlyFee - (monthlyFee * discountPercent / 100);
    }
    // Returns true if member for more than 6 months <Loyality Discount>
    public boolean isEligibleForDiscount() {
        return monthsSinceJoined > 6;
    }
    // Displays the formatted member details in Nepali style
    public void displayMemberInfo() {
        System.out.println("--- Fitness Nepal Gym ---");
        System.out.println("Member: " + memberName);
        System.out.println("Type: " + membershipType);
        System.out.println("Joined: " + joinDate);
        System.out.println("Monthly Fee: Rs. " + monthlyFee);
        System.out.println("Months as Member : " + monthsSinceJoined);
        System.out.println("Eligible for Discount: " + isEligibleForDiscount());
        System.out.println("Annual Fee (with VAT): Rs. " + calculateAnnualFee());
        System.out.println();
    }
    // Test Programs
    public static void main(String[] neo) {
         // Creates 3 members with different membership types       
        GymMemberNepal GM1 = new GymMemberNepal("Yodin Raya", "Monthly", 1500, "2023-10-10", 2);
        GymMemberNepal GM2 = new GymMemberNepal("Divyamani Khawas", "Quarterly", 2500, "2022-05-12", 18);
        GymMemberNepal GM3 = new GymMemberNepal("Biraj Shrestha", "Yearly", 4000, "2023-01-20", 11);          
        GM1.displayMemberInfo();
        GM2.displayMemberInfo();
        GM3.displayMemberInfo();
    }
}