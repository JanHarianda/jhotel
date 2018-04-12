import java.util.ArrayList;

/**
 * Kelas ini menjelaskan tentang database customer, dimana ada add, remove, dan melihat databse customer
 * 
 * @author (Jan Harianda Barus)
 * @version (April 12, 2018)
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE;
    private static int LAST_CUSTOMER_ID;

    public static ArrayList<Customer> getCustomerDatabse()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerId;

    public static boolean addCustomer(Customer baru)
    {
        return false;
    }

    public static Customer getCustomer(int id)
    {
        return null ;
    }
    
    public static boolean removeCustomer(int id)
    {
        return false;
    }
}
