import java.util.Scanner;

public final class App {

    public static void main(String[] args) {
        DispenseChain chain = new Dollar50Dispenser();
        chain.nextChain(new Dollar20Dispenser());
        chain.nextChain(new Dollar10Dispenser());

        while (true) {
            int amount;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }

            chain.dispense(new Currency(amount));
        }
    }

}
