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
    public static void main(String[] args){
        Book b1=new Book("Martial Peak","Momo","2445566795",2012,"Wuxia/Xianxia",false);
        Book b2=new Book("Perfect World","Chen Dong","9787556204250",2013,"Action/Xianxia",true);
        Book b3=new Book("Shadow Slave","Guiltythree","2465573795",2022,"Dark Fantasy",true);
        System.out.println("--------------------------------------------------------|");
        System.out.println(b1.title+"|"+b1.author+"|"+b1.ISBN+"|"+b1.publicationYear+""+b1.genre);
        System.out.println("--------------------------------------------------------|");
        System.out.println(b2.title+"|"+b2.author+"|"+b2.ISBN+"|"+b2.publicationYear+""+b2.genre);
        System.out.println("--------------------------------------------------------|");
        System.out.println(b3.title+"|"+b3.author+"|"+b3.ISBN+"|"+b3.publicationYear+""+b3.genre);
        System.out.println("--------------------------------------------------------|");
    }
}
