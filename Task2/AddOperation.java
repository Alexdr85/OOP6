package OOP6.Task2;

public class AddOperation implements OperationStrategy {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }
}