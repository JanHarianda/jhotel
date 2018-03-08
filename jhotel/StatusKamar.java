
/**
 * Enumeration class StatusKamar - class ini untuk membatasi status kamar yang dapat diterima
 *
 * @author (Jan Harianda Barus)
 * @version (March 8, 2018)
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed:"), Vacant("Vacant");
    
    private String Status;
    
    StatusKamar(String Status){
        this.Status = Status;
    }
}
