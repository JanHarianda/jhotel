package jhotel;

import static jhotel.StatusKamar.VACANT;

/**
 * kelas Administrasi berfungsi sebagai tempat proses pesanan
 * kamar pada jhotel
 * 
 * @author (Jan Harianda Barus)
 * @version (May 18, 2018)
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
        if(pesan != null && kamar != null)
        {
            if(kamar.getStatusKamar().equals(StatusKamar.VACANT))
            {
                pesan.setStatusSelesai(false);
                pesan.setStatusDiproses(true);
                pesan.setRoom(kamar);

                roomAmbilPesanan(pesan, kamar);
                pesan.setBiaya();
            }
            else
            {
                pesan.setStatusAktif(false);
            }

        }
    }


    /**
     * Method ini untuk menyatakan bahwa status ruangan sudah berubah menjadi “booked”
     * dan “ter-link” dengan objek Pesanan yang diberikan.
     *
     * @param pesan objek pesanan
     * @param kamar objek kamar
     *
     */
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.BOOKED);
    }

    /**
     * Method ini untuk mengubah status pesanan dan status
     * room yang telah membatalkan pesanan serta men-unlik
     * masing-masing objek.
     *
     * @param kamar  sebagai penanda kamar yang diproses
     */
    public static void pesananDibatalkan(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        roomLepasPesanan(kamar);

    }

    /**
     * Method ini untuk mengubah status pesanan dan status
     * room yang telah menyelesaikan pesanan serta me-unlink
     * masing-masing objek.
     *
     * @param kamar sebagai penanda kamar yang diproses
     */
    public static void pesananSelesai(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
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
        pesan.setStatusAktif(false);
    }

    /**
     * Method ini untuk merubah status pesanan
     * @param kamar objek kamar
     */
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
        roomLepasPesanan(pesan.getRoom());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }
}