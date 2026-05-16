package oop_java;

public class introduction {
    String name;
    int roll_no;
    public void printdata(){
        System.out.println(name);
        System.out.println(roll_no);
    }
    public static void main(String[] args) {
        //System.out.println(name);//can't be accessed as we need object
        introduction obj = new introduction();//new word allocates a new space in memory for the object we are creating
        obj.name = "Sonam";
        obj.roll_no=50;
        System.out.println(obj.name);
        obj.printdata();

        introduction obj1 = new introduction();
        obj1.name= "Tanu";
        obj1.printdata();
    }
}
// class is the blueprint of object
//object refers to behaviour or properties
//object is a real world entity

//oop is important to store large amount of data ,promotes code reusability, secure ,allows controlled access about which data to be shown which to be hidden

//oops is feature of java