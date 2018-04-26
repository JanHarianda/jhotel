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
    // instance variables
    private Hotel hotel;
    private String nomor_kamar;
    protected double dailyTariff;
    private StatusKamar status_kamar;

    /**
     * Konstruktor dari class Room.
     *
     * @param hotel sebagai hotel yang memiliki kamar
     * @param nomor_kamar  nomor kamar
     */
    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
    }

    /**
     * Method ini digunakan untuk mengeset hotel.
     *
     * @param hotel hotel pemilik kamar
     */
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }

    /**
     * Method ini digunakan untuk mengeset nomor kamar.
     *
     * @param nomor_kamar sebagai nomor kamar
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }

    /**
     * Method untuk digunakan mengeset tarif per hari.
     *
     * @param dailyTariff sebagai tarif sewa harian
     */
    public void setDailyTariff(double dailyTariff)
    {
        this.dailyTariff = dailyTariff;
    }

    /**
     * Method digunakan untuk mengeset status kamar.
     *
     * @param status_kamar status kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

    /**
     * Method digunakan untuk mengambil nilai hotel.
     *
     * @return hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }

    /**
     * Method ini digunakan untuk mengambil nilai nomor kamar.
     *
     * @return nomor_kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }

    /**
     * Method ini digunakan untuk mengambil nilai tarif harian.
     *
     * @return dailyTariff
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }

    /**
     * Method ini digunakan untuk mengambil status kamar.
     *
     * @return status_kamar
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }

    /**
     * Method ini digunakan untuk mengambil nilai tipe kamar.
     */
    public abstract TipeKamar getTipeKamar();

    /**
     * Method untuk mengembalikan informasi kamar.
     *
     * @return informasi kamar
     */
    public String toString()
    {
        //DatabasePesanan.getPesanan(this);
        if(DatabasePesanan.getPesanan(this) == null){
            return ("Nama hotel  : " + getHotel().getNama() +
                    "\nTipe kamar  : " + getTipeKamar() +
                    "\nHarga       : IDR " + getDailyTariff() +
                    "\nStatus kamar: " + getStatusKamar());
        }
        else {
            return ("Nama hotel  : " + getHotel().getNama() +
                    "\nTipe kamar  : " + getTipeKamar() +
                    "\nHarga       : IDR " + getDailyTariff() +
                    "\nStatus kamar: " + getStatusKamar() +
                    "\nPelanggan   : " + DatabasePesanan.getPesanan(this).getPelanggan());
        }
    }
}


