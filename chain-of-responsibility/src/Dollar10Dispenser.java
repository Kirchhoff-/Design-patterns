public final class Dollar10Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void nextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.amount() >= 10) {
            int num = currency.amount() / 10;
            int remainder = currency.amount() % 10;
            System.out.println("Dispensing " + num + " 10 $ note");

            if (remainder != 0) {
                nextChain.dispense(new Currency(remainder));
            }

        } else {
            nextChain.dispense(currency);
        }
    }

}
