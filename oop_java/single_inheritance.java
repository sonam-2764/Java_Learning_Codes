package oop_java;



class employee{
void salary(){
    System.out.println("salary = 70000");
}
} 
class hr extends employee{
    void bonus(){
        System.out.println("bonus = 20000");
    }
}
public class single_inheritance {
    public static void main(String[] args) {
        hr obj = new hr();
        obj.salary();
        obj.bonus();
    }
}
