/** 
 * kelas ini memodelkan Lokasi dalam memesan kamar hotel
 * 
 * @author (Jan Harianda Barus)
 * @version (March 10, 2018)
 */
public class Lokasi
{
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi){
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }
    
    public float getX()
    {
        return x_coord;
    }
    
    public float getY()
    {
        return y_coord;
    }
    
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    
    public void setX(float x_coord){
        this.x_coord = x_coord;
    }
    
    public void setY(float y_coord){
        this.y_coord = y_coord;
    }
    
    /**
     * method setDeskripsi digunakan untuk menset deskripsi lokasi
     */
    public void setDeskripsi(String deskripsi){
        this.deskripsiLokasi = deskripsiLokasi;
    }
    
    public String toString() 
    {
        return  "\nKoordinat X  : "+ x_coord+
                "\nKoordinat Y  : "+ y_coord+
                "\nDeskripsi lokasi: "+ deskripsiLokasi;
    }
    
    ///**
    // * method print data digunakan untuk mencetak lokasi
     //*/
    //public void printData()
    //{
      //  System.out.println("Koordinat x :" +x_coord);
       // System.out.println("Koordinat y :" +y_coord);
      //  System.out.println("Deskripsi Lokasi:" +deskripsiLokasi);
    //}
}
