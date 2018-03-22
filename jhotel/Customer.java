import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.*;
import java.util.regex.*;

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
    protected String email;
    protected Date dob;
    
    /**
     * method setID digunakan untuk memasukkan nomor ID
     */
    
    public Customer(int idIn, String namaIn, int tanggal, int bulan, int tahun)  
    {
        this.id = id;
        this.nama = nama;
        dob = new Date(tahun, bulan, tanggal);
    }
    
    public Customer(int id1, String nama1, Date dob1) 
    {
        id = id1;
        nama = nama1;
        dob = dob1;
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
    
    public Date getDOB()
    {
        DateFormat formatter = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String output = formatter.format(dob);
        System.out.print(output);
        return dob;
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
     * Mutator untuk objek dari class Customer
     * untuk memberi email
     * 
     * @return email.
     */
    
    
    public void setEmail(String email){
        String pattern = 
            "^[_&*_~A-Za-z0-9-\\+]+(\\.[_&*_~A-Za-z0-9-]+)*@[A-Za-z0-9][A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
     
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(email);
        
        if (m.matches()){
            this.email = email;
        }
    }
    
    public void setDOB(Date dob) 
    {
        this.dob = dob;
    }
    
    public String toString() 
    {
        return null;
    }
    
    ///**
     //* method print data digunakan untuk mencetak nama
    // */
    //public void printData() 
    //{
       // System.out.println("Tampilan ID:" +id);
       // System.out.println("Total nama :" +nama);
    //}
}
