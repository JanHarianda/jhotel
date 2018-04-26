package jhotel;

import static jhotel.StatusKamar.VACANT;

/**
 * kelas Administrasi
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
        if (kamar.getStatusKamar() == VACANT) {
            pesan.setStatusAktif(true);
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(true);
            pesan.setRoom(kamar);
            kamar.setStatusKamar(StatusKamar.BOOKED);
        }
            else
                {
                    pesan.setStatusAktif(false);
        }
        }





    /*
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
    }
    */

    /*
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.VACANT);
    }
    */

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
        kamar.setStatusKamar(VACANT);
        //pesan.setStatusAktif(false);
        //roomLepasPesanan(kamar);
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
        //Pesanan pesan = kamar.getPesanan();
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        //kamar.setPesanan(null);
        //kamar.setStatusKamar(StatusKamar.VACANT);
        roomLepasPesanan(kamar);
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
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        //pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(VACANT);
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
        //pesan.getRoom().setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
       // pesan.setRoom(null);
        pesan.setStatusAktif(false);
    }
}