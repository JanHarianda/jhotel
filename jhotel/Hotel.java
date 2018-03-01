
/**
 * kelas ini memodelkan Hotel
 *
 * @author (Jan Harianda Barus)
 * @version (March 1, 2018)
 */
public class Hotel
{
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    
    public Hotel()
    {
        
    }
    
    public Hotel(String nama, Lokasi lokasi, int bintang){
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
    }
    
    public int getBintang()
    {
        return bintang;
    }
    
    public String getNama()
    {
        return nama;
    }
    
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setLokasi(Lokasi lokasi){
        this.lokasi = lokasi;
    }
    
    public void setBintang(int bintang){
        this.bintang = bintang;
    }
    
    /**
     * 
     * method print data digunakan untuk mencetak nama
     */
    public void printData()
    {
        System.out.println("Total Nama :" +nama    );
    }
}
