package jhotel;
/**
 * Kelas ini emenjelaskan tentang kelas pelanggan yang tidak ditemukan exception
 *
 * @author Jan Harianda Barus
 * @version April 19, 2018
 */
public class PelangganTidakDitemukanException extends Exception
{
    private int pelanggan_error;

    /**
     * Konstruktor kelasPelangganTidakDitemukanException
     * @param pelanggan_input input
     */
    public PelangganTidakDitemukanException(int pelanggan_input)
    {
        super("Data Customer dengan ID: ");
        pelanggan_error = pelanggan_input;
    }
    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */
    public String getPesan()
    {
        return super.getMessage() + pelanggan_error + "tidak ditemukan" ;
    }
}
