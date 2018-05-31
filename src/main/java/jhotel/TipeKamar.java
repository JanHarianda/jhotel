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
    SINGLE("Single"),
    DOUBLE("Double"),
    PREMIUM("Premium");

    private String deskripsi;

    /**
     * Method ini merupakan constructor dari class enum
     * TipeKamar.
     *
     * @param deskripsi sebagai tipe kamar
     */
    TipeKamar(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }

    /**
     * Method ini digunakan untuk mengembalikan tipe kamar dalam bentuk String
     *
     * @return tipe kamar
     */
    public String toString()
    {
        return deskripsi;
    }
}