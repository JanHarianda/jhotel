
/**
 * berikut adalah kelas SingleRoom
 *
 * @author (Jan Harianda Barus)
 * @version (March 15,2018)
 */
public class SingleRoom extends Room
{
    private static TipeKamar TIPE_KAMAR = TipeKamar.Single;

    /**
     * Constructor for objects of class SingleRoom
     */
    
    public SingleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar) 
    {
        super(hotel, nomor_kamar, isAvailable, status_kamar);
    }
    
    public TipeKamar getTipeKamar() 
    {
        return TIPE_KAMAR;
    }
}
