public final class SalesDepartment implements Department {

    private final int id;
    private final String name;

    public SalesDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

}
