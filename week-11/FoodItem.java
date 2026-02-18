abstract class FoodItem
{//abstract class banako
    String name;
    int price;
    String restaurant;
    String image;
    
    FoodItem(String name, int price, String restaurant, String image){
        this.name = name;
        this.price = price;
        this.restaurant = restaurant;
        this.image = image;
    }

    public abstract void prepare();

    public void display(){
        System.out.println("Name: " + name + " | Price: " + price + " | Restaurant: " + restaurant);
    }
}
