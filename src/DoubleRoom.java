
/**
 * Ini adalah kelas DoubleRoom
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class DoubleRoom extends Room
{
    // instance variables
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;
    private Customer customer2;

    /**
     * Konstruktor dari kelas DoubleRoom.
     *
     * @param hotel sebagai hotel yang memiliki kamar
     * @param nomor_kamar  nomor kamar
     * @param status_kamar  status kamar
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, status_kamar);
    }

    /**
     * Method ini digunakan untuk mengeset customer kedua.
     *
     * @param   customer2 sebagai customer kedua
     */
    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }

    /**
     * Method ini digunakan untuk mengambil customer kedua.
     *
     * @return   customer2
     */
    public Customer getCustomer2()
    {
        return customer2;
    }

    /**
     * Method ini digunakan untuk mengambil nilai tipe kamar.
     *
     * @return    TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }


}
