package oop_java;
// inheritance is the property of acquiring properties of one class into another
//use cases:-

//method overriding
//reuse the code and reduce duplication 
//Class childClass extends parentClass

// class ParentClass{
//     void display(){
//         System.out.println("Parent class method");
//     }
// }
// class childClass extends parentClass{
//     void show(){
//         System.out.println("child class method");
//     }
// }
// public class inheritance {
//     public static void main(String[] args) {
//         childClass child1 = new childClass();
//         child1.display();//parent class method aceeseed through object of child class
//         child1.show();//child class method
//     }
    
// }


class Vehicle{
    double price;
    double milage;
    String color;
    void display(){
        System.out.println(price);
        System.out.println(milage);
        System.out.println(color);
    }
}

class car extends Vehicle{
    String ftype;
    boolean sunroof;
    String brand;
}

public class inheritance{
    public static void main(String[] args) {
        car c1 = new car();
        c1.price = 1500000;
        c1.milage = 18.5;
        c1.brand = "tata";
        c1.color = "red";
        c1.ftype = "diesel";
        c1.sunroof = true;
        c1.display();
        System.out.println(c1.sunroof);


    }
}