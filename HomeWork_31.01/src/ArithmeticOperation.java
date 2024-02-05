import java.util.Random;

public class ArithmeticOperation {
    Random random = new Random();
    int number1 = random.nextInt(0,50);
    int number2 = random.nextInt(0,50);


    public int addition() {
    int resultOfAdd = number1 + number2;
    return resultOfAdd;
    }

    public int subtraction() {
        int resultOfSub = number1 - number2;
        return resultOfSub;
    }

    public int division() {
        int resultOfDiv = number1 / number2;
        return resultOfDiv;
    }

    public int multiply() {
        int resultOfMul = number1 * number2;
        return resultOfMul;
    }

}
