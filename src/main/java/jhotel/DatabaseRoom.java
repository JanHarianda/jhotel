package jhotel;
import java.util.ArrayList;

/**
 * Kelas inii berisi Database Room
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

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
     * Method ini digunakan untuk menambah kamar.
     *
     * @param  baru dengan tipe data Customer
     * @return false
     */

    public static boolean addRoom(Room baru) throws RoomSudahAdaException
    {
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(baru.getHotel())&&tes.getNomorKamar()==baru.getNomorKamar()){
                throw new RoomSudahAdaException(baru);
            }
        }
        ROOM_DATABASE.add(baru);
        return true;
    }

    /**
     * Method ini digunakan untuk mengambil nomor hotel
     *
     * @param hotel hotel
     * @param nomor_kamar nomor kamar
     * @return null
     */
    public static Room getRoom(Hotel hotel, String nomor_kamar){
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel)&&tes.getNomorKamar().equals(nomor_kamar)){
                return tes;
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
    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel)){
                REQUEST_ROOM.add(tes);
            }
        }
        return REQUEST_ROOM;
    }

    /**
     * Method ini digunakan untuk mengambil vacant room
     *
     * @return vacant rooms
     */
    public static ArrayList<Room> getVacantRooms(){
        ArrayList<Room> REQUEST_ROOM = new ArrayList<Room>();
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getStatusKamar()==StatusKamar.VACANT){
                REQUEST_ROOM.add(tes);
            }
        }
        return REQUEST_ROOM;
    }

    /**
     * Method ini digunakan untuk menghapus ruangan.
     *
     * @param hotel hotel pemilik kamar
     * @param nomor_kamar nomor kamar
     * @return boolean false
     */
    public static boolean removeRoom(Hotel hotel, String nomor_kamar) throws RoomTidakDitemukanException
    {
        for (int i = 0; i < ROOM_DATABASE.size(); i++) {
            Room tes = ROOM_DATABASE.get(i);
            if (tes.getHotel().equals(hotel)&&tes.getNomorKamar()==nomor_kamar){
                if(DatabasePesanan.getPesananAktif(tes) != null)
                {
                    Administrasi.pesananDibatalkan(tes);
                }

                if(ROOM_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        throw new RoomTidakDitemukanException(hotel, nomor_kamar);
    }




}