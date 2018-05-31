package jhotel;

import java.util.ArrayList;
/**
 * Class yang erisi database ruangan hotel
 *
 * @author Jan Harianda
 * @version 2018.05.20
 */
public class DatabaseRoom
{

    //private static String[]  list_room;
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    /**
     * Digunakan untukvmembuat arraylist berisi room
     *
     * @return ROOM_DATABASE
     */
    public static ArrayList<Room> getRoomDatabase()
    {
        return ROOM_DATABASE;
    }

    /**
     * Digunakan untuk menambahkan database room
     *
     * @param baru berisi objek Room
     */
    public static boolean addRoom(Room baru) throws RoomSudahAdaException{
        for(Room cari : ROOM_DATABASE){
            if(cari.getHotel().equals(baru.getHotel()) && cari.getNomorKamar().equals(baru.getNomorKamar())) {
                throw new RoomSudahAdaException(baru);
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    /**
     * digunakan untuk mengambil database room berdasarkan hotel dan nomor kamar
     *
     * @param hotel berisi hotel
     * @param nomor_kamar berisi nomor kamar
     * @return tes
     */
    public static Room getRoom(Hotel hotel, String nomor_kamar){
        /*
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel) && tes.getNomorKamar().equals(nomor_kamar)){
                return tes;
            }
        }
        return null;
    }
    */
        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getHotel().equals(hotel) && kamar.getNomorKamar().equals(nomor_kamar))
            {
                return kamar;
            }
        }

        return null;
    }


    /**
     * digunakan untuk mendapatkan arraylist room yang berasal dari hotel
     *
     * @param hotel berisi objek Hotel
     * @return tempRoom
     */
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

        return tempRoom;
    }

    /**
     * digunakan untuk mengambil arraylist dari vacant room
     *
     * @return tempRoom
     */
    public static ArrayList<Room> getVacantRooms()
    {
        ArrayList<Room> tempRoom = new ArrayList<Room>();

        for(Room kamar : ROOM_DATABASE)
        {
            if(kamar.getStatusKamar().equals(StatusKamar.VACANT))
            {
                tempRoom.add(kamar);
            }
        }

        return tempRoom;
    }

    /**
     * digunakan unruk menghapus room dari database
     *
     * @param hotel berisi objek Hotel
     * @param nomor_kamar berisi nomor kamar
     * @return true
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException
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
        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
    }


}