package jhotel;

import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.text.*;
import java.util.GregorianCalendar;

/**
 * kelas ini menjelaskan tentang identitas bakal calon pengguna kamar hotel
 * yang berupa id number, nama, dan lainnya.
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */


public class Customer
{
    protected int id;
    protected String nama;
    protected String email;
    protected String password;
    protected Date dob;


    /**
     * Constructor for objects of class Customer
     *
     * @param nama nama customer
     * @param tanggal tanggal lahir
     * @param bulan bulan lahir
     * @param tahun tahun lahir
     * @param email email login customer
     * @param password password lahir customer
     */
    public Customer(String nama, int tanggal, int bulan, int tahun, String email, String password)
    {
        this.id=DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = new GregorianCalendar(tahun,bulan,tanggal).getTime();
        this.email = email;
        this.password = password;
    }

    /**
     * Constructor for objects of class Customer
     *
     * @param nama1 nama customer
     * @param dob1 tanggal lahir
     * @param email1 email login customer
     * @param password1 password lahir customer
     */
    public Customer(String nama1, Date dob1, String email1, String password1)
    {
        id = DatabaseCustomer.getLastCustomerID()+1;
        nama = nama1;
        dob = dob1;
        email = email1;
        password = password1;
    }


    /**
     * Method untuk mendapat password dan mengembalikannya
     *
     * @return password customer
     */
    public String getPassword()
    {
        return password;
    }


    /**
     * Method yang digunakan untuk mendapatkan nilai ID dari pelanggan.
     * @return int nilai ID dari pelanggan.
     */

    public int getID()
    {
        return id;
    }

    /**
     * Method yang digunakan untuk mendapatkan nama dari pelanggan.
     * @return String nama dari pelanggan.
     */

    public String getNama()
    {
        return nama;
    }


    /**
     * Method yang digunakan untuk mendapatkan email dari pelanggan.
     * @return String email dari pelanggan.
     */

    public String getEmail()
    {
        return email;
    }


    /**
     * Method yang digunakan untuk mendapatkan tanggal lahir dari pelanggan.
     * @return Date tanggal lahir dari pelanggan.
     */

    public Date getDOB()
    {
        DateFormat formatter = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String output = formatter.format(dob);

        System.out.print(output);

        return dob;
    }
    /**
     * Method untuk menset password dengan parameter String password
     *
     * @param password customer
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    /**
     * Method yang digunakan untuk mengubah nilai ID pelanggan.
     * @param id input yang dimasukkan untuk mengubah nilai ID pelanggan.
     */

    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * Method yang digunakan untuk mengubah nama pelanggan.
     * @param nama input yang dimasukkan untuk mengubah nama pelanggan.
     */

    public void setNama(String nama)
    {
        this.nama = nama;
    }


    /**
     * Method yang digunakan untuk mengubah email pelanggan.
     * @param email input yang dimasukkan untuk mengubah email pelanggan.
     */

    public void setEmail(String email){
        String pattern =
                "^[_&*_~A-Za-z0-9-\\+]+(\\.[_&*_~A-Za-z0-9-]+)*@[A-Za-z0-9][A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);

        if (m.matches()){
            this.email = email;
        }
        else {
            System.out.println("Salah");
            this.email=null;}

    }


    /**
     * Method yang digunakan untuk mengubah tanggal lahir pelanggan.
     * @param dob input yang dimasukkan untuk mengubah tanggal lahir pelanggan.
     */

    public void setDOB(Date dob)
    {
        this.dob = dob;
    }


    /**
     * Method yang digunakan untuk mengembalikan data dari kelas Customer dalam bentuk String.
     */

    public String toString(){
        if(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id)) != null){
            return  "\nCustomer ID  : "+id+
                    "\nName         : "+nama+
                    "\nE-Mail       : "+email+
                    "\nDate of Birth: "+dob+
                    "\nBooking order is in progress";
        }
        else{
            return  "\nCustomer ID  : "+id+
                    "\nName         : "+nama+
                    "\nE-Mail       : "+email+
                    "\nDate of Birth: "+dob;
        }
    }
}