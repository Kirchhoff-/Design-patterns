public class App {

    public static void main(String[] args) {
        AccountManager firstAccountManager = AccountManager.getInstance();
        AccountManager secondAccountManager = AccountManager.getInstance();

        System.out.println(firstAccountManager);
        System.out.println(secondAccountManager);
    }

}
