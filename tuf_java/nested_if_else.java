package tuf_java;

import java.util.Scanner;

public class nested_if_else {
    public static void main(String[] args) {
        /* 
        You are given three integers, a, b and c 
        print which of them is largest .
        If two integers are equal and are the largest ,
        the program should indicate that as well
         */

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("num1 is the greatest " +num1);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println("num2 is the greatest "+num2);
        }
        else if(num3 > num2 && num3 >num1){
            System.out.println("num3 is the greatest "+num3);
        }
        else {
            System.out.println("noone is greatest");
        }


        // if(num1 > num2){
        //     //num1 or num3 is greatest
        //     if(num1 >num3){

        //     } 
        //     else if (num3 > num1){

        //     }
        // }
    }
    
}
