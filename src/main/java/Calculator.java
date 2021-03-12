import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("SPE Calculator Mini Project");
        while(true) {
            System.out.println("Enter your choice");
            System.out.println("Press 1 for square root:");
            System.out.println("Press 2 for factorial:");
            System.out.println("Press 3 for logarithm:");
            System.out.println("Press 4 for power function:");
            System.out.println("Press any other key to exit");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int choice;
            choice = Integer.parseInt(br.readLine());
            if (choice == 1) {
                System.out.println("Enter the number to calculate square root: ");
                double val = Double.parseDouble(br.readLine());
                if(val>=0){
                    double result= getSquareRoot(val);
                    System.out.println("Square root of "+val+" is: "+result);
                }
                else
                    System.out.println("Square root for negative number is not possible (as it will return imaginary values)");
                System.out.println("====================================================");
            }
            else if (choice == 2) {
                System.out.println("Enter the number to calculate factorial: ");
                int val = Integer.parseInt(br.readLine());
                if(val >= 0)
                    System.out.println("Factorial of "+val+" is: "+getFactorial(val));
                else
                    System.out.println("Factorial value for negative number is not possible");
                System.out.println("====================================================");
            }
            else if (choice == 3) {
                System.out.println("Enter the number to calculate logarithm(base e): ");
                double val = Double.parseDouble(br.readLine());
                if(val>0)
                    System.out.println("Natural log value of "+val+" is: "+getLogarithm(val));
                else if(val == 0)
                    System.out.println("Log value is"+Double.NEGATIVE_INFINITY);
                else
                    System.out.println("Log value for negative number is not possible");
                System.out.println("====================================================");
            }
            else if (choice == 4) {
                System.out.println("Enter the base value: ");
                double base_val, exp_val;
                base_val = Double.parseDouble(br.readLine());
                System.out.println("Enter the exponent value: ");
                exp_val = Double.parseDouble(br.readLine());
                System.out.println(base_val + " to the power " + exp_val + " is: " + cal_pow(base_val, exp_val));
                System.out.println("====================================================");
            }
            else{
                System.out.println("To continue using Calculator press 1:");
                System.out.println("Press any other number to exit");
                if(Integer.parseInt(br.readLine())!=1) {
                    break;
                }
            }
        }
    }
    public static double getSquareRoot(double val){
        if(val < 0)
            return Double.NaN;
        return Math.sqrt(val);
    }
    public static double getFactorial(int n)
    {
        if(n < 0)
            return Double.NaN;
        if (n == 0)
            return 1;
        return n*getFactorial(n-1);
    }
    public static double getLogarithm(double val){
        return Math.log(val);
    }
    public static double cal_pow(double base_val, double exp_val){
        if(base_val==0 && exp_val==0)
            return Double.NaN;
        return Math.pow(base_val, exp_val);
    }

}
