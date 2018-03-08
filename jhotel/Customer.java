/**
 * kelas ini menjelaskan tentang identitas bakal calon pengguna kamar hotel
 * yang berupa id number, nama, dan lainnya.
 * 
 * @author (Jan Harianda Barus)
 * @version (March 1, 2018)
 */
public class Customer
{
    protected int id;
    protected String nama;
    
    public Customer()
    {
        
    }
    
    public Customer(int id, String nama){
        this.id = id;
        this.nama = nama;

    }
    
    public int getID()
    {
        return id;
    }
    
    public String getNama(){
    
        return nama;
    }
    
    /**
     * 
     * method setID digunakan untuk memasukkan nomor ID
     */
    public void setID(int id){
    
        this.id = id;
    }
    
    /**
     * 
     * method setNama digunakan untuk memasukkan nama
     */
    public void setNama(String nama){
    
        this.nama = nama;
    }
    
    /**
     * 
     * method print data digunakan untuk mencetak nama
     */
    public void printData()
    {
        System.out.println("Total nama :" +nama);
    }
}
