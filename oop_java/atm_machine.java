package oop_java;
import java.util.*;
class ATM{
    float Balance; 
    int PIN = 5674;
    //ATM(){ code of checkpin here} //using constuctor
    public void checkpin(){
        System.out.println("Enter your PIN");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if(PIN == enterpin){
            menu();
        }
        else{ System.out.println("Enter a valid pin");
            menu();
        }
    }
        public void menu(){
            System.out.println("Eneter your choice");
            System.out.println("1. Check your balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if(opt == 1){
                checkBalance();
            }
            else if(opt == 2){
                withdrawMoney();
            }
            else if(opt == 3){
                depositMoney();
            }
            else if(opt == 4){
                return;
            }
            else {
                System.out.println("Enter a valid choice");
            }
        }
    
        public void checkBalance(){
            System.out.println("Balance is "+ Balance);
            menu();
        }
        public void withdrawMoney(){
            System.out.println("Enter amount to withdraw");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if(amount > Balance){
                System.out.println("Insufficient Balance");
            }
            else{
                Balance -= amount;
                System.out.println("Money withdrawl succesful");
            }
            menu();
        }

        public void depositMoney(){
            System.out.println("enter the amount to deposit");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            Balance += amount;
            System.out.println("money deposited successfully");
            menu();
        }
        
    }


public class atm_machine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();// no need of this line if we use constructor 
    }
}
