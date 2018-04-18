
/**
 * Enumeration class StatusKamar - class ini untuk membatasi status kamar yang dapat diterima.
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 * 
 */
public enum StatusKamar
{
    BOOKED("Booked"), PROCESSED("Processed"), VACANT("Vacant");

    private final String status;

    /**
     * Method StatusKamar merupakan constructor dari class enum StatusKamar
     *
     * @param status sebagai status kamar
     */
    private StatusKamar(String status)
    {
        this.status = status;
    }

    /**
     * Method toString digunakan untuk mengembalikan status kamar
     *
     * @return instance variable status
     */
    public String toString()
    {
        return ("Status kamar : " + this.status);
    }
}