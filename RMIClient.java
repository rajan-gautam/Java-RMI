import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {

    public static void main(String args[]){
        try {
            CarInterface client = (CarInterface) Naming.lookup("rmi://localhost/RMIServer");
            Car myCar = new Car();
            System.out.println(myCar);
            myCar = client.addPLate(myCar);
            System.out.println(myCar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

