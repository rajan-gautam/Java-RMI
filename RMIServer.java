/*import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;*/
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;


public class RMIServer extends UnicastRemoteObject implements CarInterface{


    public RMIServer() throws Exception {
        super();


    }

    public Car addPLate(Car car) throws java.rmi.RemoteException{
        int plate = car.hashCode();
        car.setPlate(plate);
        return car;
    }



}
