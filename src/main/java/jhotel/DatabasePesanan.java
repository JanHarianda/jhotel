package jhotel;
import java.util.ArrayList;

/**
 * Kelas ini menjelaskan tentang Database Pesanan yang berisi cara memsan kamar baru, remove pesanan, dan lainnya.
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class DatabasePesanan
{
    /*
     * Deklarasi variable
     */
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;
    private static String[] list_pesanan;

    /**
     * Method untuk mengambil seluruh database pesanan
     *
     * @return PESANAN_DATABASE
     */
    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    /**
     * Method untuk mendapatkan id pesanan terakhir
     *
     * @return LAST_PESANAN_ID
     */
    public static int getLastPesananId(){
        return LAST_PESANAN_ID;
    }

    /**
     * Metode untuk menambah pesanan
     *
     * @param baru pesanan baru
     * @throws PesananSudahAdaException exeption pesanan kalo udah ada
     *
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getID() == baru.getID())
            {
                if(pesanan.getStatusAktif() == true)
                {
                    throw new PesananSudahAdaException(pesanan);
                    //return false;
                }
                else
                {
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
     * Metode untuk menghapus pesanan
     *
     * @param pesan pesanan
     * @throws PesananTidakDitemukanException exeption jika pesanan tidak ada
     *
     */
    public static boolean removePesanan(Customer pesan) throws PesananTidakDitemukanException
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getPelanggan().equals(pesan)){
                if(tes.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(tes);
                }
                else
                {
                    if(tes.getStatusAktif())
                    {
                        tes.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        throw new PesananTidakDitemukanException(pesan);
    }

    /**
     * Metode untuk mengambil pesanan berdasarkan id
     *
     * @param id id pesanan
     * @return tes pesanan terpilih
     *
     */
    public static Pesanan getPesanan(int id)
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getID()==id){
                return tes;
            }
        }
        return null;
    }

    /**
     * Metode untuk mengambil pesanan berdasarkan kamar
     *
     * @param kamar kamar pesanan
     * @return pesanan pesanan terpilih
     *
     */
    public static Pesanan getPesananAktif(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getRoom().equals(kamar) && pesanan.getStatusAktif())
            {
                return pesanan;
            }
        }

        return null;
    }

    /**
     * Metode untuk mengambil pesanan berdasarkan customer
     *
     * @param pelanggan customer pesanan
     * @return tes pesanan terpilih
     *
     */
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for (int i = 0; i < PESANAN_DATABASE.size(); i++) {
            Pesanan tes = PESANAN_DATABASE.get(i);
            if (tes.getStatusAktif()==true&&tes.getPelanggan().equals(pelanggan)){
                return tes;
            }
        }
        return null;
    }
}