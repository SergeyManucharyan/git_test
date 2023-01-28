import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Input first number");
        int numOne= sc.nextInt();
        System.out.println("Input second number");
        int numTwo=sc.nextInt();
        if(numTwo>numOne){
            System.out.println("Second number is great");
        }else if(numTwo<numOne){
            System.out.println("First number is great");
        }else{
            System.out.println("Two numbers is equal");
        }
        for(int i=0;i<10;i++){
            System.out.println("Hello "+i+"times");
        }
    }
}