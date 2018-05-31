package jhotel;
/**
 * Kelas ini mendeskripsikan tentang ruangan.
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 * 
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private Hotel hotel;
    private String nomor_kamar;
    public double dailyTariff;
    private StatusKamar status_kamar;



    /**
     * Constructor for objects of class Room
     */
    /* perubahan pada modul 6
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.status_kamar = status_kamar;
    }
    */

    /**
     * Overloading Constructor untuk kelas Room
     *
     * @param hotel objek hotel
     * @param nomor_kamar nilai nomor kamar
     */
    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        status_kamar = StatusKamar.VACANT;
    }

    /**
     * untuk mendapatkan nilai hotel.
     *
     * @return hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }// put your code here

    /**
     * untuk mendapatkan nilai nomor kamar.
     *
     * @return nomor_kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }

    /**
     * untuk mendapatkan nilai tarif.
     *
     * @return dailyTariff
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }

    /**
     * untuk mengetahui status kamar.
     *
     * @return status_kamar
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }

    /**
     * abstract method untuk mendapatkan tipe kamar
     *
     */
    public abstract TipeKamar getTipeKamar();


    /**
     * digunakan untuk menset nilai hotel.
     *
     * @param hotel objek hotel
     */
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }

    /**
     * digunakan untuk menset nilai nomor kamar.
     *
     * @param nomor_kamar nilai nomor kamar
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }

    /**
     * untuk menset nilai tarif.
     *
     * @param dailyTariff nilai daily tariff
     */
    public void setDailyTariff(double dailyTariff)
    {
        this.dailyTariff = dailyTariff;
    }

    /**
     * untuk menset nilai status kamar.
     *
     * @param status_kamar nilai status kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

    public String toString(){
        if(DatabasePesanan.getPesananAktif(this) == null){
            return "\nNama hotel  : " + hotel.getNama() +
                    "\nTipe kamar  : " + getTipeKamar() +
                    "\nHarga       : " + dailyTariff +
                    "\nStatus kamar: " + status_kamar;
        }
        else{
            return "\nNama hotel  : " + hotel.getNama() +
                    "\nTipe kamar  : " + getTipeKamar().toString() +
                    "\nHarga       : " + dailyTariff +
                    "\nStatus kamar: " + status_kamar +
                    "\nPelanggan   : " + DatabasePesanan.getPesananAktif(this).getPelanggan().getNama();
        }
    }

}


