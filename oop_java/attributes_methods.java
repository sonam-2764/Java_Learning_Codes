package oop_java;

// class Student{
//     String name;
//     //final String name = "Sonam"; //now this value is fixed and can't be changed
//     int roll;
//     String address;

// }

class Dog{
    String name;
    int License;
    public void eat(){
        System.out.println(name + "barks");
    }
}
public class attributes_methods {
    public static void main(String[] args) {

        // Student std1 = new Student(); //Student() is a constructor
        // std1.name = "Sonam";
        // System.out.println(std1.name);
        // std1.name = "Maitri";
        // System.out.println(std1.name);
        // Student std2 = new Student();
        // std2.name = "Shraddha";
        // System.out.println(std2.name);
        // //for each object the variable can have different values and we can also change the value of variable



        Dog dog1 = new Dog();
        dog1.name = "Sophie";
        dog1.eat();
    }
}

//if we write function within class it is called methods