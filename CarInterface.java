
import java.rmi.RemoteException;

public interface CarInterface extends java.rmi.Remote {
    public Car addPLate(Car car) throws RemoteException;
}
