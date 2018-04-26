package jhotel;
/**
 * Enumeration class TipeKamar - class ini untuk membatasi tipe kamar yang dapat diterima
 * 
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public enum TipeKamar
{
    SINGLE("Single"), DOUBLE("Double"), PREMIUM("Premium");

    private final String tipe;

    /**
     * Method ini merupakan constructor dari class enum
     * TipeKamar.
     *
     * @param tipe sebagai tipe kamar
     */
    private TipeKamar(String tipe)
    {
        this.tipe = tipe;
    }

    /**
     * Method ini digunakan untuk mengembalikan tipe kamar dalam bentuk String
     *
     * @return tipe kamar
     */
    public String toString()
    {
        return ("Tipe kamar : " + this.tipe);
    }
}