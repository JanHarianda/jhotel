package jhotel;
/**
 * kelas ini menjelaskan tentang Pelanggan yang sudah ada exception
 *
 * @author Jan Harianda Barus
 * @version April 19, 2018
 */
public class PelangganSudahAdaException extends Exception {
    private Customer pelanggan_error;


    /**
     * Konstruktor pada kelas Pelanggan SudahAdaException
     *
     * @param pelanggan_input sebagai nilai cek pesanan
     */
    public PelangganSudahAdaException(Customer pelanggan_input)
    {
        super("Pelanggan dengan data: ");
        pelanggan_error = pelanggan_input;
    }

    /**
     *
     * Method untuk mendapatkan pesan Exception
     * @return String
     */
    public String getPesan()
    {
        return super.getMessage() + pelanggan_error + "sudah terdaftar" ;
    }



}
