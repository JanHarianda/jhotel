package jhotel;

/**
 * Kelas ini untuk menunjukkan informasi mengenai hotel
 *
 * @author Jan Harianda
 * @version 20-05-2018
 */
public class Hotel
{
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    private int id;


    /**
     * Overloading constructor for objects of class Hotel.
     *
     * @param nama berisi nama hotel
     * @param lokasi berisi lokasi hotel
     * @param bintang berisi bintang hotel
     */
    public Hotel (String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        id = DatabaseHotel.getLastHotelId() + 1;
    }

    /**
     * method ini digunakan untuk menampilkan nilai id
     *
     *
     * @return id
     */
    public int getID() {
        return id;
    }

    /**
     * method ini digunakan untuk menampilkan nilai Bintang
     *
     *
     * @return bintang
     */
    public int getBintang()
    {
        return bintang; //menunjukkan nilai bintang
    }

    /**
     * method ini digunakan untuk menampilkan nama Hotel
     *
     *
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }

    /**
     * method ini digunakan untuk menampilkan nilai Lokasi hotel
     *
     *
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }
    /**
     * method ini digunakan untuk memberi nilai id
     *
     *
     * @param  id berisi id
     */
    public void SetID(int id){
        this.id = id;
    }

    /**
     * method ini digunakan untuk memberi nama Hotel
     *
     *
     * @param  nama berisi nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    /**
     * method ini digunakan untuk memberi nama Lokasi
     *
     *
     * @param  lokasi berisi lokasi hotel
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }

    /**
     * method ini digunakan untuk memberi nilai bintang
     *
     *
     * @param  bintang berisi nilai bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }

    public String toString(){
        return "\nHotel\n"+
                "\nNama Hotel : " + nama +
                "\nLokasi : " + lokasi.getDeskripsi() +
                "\nBintang : " + bintang + "\n";
    }
}