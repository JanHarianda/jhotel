
/**
 * Enumeration class TipeKamar - class ini untuk membatasi tipe kamar yang dapat diterima
 * 
 *
 * @author (Jan Harianda Barus)
 * @version (March 8, 2018)
 */
enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    
    public String Status;
    
    TipeKamar(String Status){
        this.Status = Status;
    }
}

