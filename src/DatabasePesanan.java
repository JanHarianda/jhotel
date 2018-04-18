import java.util.ArrayList;
import java.util.*;
import java.lang.*;
/**
 * Kelas ini menjelaskan tentang Database Pesanan yang berisi cara memsan kamar baru, remove pesanan, dan lainnya.
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class DatabasePesanan
{
    // Instance variable yang digunakan
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * Konstruktor dari class DatabasePesanan
     */
    public DatabasePesanan()
    {
    }

    /**
     * Method ini digunakan untuk menambah pesanan
     *
     * @param baru sebagai pesanan yang akan ditambahkan
     * @return true/false
     */
    public static boolean addPesanan(Pesanan baru)
    {
        if(baru.getStatusAktif()) {
            return false;
        } else{
            PESANAN_DATABASE.add(baru);
            DatabasePesanan.LAST_PESANAN_ID ++;
            return true;
        }
    }

    /**
     * Method ini digunakan untuk menghapus pesanan
     *
     * @param pesan sebagai pesanan yang akan dihapus
     * @return true/false
     */
    public static boolean removePesanan(Pesanan pesan)
    {
        for(Pesanan cari : PESANAN_DATABASE){
            if(cari.equals(pesan)){
                if(cari.getRoom() != null){
                    Administrasi.pesananDibatalkan(pesan);
                } else{
                    if(cari.getStatusAktif() == true){
                        cari.setStatusAktif(false);
                    }
                }

                PESANAN_DATABASE.remove(pesan);
                return true;
            }
        }

        return false;
    }

    /**
     * Method ini digunakan untuk mengambil pesanan
     *
     * @param id sebagai id dari pesanan
     * @return true/false
     */
    public static Pesanan getPesanan(int id)
    {
        for(Pesanan cari : PESANAN_DATABASE){
            if(cari.getID() == id){
                return cari;
            }
        }
        return null;
    }

    /**
     * Method ini digunakan untuk mengambil pesanan.
     *
     * @param kamar sebagai kamar yang disewa
     * @return cari sebagai objek dari Room
     */
    public static Pesanan getPesanan(Room kamar)
    {
        for(Pesanan cari : PESANAN_DATABASE){
            if(cari.getRoom() == kamar){
                return cari;
            }
        }
        return null;
    }


    /**
     * Method ini digunakan untuk mengambil database pesanan.
     *
     * @return PESANAN_DATABASE
     */
    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    /**
     * Method ini digunakan untuk mengambil pesanan aktif.
     *
     * @param pelanggan sebagai pelanggan yang memesan
     * @return cari sebagai  objek dari Pesanan atau null
     */
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan cari : PESANAN_DATABASE){
            if(cari.getPelanggan() == pelanggan && cari.getStatusAktif()){
                return cari;
            }
        }
        return null;
    }

    /**
     * Method ini digunakan untuk mengambil nilai terakhir dari ID pesanan.
     *
     * @return LAST_PESANAN_ID
     */
    public static int getLastPesananID()
    {
        return LAST_PESANAN_ID;
    }
}
