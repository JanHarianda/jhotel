package jhotel;
/**
 * Enumeration class StatusKamar - class ini untuk membatasi status kamar yang dapat diterima.
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 * 
 */
public enum StatusKamar
{
    BOOKED("Booked"),
    PROCESSED("Processed"),
    VACANT("Vacant");

    private String deskripsi;

    /**
     * Method StatusKamar merupakan constructor dari class enum StatusKamar
     *
     * @param deskripsi sebagai status kamar
     */
    StatusKamar(String deskripsi)

    {
        this.deskripsi = deskripsi;
    }

    /**
     * Method toString digunakan untuk mengembalikan status kamar
     *
     * @return instance variable status
     */
    public String toString()
    {
        return deskripsi;
    }
}