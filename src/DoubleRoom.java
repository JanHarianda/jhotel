
/**
 * Ini adalah kelas DoubleRoom
 *
 * @author (Jan Harianda Barus)
 * @version (March 15, 2018)
 */
public class DoubleRoom extends Room
{
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Double;   
    
    /**
     * Constructor for objects of class DoubleRoom
     */
   
    public DoubleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar) 
    {
        super (hotel,nomor_kamar,isAvailable,status_kamar);
    }
    
    public Customer getCustomer2() 
    {
        return customer2;
    }
    
    public Customer setCustomer2() 
    {
        this.customer2 = customer2;
        return customer2;
    }
    
    public TipeKamar getTipeKamar() 
    {
        return TIPE_KAMAR;
    }
    
    public void setCustomer(Customer customer2) 
    {
    }
}
