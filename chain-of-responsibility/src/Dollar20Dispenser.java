public final class Dollar20Dispenser implements DispenseChain {

    private DispenseChain nextChain;

    @Override
    public void nextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.amount() >= 20) {
            int num = currency.amount() / 20;
            int remainder = currency.amount() % 20;
            System.out.println("Dispensing " + num + " 20 $ note");

            if (remainder != 0) {
                nextChain.dispense(new Currency(remainder));
            }

        } else {
            nextChain.dispense(currency);
        }
    }

}
