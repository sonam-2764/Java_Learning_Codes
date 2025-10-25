//constructor should have same name as the class name
//it automatically gets called whhen object is called 
//constructor is a method and has ()
//it doesn't return anything so it does not have return type like int void etc...
//if we create 2 object constructor will be called 2 times 
class Human{
       private int age;
    private String name = "sonam";
  
    public Human(){//defaukt constructor
        age = 12;
        name = "sonam";
    }

    public Human(int age, String name){//parametrised constructor
        this.age = age;
        this.name= name;

    }
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

public class constructor{
    public static void main(String[] args) {
        Human obj = new Human();
        //obj.SetAge(30);
        System.out.println(obj.getName() + " : " + obj.getAge());
        //this keyword refers to the curent object which is call the age(variable)
    }
}