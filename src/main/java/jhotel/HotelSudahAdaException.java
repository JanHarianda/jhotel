package jhotel;
/**
 * Kelas Exception
 *
 * @author Jan Harianda Barus
 * @version April 21, 2018
 */
public class HotelSudahAdaException extends Exception
{
    private Hotel hotel_error;

    /**
     * Konstruktor HotelSudahAdaException
     * @param hotel_input input hotel
     */

    public HotelSudahAdaException(Hotel hotel_input)
    {
        super("Hotel dengan nama: ");
        hotel_error = hotel_input;
    }

    /**
     * Method mendapatkan pesan Exception
     *
     * @return String
     */
    public String getPesan()
    {
        return super.getMessage() + hotel_error.getNama() + ("sudah terdaftar.");
    }
}
