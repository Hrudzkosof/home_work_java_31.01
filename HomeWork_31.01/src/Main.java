import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравствуйте, введите ваше имя:");
        String name = scanner.nextLine();
        System.out.println("Спасибо, ваше имя: " + name);
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

        int number1 = arithmeticOperation.number1;
        int number2 = arithmeticOperation.number2;


        System.out.println("Ответьте на следующий вопрос: " + number1 + " + " + number2 + " = ");
        int userAnswer = scanner.nextInt();

        if (userAnswer == arithmeticOperation.addition()) {
            System.out.println("Поздравляю! Вы  правильно ответили на вопрос");
        } else {
            System.out.println("Увы," + name + ", правильный ответ: " + arithmeticOperation.addition());
        }

        System.out.println("Дайте ответ на вопрос: " + number1 + " - " + number2 + " = ");
        int userAnswer2 = scanner.nextInt();

        if (userAnswer2 == arithmeticOperation.subtraction()) {
            System.out.println("Поздравляю, ваш ответ правильный!");

        } else {
            System.out.println("Увы, " + name + ", правильный ответ: " + arithmeticOperation.subtraction());
        }

        System.out.println(name + ", дайте ответ на следующее уравнение: " + number1 + "*" + number2 + " = ");
        int userAnswer3 = scanner.nextInt();

        if (userAnswer3 == arithmeticOperation.multiply()) {
            System.out.println("Поздравляю, ваш ответ правильный!");
        } else {
            System.out.println("Увы, " + name + ", правильный ответ: " + arithmeticOperation.multiply());
        }

        System.out.println("Ответьте, пожалуйста, на вопрос: " + number1 + " / " + number2 + " = ");
        int userAnswer4 = scanner.nextInt();

        if (userAnswer4 == arithmeticOperation.division()) {
            System.out.println("Поздравляю, ваш ответ правильный!");
        } else {
            System.out.println("Увы, " + name + ", правильный ответ: " + arithmeticOperation.division());
        }
        System.out.println("Поздравляю! Опросник завершён!");
    }
}


















