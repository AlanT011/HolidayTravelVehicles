import java.util.ArrayList;

public class Invoice{
    private String invoiceNumber;
    private String date;
    private float finalPrice;
    private String customerId;
    private String vehicleSerialNumber;
    private String salespersonId;
    private String tradeInVehicleId;
    private String signature;

    private ArrayList<Option> options;
    private Vehicle vehicle;
    private Salesperson salesperson;
    private Customer customer;
    private TradeInVehicle tradeInVehicle;
}