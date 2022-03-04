import java.util.Scanner;

public class SimpleCalc{
public static void main(String[] args) {
    String num1, num2;
    double res;
    System.out.println("Enter the first number:");
        try (Scanner sc = new Scanner(System.in)) {
            num1 = sc.nextLine();
            double n1 = Double.parseDouble(num1);
            System.out.println("Enter the second number:");
            num2 = sc.nextLine();
            double n2 = Double.parseDouble(num2);
            
            res = n1 + n2;
            System.out.println(res);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        

    }
}