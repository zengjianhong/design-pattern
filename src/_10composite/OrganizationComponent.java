package _10composite;

/**
 * @author jehon
 */
public abstract class OrganizationComponent {

    private String name;

    private String des;

    protected void add(OrganizationComponent organizationComponent) {
        throw  new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    // 方法print，做成抽象的，子类都需要实现
    protected abstract void print();
}
