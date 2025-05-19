import java.util.Scanner;

class Calculator{
    double a;
    double b;
    String operation;
    public Calculator(double a,double b,String operation){
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    public double calculate(){
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
            if (b !=0) {
                return a / b;
            }else{
                throw new ArithmeticException("cannot divide by zero.");
            }          
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double a = sc.nextDouble();
        System.out.println("Enter b");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter operation (add,sub,mul,div): ");
        String operation = sc.nextLine();
        Calculator cal = new Calculator(a, b, operation);
        try {
            double result = cal.calculate();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}