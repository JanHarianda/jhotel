package jhotel;
/**
 * kelas PesananSudahAdaException
 *
 * @author (Jan Harianda Barus)
 * @version (April 21, 2018)
 */
public class PesananSudahAdaException extends Exception
{
    private Pesanan pesanan_error;

    /**
     * Constructor dari kelas exception PesananSudahAda, menginisialisasikan nilai dari input.
     * @param pesanan_input nilai pesanan yang dicek.
     */
    public PesananSudahAdaException(Pesanan pesanan_input)
    {
        super("Pesanan yang dipesan oleh: ");
        pesanan_error = pesanan_input;
    }
    /**
     * Method yang digunakan untuk mendapatkan pesan Exception.
     * @return String nilai pesan error.
     */
    public String getPesan()
    {
        return super.getMessage() + pesanan_error.getPelanggan().getNama() + "sudah melakukan pesanan";
    }
}
