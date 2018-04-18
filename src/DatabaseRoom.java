import java.util.ArrayList;

/**
 * Kelas inii berisi Database Room
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class DatabaseRoom extends DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    /**
     * Konstruktor untuk kelas DatabaseRoom
     */
    public DatabaseRoom()
    {

    }

    /**
     * Method ini digunakan untuk menambah kamar.
     *
     * @param  baru dengan tipe data Customer
     * @return false
     */
    public static boolean addRoom(Room baru)
    {
        for(Room cari : ROOM_DATABASE){
            if(cari.getHotel() != baru.getHotel() &&
                    cari.getNomorKamar() != baru.getNomorKamar()) {
                ROOM_DATABASE.add(baru);
                return true;
            }
        }
        return false;
    }

    /**
     * Method ini digunakan untuk menghapus ruangan.
     *
     * @param hotel hotel pemilik kamar
     * @param nomor_kamar nomor kamar
     * @return boolean false
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room cari : ROOM_DATABASE){
            if(cari.getHotel() == hotel &&
                    cari.getNomorKamar() == nomor_kamar) {
                ROOM_DATABASE.remove(cari);
                return true;
            }
        }

        return false;
    }

    /**
     * Method ini digunakan untuk mengambil database kamar.
     *
     * @return null
     */
    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }

    /**
     * Method ini digunakan untuk mengambil nomor hotel
     *
     * @param hotel hotel
     * @param nomor_kamar nomor kamar
     * @return null
     */
    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room cari : ROOM_DATABASE){
            if(cari.getHotel() == hotel &&
                    cari.getNomorKamar() == nomor_kamar){
                return cari;
            }
        }

        return null;
    }


    /**
     *
     * Method ini digunakan untuk mengambul nilai kamar dari hotel
     *
     * @param hotel hotel
     * @return roomsFromHotel
     */
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
    {
        ArrayList<Room> roomsFromHotel = new ArrayList<Room>();
        for(Room cari : ROOM_DATABASE){
            if(cari.getHotel() == hotel){
                roomsFromHotel.add(cari);
            }
        }

        return roomsFromHotel;
    }

    /**
     * Method ini digunakan untuk mengambil vacant room
     *
     * @return vacant rooms
     */
    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> vacantRooms = new ArrayList<Room>();
        for(Room cari : ROOM_DATABASE){
            if(cari.getStatusKamar() == StatusKamar.VACANT){
                vacantRooms.add(cari);
            }
        }

        return vacantRooms;
    }

}