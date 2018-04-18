import java.util.ArrayList;

/**
 * Kelas ini menjelaskan tentang database customer, dimana ada add, remove, dan melihat databse customer
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class DatabaseCustomer
{
    // Instance variable yang digunakan pada class
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Konstruktor dari class DatabaseCustomer.
     */
    public DatabaseCustomer()
    {
    }

    /**
     * Method ini digunakan untuk menambah customer.
     *
     * @param baru sebagai penanda pelanggan baru
     * @return true/false
     */
    public static boolean addCustomer(Customer baru)
    {
        for(Customer cari : CUSTOMER_DATABASE){
            if(baru.getID() == cari.getID()){
                return false;
            }
        }

        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    /**
     * Method ini digunakan untuk menghapus customer.
     *
     * @param id sebagai penanda ID pelanggan baru
     * @return true/false
     */
    public static boolean removeCustomer(int id)
    {
        for(Customer cari : CUSTOMER_DATABASE){
            if(cari.getID() == id){
                for(Pesanan cari2 : DatabasePesanan.getPesananDatabase()){
                    if(cari2.getPelanggan() == cari){
                        DatabasePesanan.removePesanan(cari2);
                    }
                }

                CUSTOMER_DATABASE.remove(cari);
                return true;
            }
        }

        return false;
    }

    /**
     * Method ini digunakan untuk mengambil pelanggan
     *
     * @param id  sebagai penanda ID pelanggan yang akan diambil
     * @return cari sebagai objek dari pelanggan yang dipanggil
     */
    public static Customer getCustomer(int id)
    {
        for(Customer cari : CUSTOMER_DATABASE){
            if(cari.getID() == id){
                return cari;
            }
        }

        return null;
    }

    /**
     * Method ini digunakan untuk mengambil database customer.
     *
     * @return CUSTOMER_DATABASE  sebagai database pelanggan
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    /**
     * Method ini digunakan untuk memanggil ID terakhir customer
     * dari database.
     *
     * @return LAST_CUSTOMER_ID
     */
    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }
}
