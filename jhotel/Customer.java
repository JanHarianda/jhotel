/**
 * kelas ini menjelaskan tentang identitas bakal calon pengguna kamar hotel
 * yang berupa id number, nama, dan lainnya.
 * 
 * @author (Jan Harianda Barus)
 * @version (March 10, 2018)
 */
public class Customer
{
    protected int id;
    protected String nama;
    
    /**
     * method setID digunakan untuk memasukkan nomor ID
     */
    
    public Customer(int id, String nama) 
    {
        this.id = id;
        this.nama = nama;
    }
    
    /**
     * method getID digunakan untuk mendapatkan nomor ID
     */
    
    public int getID() 
    {
        return id;
    }
    
    /**
     * method setID digunakan untuk mendapatkan nama
     */
    
    public String getNama() 
    {
        return nama;
    }
    
    /**
     * method setID digunakan untuk memasukkan nomor ID
     */
    public void setID(int id){
    
        this.id = id;
    }
    
    /**
     * method setNama digunakan untuk memasukkan nama
     */
    public void setNama(String nama) 
    {
        this.nama = nama;
    }
    
    /**
     * method print data digunakan untuk mencetak nama
     */
    public void printData() 
    {
        System.out.println("Tampilan ID:" +id);
        System.out.println("Total nama :" +nama);
    }
}
