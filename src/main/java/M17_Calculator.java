import java.util.Scanner;

public class M17_Calculator {
    public static void main(String[] args) {
        double myNumbers[] = new double[2];
        double myResult = 0;
//  STEP 1: GET THE NUMBERS (OPERANDS) SEPARATED BY "SPACE" OR "ENTER":
        System.out.println("Enter two numbers, separated by \"space\" or \"enter\":");
        Scanner keyboardScanner = new Scanner(System.in);
        for(int i = 0; i < 2; i++) {
            myNumbers[i] = keyboardScanner.nextDouble();
        }
//  STEP 2: GET THE MATHEMATICAL CHARACTER (OPERATOR):
        System.out.println("Enter a mathematical operator (+, -, *, / or %):");
        String myOperator = keyboardScanner.next();
//  STEP 3: CALCULATE THE DIFFERENT VARIANTS:
        switch (myOperator) {
            case "+":
                myResult = myNumbers[0] + myNumbers[1];
                break;
            case "-":
                myResult = myNumbers[0] - myNumbers[1];
                break;
            case "*":
                myResult = myNumbers[0] * myNumbers[1];
                break;
            case "/":
                myResult = myNumbers[0] / myNumbers[1];
                break;
            case "%":
                myResult = myNumbers[0] % myNumbers[1]; /*WHY IS THIS RESULT SO INACCURATE?...*/
                break;
            default:
                System.out.println("Sorry, \"" + myOperator + "\" is not a valid operator for this exercise.");
        }
        System.out.println(myNumbers[0] + " " + myOperator + " " + myNumbers[1] + " = " + myResult);
    }
}