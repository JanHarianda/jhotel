package jhotel;
/**
 * Kelas Exception yang akan dipanggil jika kamar tidak ditemukan exception
 *
 * @author Jan Harianda Barus
 * @version April 21, 2018
 */
public class RoomTidakDitemukanException extends Exception
{
    private Hotel hotel_error;
    private String room_error;

    /**
     * Constructor dari kelas exception RoomSudahAda, menginisialisasikan nilai dari input.
     * @param room_input nilai pesanan yang dicek.
     */

    public RoomTidakDitemukanException(Hotel hotel_input, String room_input)
    {
        super("Kamar yang terletak di ");
        room_error = room_input;
        hotel_error = hotel_input;

    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */

    public String getPesan()
    {
        return super.getMessage() + hotel_error + "dan dengan nomor kamar" + room_error + "tidak ditemukan";
    }
}
