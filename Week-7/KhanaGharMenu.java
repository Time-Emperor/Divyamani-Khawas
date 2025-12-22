public class KhanaGharMenu
{
    String itemName;
    double price;
    String category;
    boolean isVegetarian;
    boolean isAvailable;
    int spiceLevel;
    public KhanaGharMenu(String itemName, double price, String category, boolean isVegetarian, boolean isAvailable, int spiceLevel){
        this.itemName=itemName;
        this.price=price;
        this.category=category;
        this.isVegetarian=isVegetarian;
        this.isAvailable=isAvailable;
        this.spiceLevel=spiceLevel;
    }
    public void displayItem(){
        String vegStatus = isVegetarian? "Veg" : "Non-Veg";
        String availablity = isAvailable ? "Yes" : "No";
        System.out.println("ItemName: " + itemName + "|Price: " + price + "|Category: " + category +"|IsVegetarian: " + isVegetarian + "|IsAvailable: " + isAvailable + "|SpiceLevel: " + spiceLevel);         
    }
    public static void main(String[] args){
        KhanaGharMenu[] menu = {
            new KhanaGharMenu("Dal-Bhat chaubise Set",150,"Dal-Bhat",true,true,2),
             new KhanaGharMenu("Buff Mo:MO",120,"Mo:Mo",false,true,1),
              new KhanaGharMenu("Chiura Masu",130,"Khaja",false,true,2),
               new KhanaGharMenu("Veg-Thupa",50,"Thupa",true,true,1),
                new KhanaGharMenu("Chicken Roll",100,"Roll",false,true,1),
                 new KhanaGharMenu("Sekwa",200,"Masu",false,true,2),
                  new KhanaGharMenu("Masla chiya",20,"Chiya",true,true,1)
        };
        System.out.println("--Full Menu: Khana Ghar, Dharan--");
        for (KhanaGharMenu item : menu)item.displayItem();
        
        System.out.println("--Vegetarian Item Only--");
        for (KhanaGharMenu item : menu){
            if (item.isVegetarian)item.displayItem();
        }
        System.out.println("--Non-Vegetarian Item Only--");
        for (KhanaGharMenu item : menu){
            if (!item.isVegetarian)item.displayItem();
        }
        System.out.println("--Premium Available Non-Vegetarian(price>100)--");
        for (KhanaGharMenu item : menu){
            if (!item.isVegetarian && item.price>100 && item.isAvailable)item.displayItem();
        }
        System.out.println("--Affortable Available Vegetarian(price<50)--");
        for (KhanaGharMenu item : menu){
            if (item.isVegetarian && item.price<50 && item.isAvailable)item.displayItem();
        }
    }
}