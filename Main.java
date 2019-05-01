import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


public class Main {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            CarInterface server = new RMIServer();
            System.out.println("running the server");
            Naming.rebind("rmi://localhost:1099/RMIServer", server);
            System.out.println("server running!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
