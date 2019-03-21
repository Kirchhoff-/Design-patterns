final class Context {

    private final Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}
