package jhotel;

public class PelangganSudahAdaException extends Exception {
    private Customer pelanggan_error;

    /**
     * constructor untuk kelas PelangganSudahAdaException
     *
     * @param pelanggan_input objek Customer
     */
    public PelangganSudahAdaException(Customer pelanggan_input)
    {
        super("Pelanggan dengan data : ");
        pelanggan_error=pelanggan_input;
    }
    /**
     * mendapatkan pesan error untuk exception
     *
     * @return string
     */
    public String getPesan(){
        return super.getMessage() +
                "\nID       : "+ pelanggan_error.getID()+
                "\nNama     : "+pelanggan_error.getNama()+
                "\nEmail    : "+pelanggan_error.getEmail()+
                "\nSudah terdaftar.";

    }
}