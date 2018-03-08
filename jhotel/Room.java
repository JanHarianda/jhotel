
/**
 * Write a description of class Room here.
 *
 * @author (Jan Harianda Barus)
 * @version (March 8, 2018)
 */
public class Room
{
    // instance variables
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    public Hotel getHotel()
    {
        return hotel;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    
    public boolean getStatusAvailable()
    {
        return isAvailable;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
}


