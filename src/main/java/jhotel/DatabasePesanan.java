package jhotel;
import java.util.ArrayList;
import java.util.*;
import java.lang.*;
/**
 * Kelas ini menjelaskan tentang Database Pesanan yang berisi cara memsan kamar baru, remove pesanan, dan lainnya.
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class DatabasePesanan {
    // Instance variable yang digunakan
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;

    /**
     * Method ini digunakan untuk mengambil database pesanan.
     *
     * @return PESANAN_DATABASE
     */
    public static ArrayList<Pesanan> getPesananDatabase() {
        return PESANAN_DATABASE;
    }

    /**
     * Method ini digunakan untuk mengambil nilai terakhir dari ID pesanan.
     *
     * @return LAST_PESANAN_ID
     */
    public static int getLastPesananID() {
        return LAST_PESANAN_ID;
    }


    /**
     * Method ini digunakan untuk menambah pesanan
     *
     * @param baru sebagai pesanan yang akan ditambahkan
     * @return true/false
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        for (Pesanan pesanan : PESANAN_DATABASE)
        {
            if (pesanan.getID() == baru.getID())
            {
                if (pesanan.getStatusAktif() == true)
                {
                    throw new PesananSudahAdaException(pesanan);
                    //return false;
                } else {
                    LAST_PESANAN_ID = baru.getID();
                    PESANAN_DATABASE.add(baru);
                    return true;
                }
            }
        }
        LAST_PESANAN_ID = baru.getID();
        PESANAN_DATABASE.add(baru);
        return true;
    }

    /**
     * Method ini digunakan untuk mengambil pesanan
     *
     * @param id sebagai id dari pesanan
     * @return true/false
     */
    public static Pesanan getPesanan(int id)
    {
        for (Pesanan cari : PESANAN_DATABASE)
        {
            if (cari.getID() == id)
            {
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
    public static Pesanan getPesanan(Room kamar) {
        for (Pesanan cari : PESANAN_DATABASE)
        {
            if (cari.getRoom() == kamar)
            {
                return cari;
            }
        }
        return null;
    }

    /**
     * Method ini digunakan untuk mengambil pesanan aktif.
     *
     * @param pelanggan sebagai pelanggan yang memesan
     * @return cari sebagai  objek dari Pesanan atau null
     */
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for (Pesanan cari : PESANAN_DATABASE)
        {
            if (cari.getPelanggan() == pelanggan && cari.getStatusAktif())
            {
                return cari;
            }
        }
        return null;
    }

    /**
     * Method ini digunakan untuk menghapus pesanan
     *
     * @param pesan sebagai pesanan yang akan dihapus
     * @return true/false
     */
    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException {
        for (Pesanan pesanan : PESANAN_DATABASE)
        {
            if (pesanan.equals(pesan))
            {
                if (pesanan.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(pesanan);
                } else
                    {
                    if (pesanan.getStatusAktif())
                    {
                        pesanan.setStatusAktif(false);
                    }
                }

                if (PESANAN_DATABASE.remove(pesanan))
                {
                    return true;
                }
            }
        }

        throw new PesananTidakDitemukanException(pesan.getPelanggan());
        //return false;
    }
}