
/**
 * kelas ini akan mengatur logika pemesanan dan pembatalan pesanan.
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 * 
 */
public class Administrasi
{
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {

    }

    /**
     * Method ini untuk memproses ruangan yang akan di-assign.
     *
     * @param pesan  sebagai penanda pesanan yang diproses
     * @param kamar  sebagai penanda kamar yang diproses
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        kamar.setStatusKamar(StatusKamar.BOOKED);
    }

    /**
     * Method ini untuk mengubah status pesanan dan status
     * room yang telah membatalkan pesanan serta men-unlik
     * masing-masing objek.
     *
     * @param kamar  sebagai penanda kamar yang diproses
     */
    public static void pesananDibatalkan(Room kamar)
    {
        //kamar.getPesanan().setStatusSelesai(false);
        //kamar.getPesanan().setStatusDiproses(false);
        //kamar.getPesanan().setRoom(null);
        kamar.setStatusKamar(StatusKamar.VACANT);
        //pesan.setStatusAktif(false);
    }

    /**
     * Method ini untuk mengubah status pesanan dan status
     * room yang telah menyelesaikan pesanan serta me-unlink
     * masing-masing objek.
     *
     * @param kamar sebagai penanda kamar yang diproses
     */
    public static void pesananSelesai(Room kamar)
    {
        //kamar.getPesanan().setStatusSelesai(true);
        //kamar.getPesanan().setStatusDiproses(false);
        //kamar.getPesanan().setRoom(null);
        kamar.setStatusKamar(StatusKamar.VACANT);
        //pesan.setStatusAktif(false);
    }

    /**
     * Method ini untuk mengubah status pesanan dan status
     * room yang telah membatalkan pesanan serta me-unlink
     * masing-masing objek.
     *
     * @param pesan sebagai penanda pesanan yang diproses
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }

    /**
     * Method ini untuk mengubah status pesanan dan status
     * room yang telah menyelesaikan pesanan serta me-unlink
     * masing-masing objek.
     *
     * @param pesan sebagai penanda pesanan yang diproses
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
}