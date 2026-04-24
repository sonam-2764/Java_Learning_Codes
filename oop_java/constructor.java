package oop_java;
// //CONSTRUCTOR 
class Student{
    int id;
    int age;

    Student(int id, int age){
        this.id = id;
        this.age = age;
        //System.out.println("hello");
        System.out.println("Parametrized constructor");
    }

    Student(int id, String name, int age){
        System.out.println("Parametrized constructor 2");
    }

    Student(){
        System.out.println("Default constructor");
    }
}
public class constructor {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student(10, "sonam", 20);
        Student obj = new Student(4, 20);//object creation
        // this will run automatically without calling the function Student
        //because constructor gets automatically called just the method name should be same as class name
    }
    
}
