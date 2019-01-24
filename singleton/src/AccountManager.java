final class AccountManager {

    private static final AccountManager INSTANCE = new AccountManager();

    private AccountManager() {
    }

    static AccountManager getInstance() {
        return INSTANCE;
    }
}
