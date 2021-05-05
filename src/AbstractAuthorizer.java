import java.util.List;

public abstract class AbstractAuthorizer {

    protected Employee employee;

    public AbstractAuthorizer(Employee employee) {
        this.employee = employee;
    }

    public abstract void addAuthorizer(AbstractAuthorizer authorizer);
    public abstract void removeAuthorizer(AbstractAuthorizer authorizer);

    public abstract boolean authorize(String activity,  Employee who);
}
