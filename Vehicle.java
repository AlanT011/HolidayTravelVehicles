public class Vehicle{
    private String serialNumber;
    private String name;
    private String model;
    private String year;
    private float cost;

    private Invoice invoice;

    public Vehicle(String serialNumber, String name, String model, String year, float cost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.cost = cost;
    }

     @Override
    public String toString() {
        return  "serialNumber='" + serialNumber  +
                ", name='" + name +
                ", model='" + model +
                ", year='" + year +
                ", cost=" + cost ;
    }
}