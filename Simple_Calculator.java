import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        Double num1=sc.nextDouble();
        System.out.println("Enter number 2:  ");
        Double num2=sc.nextDouble();
        System.out.println("Enter the Operation");
        String op=sc.next();
        switch (op){
            case "+":
                System.out.println("Addition of "+num1+" & "+num2+"is : "+(num1+num2));
                break;
            case "-":
                System.out.println("Substraction of "+num1+" & "+num2+"is : "+(num1-num2));
                break;
            case "*":
                System.out.println("Multiplication of "+num1+" & "+num2+"is : "+(num1*num2));
                break;
            case "/":
                System.out.println("Division of "+num1+" & "+num2+"is : "+(num1/num2));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }
    }
}
