public final class NameRepository implements Container {

    private final String names[];

    public NameRepository() {
        names = new String[]{"Robert", "Julia", "John", "Lora"};
    }

    @Override
    public Iterator iterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        private int index;

        NameIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < names.length;

        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }

            return null;
        }

    }

}
