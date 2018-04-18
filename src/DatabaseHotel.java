import java.util.ArrayList;

/**
 * Kelas ini berisi Database Hotel
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class DatabaseHotel
{
    // instance variables - replace the example below with your own
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * Konstruktor for objects of class DatabaseHotel
     */
    public DatabaseHotel()
    {

    }

    /**
     * Method ini digunakan untuk mengambil hotel.
     *
     * @param id sebagai ID hotel
     * @return cari sebagai objek dari hotel yang dipanggil
     */
    public static Hotel getHotel(int id)
    {
        for(Hotel cari : HOTEL_DATABASE){
            if(cari.getID() == id){
                return cari;
            }
        }

        return  null;
    }

    /**
     * Method ini digunakan untuk menambahkan hotel baru.
     *
     * @param  baru sebagai hotel yang akan ditambahkan
     * @return true atau false
     */
    public static boolean addHotel(Hotel baru)
    {
        for(Hotel cari : HOTEL_DATABASE){
            if(baru.getID() == cari.getID()){
                return false;
            }
        }

        HOTEL_DATABASE.add(baru);
        DatabaseHotel.LAST_HOTEL_ID++;
        return true;
    }

    /**
     * Method ini digunakan untuk menghapus hotel dari database.
     *
     * @param id  ID hotel yang akan dihapus
     * @return true atau false
     */
    public static boolean removeHotel(int id)
    {
        for(Hotel cari : HOTEL_DATABASE){
            if(cari.getID() == id){
                for(Room cari2 : DatabaseRoom.getRoomsFromHotel(cari)){
                    DatabaseRoom.removeRoom(cari, cari2.getNomorKamar());
                }
                HOTEL_DATABASE.remove(cari);
                return true;
            }
        }

        return false;
    }

    /**
     * Method ini digunakan untuk mengambil database hotel.
     *
     * @return HOTEL_DATABASE
     */
    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }

    /**
     * Method ini digunakan untuk mengambil ID terakhir dari database hotel.
     *
     * @return LAST_HOTEL_ID
     */
    public static int getLastHotelID()
    {
        return LAST_HOTEL_ID;
    }
}
