import java.util.Scanner;

public class Main{

    Scanner sc = new Scanner (System.in);

    // Function to check palindrome
    public void checkPalindrome(){
        int n , rev=0 , z ;
        Scanner sc = new Scanner (System.in);
        System.out.print("please input the number to check palindrome : ");
        n = sc.nextInt();
        z = n ;

        while(n>0){
            
            rev=(rev*10)+(n%10);
            n=n/10;
        }if(z==rev){
            System.out.println("Palindrone number");
        }else{
            System.out.println("Not a palindrone number");
        }

    }

    // Function to printPattern
    public void printPattern(){
        Scanner sc = new Scanner (System.in);
        System.out.print("ENTER THE NUMBER OF ROWS TO PRINT STAR : ");
        int nPP = sc.nextInt();

        for (int i=nPP; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
        System.out.println();
        }
    }


    // Function to check no is prime or not
    public void checkPrimeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT NO. TO CHECK WHETHER PRIME IS : ");
        int numberCPN = sc.nextInt();
        
        boolean isPrime = true ;

        if(numberCPN>-1){
        for(int i=2; i*i<=numberCPN; i++){
            if(numberCPN%2==0){
        isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println( numberCPN + " is a prime number");
        }else{
            System.out.println(numberCPN + " is not a prime number");
        }
        }else{
            System.out.println("given number is negative");
        }
    }


    // Function to print Fibonacci Series
    public void printFibonacciSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER UPTO PRINT FIBONACCISERIES :  ");
        int numberPFS = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        int n3 = 1;

        if(numberPFS>0){
            for(int i=0; i<numberPFS; i++){
                System.out.println(n3);

                n1 = n2;
                n2 = n3;
                n3 = n1 + n2 ;
            }
        }
    }


    //main method which contains swtich and do while loop

    public static void main(String[] args) {
        Main obj = new Main();
        int choice;
        Scanner sc = new Scanner(System.in);

        do{System.out.println("Enter your choice from below list.\n" + "1.Find palindrome of number.\n" + "2.Print Pattern for a given no.\n" + "3.Check whether the no. is a prime number.\n" + "4.Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
        System.out.println();

        choice = sc.nextInt();
        switch(choice){
        case 0:
        choice = 0;
        break;

        case 1:{
            obj.checkPalindrome();
        }
        break;

        case 2:{
            obj.printPattern();
        }
        break;

        case 3:{
            obj.checkPrimeNumber();
        }
        break;

        case 4:{
            obj.printFibonacciSeries();
        }
        break;

        default:
        System.out.println("invalid choice. Enter a valid no.\n");

        }
        
    }while(choice!=0);
    System.out.println("Exited Successfully!!!");
    sc.close();
    }

}









