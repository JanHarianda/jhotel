package jhotel;
import org.springframework.core.type.StandardMethodMetadata;
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
     * Method yang digunakan untuk mengambil data pelanggan dari dalam database.
     *
     * @return ArrayList<Customer> mengembalikan data dari database.
     */

    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    /**
     * Method yang digunakan untuk mengambil data id terakhir dari dalam database.
     * @return int mengembalikan data id terakhir dari database.
     */

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
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()== baru.getID()||tes.getEmail().equals(baru.getEmail())){
                throw new PelangganSudahAdaException(baru);
            }
        }
        LAST_CUSTOMER_ID=baru.getID();
        CUSTOMER_DATABASE.add(baru);
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
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==id){
                return tes;
            }
        }
        return null;
    }

    public static Customer getCustomerLogin(String email, String password)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getEmail().equals(email)&&tes.getPassword().equals(password)){
                return tes;
            }
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
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==id){
                Pesanan pesan = DatabasePesanan.getPesananAktif(tes);
                try {
                    DatabasePesanan.removePesanan(tes);
                } catch (PesananTidakDitemukanException test){
                    System.out.println(test.getPesan());
                }
                if(CUSTOMER_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        throw new PelangganTidakDitemukanException(id);
    }

}
