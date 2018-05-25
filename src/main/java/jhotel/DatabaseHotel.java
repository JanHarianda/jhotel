package jhotel;
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

    /**
     * Method ini digunakan untuk menambahkan hotel baru.
     *
     * @param  baru sebagai hotel yang akan ditambahkan
     * @return true atau false
     */
    public static boolean addHotel(Hotel baru) throws HotelSudahAdaException
    {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel tes = HOTEL_DATABASE.get(i);
            if (tes.getID()==baru.getID()|| (tes.getNama()==baru.getNama()&&tes.getLokasi()==baru.getLokasi())){
                throw new HotelSudahAdaException(baru);
            }
        }
        LAST_HOTEL_ID=baru.getID();
        HOTEL_DATABASE.add(baru);
        return true;
    }

    /**
     * Method ini digunakan untuk mengambil hotel.
     *
     * @param id sebagai ID hotel
     * @return cari sebagai objek dari hotel yang dipanggil
     */
    public static Hotel getHotel(int id){
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel tes = HOTEL_DATABASE.get(i);
            if (tes.getID()==id){
                return tes;
            }
        }
        return null;
    }

    /**
     * Method ini digunakan untuk menghapus hotel dari database.
     *
     * @param id  ID hotel yang akan dihapus
     * @return true atau false
     */
    public static boolean removeHotel(int id) throws HotelTidakDitemukanException
    {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel tes = HOTEL_DATABASE.get(i);
            if (tes.getID()==id){
                ArrayList<Room> KAMAR_TEST = DatabaseRoom.getRoomsFromHotel(tes);
                for (int x = 0; x < KAMAR_TEST.size(); x++){
                    Room kamar = KAMAR_TEST.get(x);
                    try {
                        DatabaseRoom.removeRoom(tes, kamar.getNomorKamar());
                    } catch (RoomTidakDitemukanException test){
                        System.out.println(test.getPesan());
                    }
                }
                if(HOTEL_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        throw new HotelTidakDitemukanException(id);
    }

}
