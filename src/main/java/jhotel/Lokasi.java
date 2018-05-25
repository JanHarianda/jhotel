package jhotel;
/**
 * kelas ini memodelkan Lokasi dalam memesan kamar hotel
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class Lokasi
{
    // Instance variabel pada class Lokasi
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;

    /**
     * Konstruktor class Lokasi.
     *
     * @param x_coord koordinat x
     * @param y_coord koordinat y
     * @param deskripsiLokasi deskripsi dari lokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }

    /**
     * Method ini digunakan untuk mengubah nilai koordinat x.
     *
     * @param x_coord koordinat x
     */
    public void setX(float x_coord)
    {
        this.x_coord = x_coord;
    }

    /**
     * Method ini digunakan untuk mengubah nilai koordinat y.
     *
     * @param y_coord koordinat y
     */
    public void setY(float y_coord)
    {
        this.y_coord = y_coord;
    }

    /**
     * Method ini digunakan untuk mengubah deskripsi lokasi.
     *
     * @param deskripsi deskripsi lokasi
     */
    public void setDeskripsi(String deskripsi)
    {
        deskripsiLokasi = deskripsi;
    }

    /**
     * Method ini digunakan untuk mendapatkan nilai koordinat x.
     *
     * @return x_coord
     */
    public float getX()
    {
        return x_coord;
    }

    /**
     * Method ini digunakan untuk mendapatkan nilai koordinat y.
     *
     * @return y_coord
     */
    public float getY()
    {
        return y_coord;
    }

    /**
     * Method ini digunakan untuk mendapatkan deskripsi lokasi.
     *
     * @return deskripsiLokasi
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }

    /**
     * Method ini digunakan untuk menampilkan koordinat
     * dan deskripsi lokasi.
     *
     * @return koordinat dan deskripsi lokasi
     */
    public String toString()
    {
        return  "Lokasi"+
                "\nKoordinat X : " + x_coord +
                "\nKoordinat Y : " + y_coord +
                "\nDeskripsiLokasi   : " + deskripsiLokasi;
    }
}

