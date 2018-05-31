package jhotel;
import java.util.ArrayList;

/**
 * Kelas ini untuk menunjukkan serta mengelola informasi mengenai Data Customer Hotel
 *
 * @author Jan Harianda
 * @version 20-05-2018
 */
public class DatabaseCustomer {
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * method untuk membuat arraylist berisi customer
     *
     * @return CUSTOMER_DATABASE
     */
    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    /**
     * digunakan untuk mendapatkan ID dari customer terakhir
     *
     * @return LAST_CUSTOMER_ID
     */
    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    /**
     * untuk menambahkan data customer.
     *
     * @return true
     */
    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException {

        for(Customer pelanggan : CUSTOMER_DATABASE)
        {
            if(pelanggan.getID() == baru.getID() ||
                    pelanggan.getEmail().equals(baru.getEmail()))
            {
                throw new PelangganSudahAdaException(pelanggan);

            }
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID = baru.getID();
        return true;
    }


    /**
     *digunakan untuk mendapatkan customer dengan id yang ditentukan
     *
     * @param id menentukan id customer
     * @return customer
     */
    public static Customer getCustomer(int id) {
        for(Customer pelanggan : CUSTOMER_DATABASE)
        {
            if(pelanggan.getID() == id)
            {
                return pelanggan;
            }
        }

        return null;
    }


    /**
     * digunakan untuk mendapatkan customer yang login
     *
     * @param email menentukan nilai email
     * @param password menentukan nilai password
     * @return customer
     */
    public static Customer getCustomerLogin(String email, String password) {
       /*
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getEmail().equals(email)  && tes.getPassword().equals(password)){
                return tes;
            }
        }
        return null;
*/
        for(Customer cust : CUSTOMER_DATABASE){
            if (cust.getEmail().equals(email) && cust.getPassword().equals(password))
            {
                return cust;
            }
        }
        return null;
    }

    /**
     * digunakan untuk menghapus data customer.
     *
     * @return true
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