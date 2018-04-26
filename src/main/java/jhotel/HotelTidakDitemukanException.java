package jhotel;
/**
 * Kelas HotelTidakDitemukanException
 *
 * @author (Jan Harianda Barus)
 * @version (April 21, 2018)
 */
public class HotelTidakDitemukanException extends Exception
{
    private int hotel_error;

    /**
     * Konstruktor kelas Exception HotelTidakDitemukanException
     *
     * @param hotel_input sebagai masukan
     */
    public HotelTidakDitemukanException(int hotel_input)
    {
        super("Hotel dengan ID: ");
        hotel_error = hotel_input;
    }

    /**
     * Method ini digunakaan untuk mendapatkan pesan Exception
     * @return String
     */
    public String getPesan()
    {
        return super.getMessage() + hotel_error + ("tidak ditemukan.");
    }

}
