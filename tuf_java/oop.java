package tuf_java;
import java.util.*;
// class Test{
//     public static void printTest(){
//         System.out.println("hello");
//     }
// }

// public class oop {
//     public static void main(String[] args) {
//         Test.printTest();//we can access static method in main without creating object
//     }
// }








// class Test{
//     int age;
//     public void assignAge(int num){
//         age = num;
//     }
// }

// class oop {
//     public static void main(String[] args) {
//         Test test1 = new Test();
//         test1.assignAge(num:10);

//         Test test2 = new Test();
//         test2.assignAge(19);

//         System.out.println(test1.age);
//         System.out.println(test2.age);
//     }
// }




// the function printNumber which takes an integer input from the user and prints it on the screen
class Solution{
    public void printNumber(Scanner sc){
        int num = sc.nextInt();
        System.out.println(num);
    }
}


 class oop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s1 = new Solution();
        s1.printNumber(sc);
    }
 }
 
