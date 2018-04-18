
/**
 * berikut adalah kelas SingleRoom
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class SingleRoom extends Room
{
    // instance variables
    private static TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;

    /**
     * Konstruktor dari class SingleRoom.
     *
     * @param hotel sebagai hotel yang memiliki kamar
     * @param nomor_kamar  nomor kamar
     * @param status_kamar  status kamar
     */
    public SingleRoom(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, status_kamar);
    }

    /**
     * Method untuk mengambil nilai tipe kamar
     *
     * @return TIPE_KAMAR(TipeKamar)
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
}