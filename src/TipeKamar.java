
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
    private String deskripsi;
    
    TipeKamar(String deskripsi){
        this.deskripsi = deskripsi;
    }
    
    public String toString() {
        return deskripsi;
    }
}

