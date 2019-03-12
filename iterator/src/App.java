public final class App {

    public static void main(String[] args) {
        NameRepository repository = new NameRepository();

        for (Iterator iterator = repository.iterator(); iterator.hasNext(); ) {
            System.out.println("Name: " + iterator.next());
        }
    }

}
