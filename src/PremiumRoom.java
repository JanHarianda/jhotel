
/**
 * Ini adalah kelas PremiumRoom
 *
 * @author (Jan Harianda Barus)
 * @version (March 15, 2018)
 */
public class PremiumRoom extends Room
{
    private static double DISCOUNT;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Premium;
    
    /**
     * Constructor for objects of class PremiumRoom
     */

    public PremiumRoom(Hotel hotel, String nomor_kamar, 
    boolean isAvailable, StatusKamar status_kamar) 
    {
        super(hotel, nomor_kamar, isAvailable, status_kamar);
    }
    
    public TipeKamar getTipeKamar() 
    {
        return TIPE_KAMAR;
    }
    
    public double getDiscount() 
    {
        return DISCOUNT=0.3;
    }
    
    public void setDailyTariff(double dailytariff) 
    {
        dailytariff = dailytariff*DISCOUNT;
    }
}
