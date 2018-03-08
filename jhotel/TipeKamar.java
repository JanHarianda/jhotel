
/**
 * Enumeration class TipeKamar - class ini untuk membatasi tipe kamar yang dapat diterima
 * 
 *
 * @author (Jan Harianda Barus)
 * @version (March 8, 2018)
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    
    private String Status;
    
    TipeKamar(String Status){
        this.Status = Status;
    }
}

