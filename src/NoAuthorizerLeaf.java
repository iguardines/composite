public class NoAuthorizerLeaf extends AbstractAuthorizer {
    public NoAuthorizerLeaf(Employee employee){
        super(employee);
    }
    @Override
    public void addAuthorizer(AbstractAuthorizer authorizer) {
        throw new RuntimeException("it cannot be done");
    }

    @Override
    public void removeAuthorizer(AbstractAuthorizer authorizer) {
        throw new RuntimeException("it cannot be done");
    }

    @Override
    public boolean authorize(String task, Employee who) {
        throw new RuntimeException("it cannot be done");
    }
}
