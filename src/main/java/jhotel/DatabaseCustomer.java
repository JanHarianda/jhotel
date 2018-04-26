package jhotel;
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

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID()
    {
        return LAST_CUSTOMER_ID;
    }

    /**
     * Method ini digunakan untuk menambah customer.
     *
     * @param baru sebagai penanda pelanggan baru
     * @return true/false
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        for(Customer cari : CUSTOMER_DATABASE){
            if(baru.getID() == cari.getID() || cari.getEmail().equals(baru.getEmail())){
                throw new PelangganSudahAdaException(baru);
                //return false
            }
        }

        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }

    /**
     * Method ini digunakan untuk mengambil pelanggan
     *
     * @param id  sebagai penanda ID pelanggan yang akan diambil
     * @return cari sebagai objek dari pelanggan yang dipanggil
     */
    public static Customer getCustomer(int id)
    {
        for(Customer cari : CUSTOMER_DATABASE)
        {
            if(cari.getID() == id)
            {
                return cari;
            }
        }

        return null;
    }

    public static Customer getCustomerLogin(String email, String password)
    {
        for (Customer cust : CUSTOMER_DATABASE) {
            if (cust.getEmail() == email && cust.getPassword() == password)
                return cust;
        }
        return null;
    }


    /**
     * Method ini digunakan untuk menghapus customer.
     *
     * @param id sebagai penanda ID pelanggan baru
     * @return true/false
     */
    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
    {
        for(Customer pelanggan : CUSTOMER_DATABASE)
        {
            if(pelanggan.getID() == id)
            {
                try
                {
                    DatabasePesanan.removePesanan(
                            DatabasePesanan.getPesananAktif(pelanggan));
                }
                catch(PesananTidakDitemukanException a)
                {
                    throw new PelangganTidakDitemukanException(id);
                }

                if(CUSTOMER_DATABASE.remove(pelanggan))
                {
                    return true;
                }
            }
        }

        throw new PelangganTidakDitemukanException(id);
        //return false;
    }

}
