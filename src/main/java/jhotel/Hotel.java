package jhotel;
/**
 * kelas ini memodelkan Hotel
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class Hotel
{
    /*
     * Instance variable untuk class Hotel
     */
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    private int id;

    /**
     * Konstruktor dari class Hotel.
     *
     * @param nama nama hotel
     * @param lokasi lokasi hotel
     * @param bintang rating hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = DatabaseHotel.getLastHotelID() + 1;
    }

    /**
     * Method ini digunakan untuk mengeset ID hotel.
     *
     * @param id sebagai ID hotel yang akan diset
     */
    public void setID(int id){
        this.id = id;
    }

    /**
     * Method ini digunakan untuk mengubah nama hotel.
     *
     * @param nama nama hotel yang akan diset
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * Method ini digunakan untuk mengubah lokasi hotel.
     *
     * @param lokasi hotel yang akan diset
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }

    /**
     * Method ini digunakan untuk mengubah nilai bintang hotel.
     *
     * @param bintang dengan tipe data int
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }

    /**
     * Method ini digunakan untuk mengambil ID hotel.
     *
     * @return id
     */
    public int getID(){
        return id;
    }

    /**
     * Method ini digunakan untuk mengambil nilai bintang.
     *
     * @return bintang
     */
    public int getBintang()
    {
        return bintang;
    }

    /**
     * Method ini digunakan untuk mengambil nama hotel.
     *
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * Method ini digunakan untuk mengambil lokasi hotel.
     *
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }

    /**
     * Method ini digunakan untuk mencetak informasi hotel.
     *
     * @return informasi hotel
     */
    public String toString()
    {
        return ("Nama hotel  : " + getNama() +
                "\nLokasi hotel: " + getLokasi().getDeskripsi() +
                "\nBintang     : " + getBintang());
    }
}

