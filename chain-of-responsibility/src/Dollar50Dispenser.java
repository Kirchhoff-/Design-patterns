public final class Dollar50Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void nextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.amount() >= 50) {
            int num = currency.amount() / 50;
            int remainder = currency.amount() % 50;
            System.out.println("Dispensing " + num + " 50 $ note");

            if (remainder != 0) {
                nextChain.dispense(new Currency(remainder));
            }

        } else {
            nextChain.dispense(currency);
        }
    }

}
