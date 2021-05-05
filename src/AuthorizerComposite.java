import java.util.ArrayList;
import java.util.List;

public class AuthorizerComposite extends AbstractAuthorizer {
    protected List<AbstractAuthorizer> authorizers = new ArrayList<>();

    public AuthorizerComposite(Employee employee){
        super(employee);
    }
    @Override
    public void addAuthorizer(AbstractAuthorizer authorizer) {
        this.authorizers.add(authorizer);
    }

    @Override
    public void removeAuthorizer(AbstractAuthorizer authorizer) {
        this.authorizers.remove(authorizer);
    }

    @Override
    public boolean authorize(String activity, Employee who) {
        System.out.println(this.employee.getName() + "is granting access to permform " + activity + "to " + who.getName());
        return true;
    }
}
