package problem5;
import problem5.*;

public class Vehicle {
    public String name;
    public String vehicleRegistrationNumber;

    Vehicle(String name, String vehicleRegistrationNumber) {
        try{
            this.name = name;
            setVehicleRegistrationNumber(vehicleRegistrationNumber);
        } catch (InvalidVehicleCode e) {
            System.out.println(e.getMessage());
        } catch (InvalidRegistrationNumber e) {
            System.out.println(e.getMessage());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicleRegistrationNumber(String vehicleRegistrationNumber) throws InvalidVehicleCode,InvalidRegistrationNumber {
        if (vehicleRegistrationNumber.substring(0, 2) == "MH" ||
                vehicleRegistrationNumber.substring(0, 2) == "MP" ||
                vehicleRegistrationNumber.substring(0, 2) == "AP" ||
                vehicleRegistrationNumber.substring(0, 2) == "DL" ||
                vehicleRegistrationNumber.substring(0, 2) == "GJ") {
            throw new InvalidVehicleCode();
        }
        if(vehicleRegistrationNumber.charAt(2)!='-'){
            throw new InvalidRegistrationNumber();
        }
        if(vehicleRegistrationNumber.length()>7){
            throw new InvalidRegistrationNumber();
        }
        for(int x=3;x<vehicleRegistrationNumber.length();x++){
            if(vehicleRegistrationNumber.charAt(x)<'0' || vehicleRegistrationNumber.charAt(x)>'9'){
                throw new InvalidRegistrationNumber();
            }
        }
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }

    public String toString() {
        return "Name: " + name + "\nVehicle Registration Number: " + vehicleRegistrationNumber;
    }
}
