package jhotel;
/**
 * Kelas Exception yang akan dipanggil jika kamar sudah ada.
 * @author Jan Harianda Barus
 * @version April 21, 2018
 */
public class RoomSudahAdaException extends Exception
{
    private Room room_error;
    /**
     * Constructor dari kelas exception RoomSudahAda, menginisialisasikan nilai dari input.
     * @param room_input nilai pesanan yang dicek.
     */

    public RoomSudahAdaException(Room room_input)
    {
        super("Kamar dengan nomor ruang ");
        room_error = room_input;
    }
    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */
    public String getPesan()
    {
        return super.getMessage() + room_error.getNomorKamar() + "pada " + room_error.getHotel() + "sudah terdaftar.";
    }
}
