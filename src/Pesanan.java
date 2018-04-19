import java.util.Date;
/** 
 * kelas ini memodelkan sistem pesanan dalam memesan kamar hotel
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */

import java.util.*;

public class Pesanan
{
    // Instance variabel pada kelas Pesanan
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    /**
     * Konstruktor kelas Pesanan.
     *
     * @param pelanggan sebagai customer pemesan
     * @param jumlahHari sebagai durasi pesanan
     */
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.isAktif = true;
        //this.biaya = jumlahHari * getRoom().getDailyTariff();
        this.tanggalPesan = new Date();
        this.id = DatabasePesanan.getLastPesananID() + 1;
    }

    /**
     * Method ini digunakan untuk mengeset ID pesanan.
     *
     * @param id sebagai ID pesanan
     */
    public void setID(int id)
    {
        this.id = id;
    }

    /**
     * Method ini digunakan untuk mengubah nilai biaya.
     */
    public void setBiaya()
    {
        biaya = jumlahHari * getRoom().getDailyTariff();
    }

    /**
     * Method ini digunakan untuk mengeset pelanggan.
     *
     * @param pelanggan pelanggan yang memesan
     */
    public void setPelanggan(Customer pelanggan)
    {
        this.pelanggan = pelanggan;
    }

    /**
     * Method ini digunakan untuk mengeset durasi menginap.
     *
     * @param jumlahHari lamanya pesanan
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }

    /**
     * Method ini digunakan untuk mengeset status pesanan
     * apakah aktif atau tidak.
     *
     * @param isAktif sebagai parameter status pesanan
     */
    public void setStatusAktif(boolean isAktif)
    {
        this.isAktif = isAktif;
    }

    /**
     * Method ini digunakan untuk mengubah status proses menjadi
     * sedang diproses.
     *
     * @param diproses parameter proses pesanan
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }

    /**
     * Method ini digunakan untuk mengubah status proses menjadi
     * sudah selesai.
     *
     * @param diproses parameter selesai pesanan
     */
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }

    /**
     * Method ini digunakan untuk mengeset objek kamar.
     *
     * @param kamar kamar yang dipesan
     */
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }

    /**
     * Method ini digunakan untuk mengeset tanggal pesanan.
     *
     * @param tanggalPesan sebagai waktu pesan
     */
    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }

    /**
     * Method ini digunakan untuk mengambil ID pesanan.
     *
     * @return ID pesanan
     */
    public int getID()
    {
        return id;
    }

    /**
     * Method ini digunakan untuk mendapat nilai biaya.
     *
     * @return biaya
     */
    public double getBiaya()
    {
        return biaya;
    }

    /**
     * Method ini digunakan untuk mengambil nilai durasi penginapan.
     *
     * @return jumlahHari
     */
    public double getJumlahHari()
    {
        return jumlahHari;
    }

    /**
     * Method ini digunakan untuk mengambil objek pelanggan.
     *
     * @return pelanggan
     */
    public Customer getPelanggan()
    {
        return pelanggan;
    }

    /**
     * Method ini digunakan untuk mengambil status aktif dari
     * pesanan.
     *
     * @return isAktif
     */
    public boolean getStatusAktif()
    {
        return isAktif;
    }

    /**
     * Method ini digunakan untuk mengetahui status dari proses.
     *
     * @return isDiproses
     */
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }

    /**
     * Method ini digunakan untuk mengetahui status dari proses.
     * apakah sudah selesai atau belum.
     *
     * @return isSelesai
     */
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }

    /**
     * Method ini digunakan untuk mengambil nilai objek kamar.
     *
     * @return kamar
     */
    public Room getRoom()
    {
        return kamar;
    }

    public Date getTanggalPesan()
    {
        return tanggalPesan;
    }

    /**
     * Method ini digunakan untuk menampilkan nama pelanggan,
     * tipe kamar, dan status.
     *
     * @return tidak ada
     */
    public String toString() {

        String final_status = "KOSONG";
        if (this.isDiproses && !this.isSelesai) {
            final_status = "DIPROSES";
        } else if (!this.isDiproses && !this.isSelesai) {
            final_status = "KOSONG";
        } else if (!this.isDiproses && this.isSelesai) {
            final_status = "SELESAI";
        }

        if (kamar != null) {
            return "Dibuat oleh " + getPelanggan().getNama()
                    + ". Proses booking untuk " + getRoom().getHotel().getNama()
                    + " kamar nomor " + getRoom().getNomorKamar()
                    + " dengan tipe kamar yang diinginkan " + getRoom().getTipeKamar().toString()
                    + ". Status: " + final_status + ".\n";
        } else {
            return "Dibuat oleh " + getPelanggan().getNama()
                    + ". Proses booking null "
                    + "kamar nomor null "
                    + "dengan tipe kamar yang diinginkan null "
                    + ". Status: " + final_status + ".";
        }
    }}