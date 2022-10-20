import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lab5Q3{
    public static void main(String[] args) {
        
        List<CarRecord> listOfCars=new ArrayList<>();

        CarRecord car1=new CarRecord("TOYOTA", "PRIUS", 1997);
        CarRecord car2=new CarRecord("HONDA", "Odyssey", 1994);

        listOfCars.add(car1);
        listOfCars.add(car2);

        Collections.sort(listOfCars);
        for(CarRecord c : listOfCars){
            System.out.println(c.getBrand() + "," + c.getModel() +","+ c.getYear());
        }
    }
       
}

 class CarRecord implements Comparable<CarRecord>{
    
    private String brand;
    private String model;
    private int year;
    
    public CarRecord(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
  
    
    public int compareTo(CarRecord c){
        return this.year-c.year;
    }
    
    
}