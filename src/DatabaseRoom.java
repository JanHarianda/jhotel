import java.util.ArrayList;

/**
 * Kelas inii berisi Database Room
 * 
 * @author (Jan Harianda Barus)
 * @version (March 10, 2018)
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    /**
     * Method yang digunakan untuk mengembalikan database kamar.
     * @return ArrayList<Room> mengembalikan database kamar.
     */

    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }


    public static boolean addRoom(Room baru)
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(!kamar.getHotel().equals(baru.getHotel()) &&
                    !kamar.getNomorKamar().equals(baru.getNomorKamar()))
            {
                ROOM_DATABASE.add(baru);
                return true;
            }
        }

        return false;
    }

    /**
     * Method yang digunakan untuk mencari kamar dari database.
     * @param hotel, nomor_kamar input customer yang akan dimasukkan kedalam database
     * @return Room mengembalikan kamar.
     */

    public static Room getRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) &&
                    kamar.getNomorKamar().equals(nomor_kamar))
            {
                return kamar;
            }
        }


        public static ArrayList<Room> getRoomsFromHotel(Hotel hotel)
        {
            ArrayList<Room> tempRoom = new ArrayList<Room>();

            for(Room kamar : ROOM_DATABASE)
            {
                if(kamar.getHotel().equals(hotel))
                {
                    tempRoom.add(kamar);
                }
            }

            return null;
        }

        return null;
    }
    public static boolean removeRoom(Hotel hotel, String nomor_kamar)
    {
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) &&
                    kamar.getNomorKamar().equals(nomor_kamar))
            {
                Administrasi.pesananDibatalkan(kamar);
                if(ROOM_DATABASE.remove(kamar))
                {
                    return true;
                }
            }
        }
        return false;
    }}