/**
 * Kelas ini menjelaskan tentang Database Pesanan yang berisi cara memsan kamar baru, remove pesanan, dan lainnya.
 *
 *@author (Jan Harianda Barus)
 * @version (March 1, 2018)
 */
public class DatabasePesanan
{
   private String[] list_pesanan;
   
   public boolean addPesanan(Pesanan baru)
   {
       return false;
    }
    
   public boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
    
   public Pesanan getPesanan(Customer cust){
       
       return null;
   }
    
   public String[] getPesananDatabase(){
       
       return list_pesanan;
   }
    
   public void pesananDibatalkan(Pesanan pesan)
   {
       
    }
}
