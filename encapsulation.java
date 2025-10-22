class Human{
    //private int age =11;
    private int age;
    private String name = "sonam";
    //private let you access the data in same class but if we want to fetch data outside class we need to use method
    public int getAge(){//method getAge
        return age;
    }

    //if we want to get data from user 
    public void SetAge(int a){
            age=a;
    }
    public String getName(){//method getName
        return name;
    }
}

public class encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.SetAge(30);
        System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
}