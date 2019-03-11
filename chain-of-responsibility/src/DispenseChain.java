public interface DispenseChain {

    void nextChain(DispenseChain nextChain);

    void dispense(Currency currency);

}
