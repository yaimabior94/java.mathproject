public class Math {

    private double number1;
    private double number2;
    private double number3;

    public Math(double number1, double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public double add() {
        return number1 + number2 + number3;
    }

    public double divide() {
        if (number3 == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (number1 + number2) / number3;
    }

    public double multiply() {
        return number1 * number2 * number3;
    }
}