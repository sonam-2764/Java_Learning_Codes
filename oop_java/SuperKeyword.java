package oop_java;
//super keyword
/* 1. to invoke parent class variable
2. to invoke parent class method
3. to invoke parent class constructor
// agar parent class and child cladss k paaas same name ki method h tb use krte h  */

//TO INVOKE PARENT CLASS VARIABLE

class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(color);       // child class variable
        System.out.println(super.color); // parent class variable
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}

