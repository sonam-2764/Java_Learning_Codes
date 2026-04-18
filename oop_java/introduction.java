package oop_java;

public class introduction {
    String name;
    int roll_no;
    public static void main(String[] args) {
        //System.out.println(name);//can't be accessed as we need object
        introduction obj = new introduction();//new allocates a new space in memory for the object we are creating
        obj.name = "Sonam";
        System.out.println(obj.name);
    }
}
// class is the blueprint of abject
//object refers to behaviour or properties
//oop is important to store large amount of data ,code reusability, secure