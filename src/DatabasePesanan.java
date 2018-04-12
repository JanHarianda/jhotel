import java.util.ArrayList;

/**
 * Kelas ini menjelaskan tentang Database Pesanan yang berisi cara memsan kamar baru, remove pesanan, dan lainnya.
 *
 *@author (Jan Harianda Barus)
 * @version (March 1, 2018)
 */
public class DatabasePesanan
{
   private static ArrayList<Pesanan> PESANAN_DATABASE;
   ArrayList<Pesanan> list = new ArrayList<Pesanan>();
   private int LAST_PESANAN_ID = 0;

   public static ArrayList<Pesanan> getPesananDatabase()
   {
       return PESANAN_DATABASE;
   }

   public static int getLastPesananID()
   {
       return 0;
   }

   public static boolean addPesanan(Pesanan baru)
   {
       return false;
    }
    
    public static Pesanan getPesanan(int id)
    {
        return null;
    }
    
   public static Pesanan getPesanan(Room kamar)
   {       
       return null;
   }

   public static Pesanan getPesananAktif(Customer pelanggan)
   {
       return null;
   }
    

    public static boolean removePesanan(Pesanan pesan)
    {
        return false;
    }
}
