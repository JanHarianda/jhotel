import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.*;
import java.util.regex.*;

/**
 * kelas ini menjelaskan tentang identitas bakal calon pengguna kamar hotel
 * yang berupa id number, nama, dan lainnya.
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
import java.util.Date;
import java.util.regex.*;
import java.util.*;
import java.text.*;

public class Customer
{
    // Instance variable yang digunakan pada class Customer
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    SimpleDateFormat dmy = new SimpleDateFormat ("dd MMMMMMMMM yyyy");

    /**
     * Konstruktor dari class Customer.
     *
     * @param nama sebagai nama pelanggan
     * @param tanggal sebagai tanggal lahir pelanggan
     * @param bulan sebagai bulan lahir pelanggan
     * @param tahun sebagai tahun lahir pelanggan
     */
    public Customer(String nama, int tanggal, int bulan, int tahun)
    {
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun, bulan-1, tanggal).getTime();
    }

    /**
     * Constructor dari class Customer.
     *
     * @param nama  nama pelanggan
     * @param dob  waktu kelahiran pelanggan
     */
    public Customer(String nama, Date dob)
    {
        this.id = DatabaseCustomer.getLastCustomerID() + 1;
        this.nama = nama;
        this.dob = dob;
        this.dob.setMonth(dob.getMonth()-1);
    }

    /**
     * Method ini digunakan untuk mengubah ID customer.
     *
     * @param id  ID pelanggan
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * Method ini digunakan untuk mengubah nama customer.
     *
     * @param nama  nama pelanggan
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setEmail(String email)
    {
        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            System.out.println("Email valid");
            this.email = email;
        }
        else {
            System.out.println("Email tidak valid");
        }
    }

    /**
     * Method untuk menset waktu kelahiran pelanggan.
     *
     * @param dob  waktu kelahiran pelanggan
     */
    public void setDOB(Date dob)
    {
        this.dob = dob;
    }

    /**
     * Method ini digunakan untuk mengambil ID customer.
     *
     * @return id
     */
    public int getID()
    {
        return id;
    }

    /**
     * Method ini digunakan untuk mengambil nama customer.
     *
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * Method ini digunakan untuk mengambil email pelanggan.
     * @return email
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Method ini digunakan untuk mengambil waktu kelahiran pelanggan.
     *
     * @return dob
     */
    public Date getDOB()
    {
        return dob;
    }

    /**
     * Method ini digunakan untuk mencetak nama dan ID
     * pelanggan.
     *
     * @return informasi pelanggan
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) != null){
            return ("Customer ID    : " + getID() +
                    "\nName           : " + getNama() +
                    "\nE-mail         : " + getEmail() +
                    "\nDate of Birth  : " + dmy.format(getDOB()) +
                    "\nBooking order is in process.");
        }
        else {
            return ("Customer ID    : " + getID() +
                    "\nName           : " + getNama() +
                    "\nE-mail         : " + getEmail() +
                    "\nDate of Birth  : " + dmy.format(getDOB()));
        }
    }
}
