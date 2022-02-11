import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MyException check = new MyException();
        check.str = sc.nextLine();
        check.checkingExceptions();

        String[] character = check.str.split(" ");
        for (String s: character) {
        }

        if (character[0].matches("[1-9]|10")) {
            Operation calc1 = new Operation();
            calc1.operation = character[1].charAt(0);
            calc1.num1= Integer.parseInt(character[0]);
            calc1.num2= Integer.parseInt(character[2]);
            System.out.println(calc1.calculation());
        } else {
            RomanToInt r1 = new RomanToInt();
            r1.romanNum1 = character[0];
            r1.romanNum2 = character[2];

            Operation calc2 = new Operation();
            calc2.operation = character[1].charAt(0);
            calc2.num1= r1.getIntNum1();
            calc2.num2= r1.getIntNum2();

            IntToRoman r2 = new IntToRoman();
            if (calc2.calculation() < 0) {
                System.out.println("Римские цифры не могут быть отрицательными, результат в арабских: " + calc2.calculation());
            } else if (calc2.calculation() == 0) {
                System.out.println("В системе римских цифр отсутствует ноль, результат в арабских: " + calc2.calculation());
            } else {
                r2.intResult = calc2.calculation();
                System.out.println(r2.getRomanResult());
            }
        }
    }
}