package jhotel;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
/** 
 * kelas ini memodelkan sistem pesanan dalam memesan kamar hotel
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */


public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
    private int id;
    private boolean isAktif;


    /**
     * Overloading Constructor for objects of class Pesanan.
     *
     * @param jumlahHari berisi jumlah hari
     * @param pelanggan objek Customer
     */
    public Pesanan(double jumlahHari, Customer pelanggan )
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        tanggalPesan = new Date();
        //biaya = kamar.getDailyTariff() * jumlahHari;
        id = DatabasePesanan.getLastPesananID() + 1;
        isAktif = true;
        tanggalPesan = new Date();
    }

    /**
     * digunakan untuk mendaptkan nilai id pesanan
     *
     * @return id
     */
    public int getID()
    {
        return id;
    }

    /**
     * digunakan untuk mendapatkan nilai biaya.
     *
     * @return biaya
     */
    public double getBiaya()
    {
        return biaya;
    }

    /**
     * digunakan untuk mendaptkan nilai jumlah hari
     *
     * @return jumlahHari
     */
    public double getJumlahHari()
    {
        return jumlahHari;
    }

    /**
     * method ini digunakan untuk menampilkan info pelanggan
     *
     *
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }

    /**
     * Digunakan untuk mendapatkan nilai status aktif.
     *
     * @return isAktif
     */
    public boolean getStatusAktif()
    {
        return isAktif;
    }

    /**
     * method ini digunakan untuk menampilkan status Pesanan
     *
     *
     * @return true/false
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }


    /**
     * method ini digunakan untuk menampilkan status Pesanan Selesai atau belum
     *
     *
     * @return isSelesai
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }

    /**
     * digunakan untuk mendaptakan nilai room
     *
     * @return room
     */
    public Room getRoom()
    {
        return kamar;
    }

    /**
     * digunakan untuk mendaptakan nilai tanggal pesan
     *
     * @return tanggalPesan
     */
    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }

    /**
     * untuk menentukan nilai id.
     *
     *
     */
    public void setID()
    {
        this.id = id;
    }

    /**
     *untuk menentukan nilai biaya
     *
     */
    public void setBiaya()
    {
        biaya = kamar.getDailyTariff()*jumlahHari;
    }

    /**
     *untuk menentukan nilai biaya
     *
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }

    /**
     * untuk menenetukan nilai pelanggan.
     *
     * @param pelanggan objek Costumer
     */
    public void setPelanggan(Customer pelanggan) //atau customer baru
    {
        this.pelanggan = pelanggan;
    }


    /**
     * method ini digunakan untuk memberi nilai status diproses
     *
     *
     * @return diproses
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }

    /**
     * method ini digunakan untuk memberi nilai status selesai
     *
     * @return selesai
     */
    public void setStatusSelesai(boolean selesai)
    {
        isSelesai = selesai;
    }

    /**method ini digunakan untuk memberi nilai status aktif
     *
     *
     * @return aktif
     */
    public void setStatusAktif(boolean aktif)
    {
        isAktif = aktif;
    }

    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }

    public void setTangalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }

    public String toString(){
        String final_status = "KOSONG";
        if(isDiproses == true && isSelesai == false) final_status = "DIPROSES";
        else if(isDiproses == false && isSelesai == false) final_status = "KOSONG";
        else if(isDiproses == false && isSelesai == true) final_status = "SELESAI";

        if (kamar != null) {
            return "\n Pesanan" +
                    "\n pelanggan=" + pelanggan.getNama() +
                    "\n jumlah hari =" + jumlahHari +
                    "\n hotel=" + kamar.getHotel().getNama() +
                    "\n kamar=" + kamar.getNomorKamar() +
                    "\n tipeKamar=" + kamar.getTipeKamar() +
                    "\n status='" + final_status;
        }
        return "\n Pesanan" +
                "\n pelanggan=" + pelanggan.getNama() +
                "\n jumlah hari=" + jumlahHari +
                "\n hotel=null" +
                "\n kamar=null" +
                "\n tipeKamar=" +
                "\n status='" + final_status;
    }


    /* *
     *
     * Method printData()
     digunakan untuk mencetak biaya
     *

    public void printData()
    {
        System.out.println(" Nama Pelanggan : " +pelanggan.getNama());
        System.out.println(" Status Diproses : " +isDiproses);
        System.out.println(" Status Selesai : " +isSelesai);
        System.out.println(" Jumlah Hari : " +jumlahHari);
        System.out.println(" Biaya : " +biaya);

    }
    */
}