class Book{
    String title;
    String author;
    String ISBN;
    int publicationYear;
    String genre;
    boolean availibilityStatus;
    public Book(String title,String author,String ISBN,int publicationYear,String genre,boolean availibilityStatus){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.publicationYear=publicationYear;
        this.genre=genre;
        this.availibilityStatus=availibilityStatus;
    }
    public void display() {
        System.out.println("Title: " + title+ " |Author: " + author + " | Year: " + publicationYear + " | Available: " + availibilityStatus);
        } 
    public static void main(String[] args){
        Book bo1=new Book("Martial Peak","Momo","2445566795",2012,"Wuxia/Xianxia",false);
        Book bo2=new Book("Perfect World","Chen Dong","9787556204250",2013,"Action/Xianxia",true);
        Book bo3=new Book("Shadow Slave","Guiltythree","2465573795",2022,"Dark Fantasy",true);
        System.out.println("--------------------------------------------------------|");
        System.out.println(bo1.title+"|"+bo1.author+"|"+bo1.ISBN+"|"+bo1.publicationYear+""+bo1.genre);
        System.out.println("--------------------------------------------------------|");
        System.out.println(bo2.title+"|"+bo2.author+"|"+bo2.ISBN+"|"+bo2.publicationYear+""+bo2.genre);
        System.out.println("--------------------------------------------------------|");
        System.out.println(bo3.title+"|"+bo3.author+"|"+bo3.ISBN+"|"+bo3.publicationYear+""+bo3.genre);
        System.out.println("--------------------------------------------------------|");
        Book[] library = {bo1, bo2, bo3};
         System.out.println("--- ALL BOOKS ---");
        for (Book b : library) {
            b.display();
        }
          System.out.println("\n--- AVAILABLE BOOKS ---");
        for (Book b : library) {
            if (b.availibilityStatus == true) {
                b.display();
            }
        }
          System.out.println("\n--- UNAVAILABLE BOOKS ---");
        for (Book b : library) {
            if (b.availibilityStatus == false) {
                b.display();
            }
        }
            System.out.println("\n--- AVAILABLE & NEWER THAN 2000 ---");
        for (Book b : library) {
            if (b.availibilityStatus == true && b.publicationYear > 2000) {
                b.display();
            }
        }
    }
}
