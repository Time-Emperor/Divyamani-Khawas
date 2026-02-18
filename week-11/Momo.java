class Momo extends FoodItem{
    Momo(String name, int price, String restaurant, String image){
        super(name, price, restaurant, image);
    }

    @Override
    public void prepare(){
        System.out.println("Momo is preparing");
    }

}
