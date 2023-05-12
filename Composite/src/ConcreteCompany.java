import java.util.ArrayList;

public class ConcreteCompany extends Company{
    protected ArrayList<Company> children = new ArrayList<>();
    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i <depth ; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for(Company item : children){
            item.display(depth+2);
        }
    }

    @Override
    public void lineOfDuty() {

    }
}
