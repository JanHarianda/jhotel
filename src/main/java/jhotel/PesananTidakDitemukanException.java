package jhotel;
/**
 * kelas ini menjelaskan tentang pesanan yang tidak ditemukan exception
 *
 * @author Jan Harianda Barus
 * @version April 19, 2018
 */
public class PesananTidakDitemukanException extends Exception
{
    private Customer pelanggan_error;

    /**
     * Constructor dari kelas exception PesananTidakDitemukan, menginisialisasikan nilai dari input.
     * @param pelanggan_input nilai pesanan yang dicek.
     */

    public PesananTidakDitemukanException(Customer pelanggan_input)
    {
        super("Pesanan yang dipesan oleh : ");
        pelanggan_error = pelanggan_input;
    }

    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */

    public String getPesan()
    {
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan.";
    }
}
