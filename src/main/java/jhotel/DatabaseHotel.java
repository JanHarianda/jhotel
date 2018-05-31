package jhotel;

import java.util.ArrayList;

/**
 *
 * @author Jan Harianda
 * @version 2018.05.13
 */
// Class ini digunakan untuk memproses data Hotel

public class DatabaseHotel
{
    /*
     * Deklarasi variable
     */
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * Metode untuk menambah Hotel
     *
     * @param baru hotel baru
     * @throws HotelSudahAdaException exeption kalo hotelnya sudah ada di database
     *
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
     * Metode untuk mendapat id hotel terakhir
     *
     * @return LAST_HOTEL_ID id hotel
     *
     */
    public static int getLastHotelId(){
        return LAST_HOTEL_ID;
    }

    /**
     * Metode untuk menghapus hotel
     *
     * @param id id hotel
     * @throws HotelTidakDitemukanException exeption kalo hotel tidaka da di database
     *
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

    /**
     * Method untuk mendapatkan hotel berdasar id yang diberikan
     *
     * @param id hotel
     * @return tes hotel yang ditemukan
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
     * Metode untuk mengambil data di database
     *
     * @return HOTEL_DATABASE seluruh database hotel
     */
    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }
}