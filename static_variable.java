class Mobile{
    String brand;
    int price;
    String network;
    String name;
    //if we do "static string name;" and then if obj1.name = "phone" this will change all the value of name either in obj1 or obj2
    public void show()
    {
        System.out.println(brand + " : " + price + " : "+ name);
    }
}
public class static_variable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "apple";
        obj1.price= 1700;
        obj1.name = "smart phone";
        //Mobile.name="smart phone";//if we use static variable then we will call it using class name

        Mobile obj2 = new Mobile();
        obj2.brand = "samsung";
        obj2.price= 5432;
        obj2.name = "foldable phone";

        obj1.show();
        obj2.show();
        //static method L-38 study again
        //static block L-39 study again
    }
}
