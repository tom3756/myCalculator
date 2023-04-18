import java.util.Scanner;
public class myCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Select first number: \n");
        double num1 = Double.parseDouble(reader.nextLine());
        System.out.print("Select second number: \n");
        double num2 = Double.parseDouble(reader.nextLine());
        System.out.println("Select an Operator: + - * / ");
        String opSelect = reader.nextLine();
        if (opSelect.equals("+")) {
            addMethod(num1, num2);
        }
        if (opSelect.equals("-")) {
            subMethod(num1, num2);
        }
        if (opSelect.equals("*")) {
            multMethod(num1, num2);
        }
        if (opSelect.equals("/")) {
            divMethod(num1, num2);
        }
    }

    public static void addMethod(double num1, double num2) {
        double add = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+add);
    }

    public static void multMethod(double num1, double num2) {
        double mult = num1 * num2;
        System.out.println(num1+" * "+num2+" = "+mult);
    }

    public static void subMethod(double num1, double num2) {
        double sub = num1 - num2;
        System.out.println(num1+" - "+num2+" = "+sub);
    }

    public static void divMethod(double num1, double num2) {
        double div = num1 / num2;
        System.out.println(num1+" / "+num2+" = "+div);

    }
}
