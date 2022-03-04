import java.util.Scanner;

public class ComplexCalc{
    public static void main(String[] args) {
        String num1, num2;
        System.out.println("Enter the first number:");
        try (Scanner sc = new Scanner(System.in)) {
            num1 = sc.nextLine();
            double n1 = Double.parseDouble(num1);
            System.out.println("Enter the second number:");
            num2 = sc.nextLine();
            double n2 = Double.parseDouble(num2);
            
            double res;
            int ch;
            System.out.println("Select any operations: 1. Addition, 2. Subtraction, 3. Multiplication, 4. Division");
            ch = sc.nextInt();
            switch(ch){
                case 1: res = n1 + n2;
                        System.out.println("Addition is:"+ res);
                        break;
                case 2: if(n1>n2){
                         res = n1-n2;
                         System.out.println("Subtraction is:"+ res);
                         }
                         else 
                             res = n2-n1;
                             System.out.println("Subtraction is:"+res);
                        break;
                case 3: res = n1*n2;
                        System.out.println("Multiplication is:"+ res);
                        break;
                case 4: if(n2==0)
                           throw new RuntimeException("Denominator can't be zero!!");
                        else{
                            res = n1 / n2;
                            System.out.println("Division is:"+res);
                        }
                        break;
                default: System.out.println("Wrong choice!!");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}