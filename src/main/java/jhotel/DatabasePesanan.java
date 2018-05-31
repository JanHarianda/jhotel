package jhotel;
import java.util.ArrayList;

/**
 * Kelas ini untuk menunjukkan informasi mengenai Data Pesanan Hotel
 *
 * @author Jan Harianda
 * @version 20-05-2018
 */
public class DatabasePesanan
{
    //private static String[] list_pesanan;
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan>();
    private static int LAST_PESANAN_ID = 0;



    /**
     * method yang digunakan untuk membuat arraylist berisi pesanan
     *
     * @return PESANAN_DATABASE
     */
    public static ArrayList<Pesanan> getPesananDatabase()
    {
        return PESANAN_DATABASE;
    }

    /**
     * digunakan untuk mendapatkan ID dari pesanan terakhir
     *
     * @return LAST_PESANAN_ID
     */
    public static int getLastPesananID()
    {
        return LAST_PESANAN_ID;
    }

    /**
     * method ini digunakan untuk menambah pesanan baru ke database
     *
     *
     * @param baru
     *
     */
    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException
    {
        /*
        if(PESANAN_DATABASE.contains(baru))
        {
            if(baru.getStatusAktif())
            {
                throw new PesananSudahAdaException(baru);
            }
            else
            {
                LAST_PESANAN_ID = baru.getID();
                PESANAN_DATABASE.add(baru);
                return true;
            }
        }
        else
        {
            LAST_PESANAN_ID = baru.getID();
            PESANAN_DATABASE.add(baru);
            return true;
        }

        PART 2
        for(Pesanan pesan : PESANAN_DATABASE){
            if(pesan.getStatusAktif() && pesan.getID() == baru.getID()){
                throw new PesananSudahAdaException(baru);
            }
        }
        LAST_PESANAN_ID = baru.getID();
        PESANAN_DATABASE.add(baru);
        return true;
        */
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
     * Digunakan untuk mengambil data pemesan
     *
     * @param id
     * @return pesanan mengembalikan data pemesanan jika id yang dipesan telah ada.
     */
    public static Pesanan getPesanan(int id)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getID() == id)
            {
                return pesanan;
            }
        }

        return null;
    }

    /**
     * Digunakan Untuk mengambil data pemesanan.
     *
     * @return Pesanan mengembalikan data pemesanan jika Room yang dipesan telah ada.
     */
    public static Pesanan getPesananAktif(Room kamar)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getRoom().equals(kamar)&& pesanan.getStatusAktif())
            {
                return pesanan;
            }
        }

        return null;
    }



    /**
     * method ini digunakan untuk mendapatkan data pesanan aktif
     *
     * @param pelanggan
     * @return pesanan
     */
    public static Pesanan getPesananAktif(Customer pelanggan)
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.getPelanggan().equals(pelanggan) && pesanan.getStatusAktif()==true)
            {
                return pesanan;
                /*
                if(pesanan.getStatusAktif() == true)
                {
                    return pesanan;
                }
                */
            }
        }

        return null;
    }

    /**
     * digunakan untuk menghapus pesanan dari database.
     *
     * @param pesan berisi objek pesanan.
     */
    public static boolean removePesanan(Customer pesan) throws PesananTidakDitemukanException
    {
        for(Pesanan pesanan : PESANAN_DATABASE)
        {
            if(pesanan.equals(pesan))
            {
                if(pesanan.getRoom() != null)
                {
                    Administrasi.pesananDibatalkan(pesanan);
                }
                else
                {
                    if(pesanan.getStatusAktif())
                    {
                        pesanan.setStatusAktif(false);
                    }
                }

                if(PESANAN_DATABASE.remove(pesanan))
                {
                    return true;
                }
            }
        }

        throw new PesananTidakDitemukanException(pesan);
    }




}