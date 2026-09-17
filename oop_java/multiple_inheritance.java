package oop_java;

// if both parent class have same method name so this creates confusion for obj of child class regarding which method to use 
// this creates ambuigity creating diamond problem 
//hence multiple inheritance can't be directly accessed they are accessed via interface

// //interface krna jaruri ho jaye but apne according use kr skte h 
// /*interface A{
// public void method1();//no body
// }
// class B implements A{
// public void method1(){
// sout;
// }}*/


// interface Animal{
//     public void run();
// }
// class Tiger implements Animal{
//     public void run(){
//         System.out.println("tiger runs");
//     }
// }
// class Lion implements Animal{
//     public void run(){
//         System.out.println("Lion runs");
//     }
// }
// //OBJECT HMESHA CLASS KA BNTA H INTERFACE KA NHI 
// public class multiple_inheritance {
//     public static void main(String[] args) {
//         Animal l1 = new Lion();
//         Animal t1 = new Tiger();
//         l1.run();
//         t1.run();
//     }
// }



// an interface is used to acheieve 100 % abstraction 
//abstract classes is used to acheieve  b/w 0-100% abstraction
//interface cannot have constructors because we can't create object of interface
//if interface is made private or its methods are made private /protected complication error will be thrown
//interface can be used to acheieve loose coupling







//MULTIPLE INHERITANCE USING INTERFACE
interface A {
    public void run();
}

interface B{
    public void run();
}
class C implements A,B{
    public void run(){
        System.out.println("C class run method");//ab ye c ka method hogya toh no ambiguity or confusion
    }
}

public class multiple_inheritance{
    public static void main(String[] args) {
        C obj = new C();
        obj.run();
    }
}