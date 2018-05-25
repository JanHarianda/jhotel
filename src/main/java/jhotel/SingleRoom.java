package jhotel;
/**
 * berikut adalah kelas SingleRoom
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class SingleRoom extends Room
{
    // instance variables
    private  TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;

    /**
     * Konstruktor dari class SingleRoom.
     *
     * @param hotel sebagai hotel yang memiliki kamar
     * @param nomor_kamar  nomor kamar
     */
    public SingleRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
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