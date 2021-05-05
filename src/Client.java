import java.util.ArrayList;
import java.util.List;

public class Client {


        public static  void main(String[] args) {

            //jerarquia
            // jefe 1
            // jefe 2 que es empleado de jefe 1
            // jefe 4 q es empleado de jefe 2
            // jefe 5 que es empleado de jefe 1
            // carlitos que es solo empleado pero de jefe 1


            NoAuthorizerLeaf carlos = new NoAuthorizerLeaf(new Employee("Carlos"));


            // creo los jefes
            AuthorizerComposite jefe1 = new AuthorizerComposite(new Employee("jefe 1"));
            AuthorizerComposite jefe2 = new AuthorizerComposite(new Employee("jefe 2"));
            AuthorizerComposite jefe4 = new AuthorizerComposite(new Employee("jefe 4"));
            AuthorizerComposite jefe5 = new AuthorizerComposite(new Employee("jefe 5"));


            jefe1.addAuthorizer(jefe2);

            jefe2.addAuthorizer(jefe4);

            jefe1.addAuthorizer(jefe5);

            jefe1.addAuthorizer(carlos);

            //vamos a probar si funciona

            System.out.println(jefe1.authorize("mirar netflix", carlos.employee));
            try {
                System.out.println(carlos.authorize("mirar netflix", carlos.employee));
            }catch ( RuntimeException e){
                System.out.println("Rompio todo aca, esta bien");
                // no puede autorizar
            }


        }
    }


