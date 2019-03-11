public final class App {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();
        ConcreteColleague concreteColleague = new ConcreteColleague(chatMediator);
        MobileColleague mobileColleague = new MobileColleague(chatMediator);
        chatMediator.addColleague(concreteColleague);
        chatMediator.addColleague(mobileColleague);
        concreteColleague.send("Hello World");
        mobileColleague.send("Hello");
    }

}
