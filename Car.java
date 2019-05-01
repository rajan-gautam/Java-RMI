
import java.io.Serializable;

public class Car {
// extends UnicastRemoteObject implements Serializable, CarInterface
    private static final long serialVersionUID = 1L;

    public String model;
    public String color;
    public double mileage;
    public int plate;

    public Car(){
        model = "Toyota";
        color = "black";
        mileage = 100;
    }

    public void setPlate(int plate){
        this.plate = plate;
    }

    public Car(String model, String color, double mileage) throws Exception {
        if(!model.isEmpty() && !color.isEmpty() && mileage >= 0) {
            this.model = model;
            this.color = color;
            this.mileage = mileage;
            this.plate = -1;
        }
        else
            throw new Exception("Incorrect Values");
    }
    public String toString() {

            return new String("{ " + this.model + ", " + this.color + ", " + this.mileage + ", "+ ((this.plate == -1) ? "Undefined" : this.plate + "}"));

    }


}
