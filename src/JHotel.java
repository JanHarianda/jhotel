import java.text.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.*;
/**
 * kelas ini menjelaskan tentang sistem utama/main pada JHotel
 * 
 * @author (Jan Harianda Barus)
 * @version (April 19, 2018)
 */
public class JHotel {
    public static void main(String args[]) {
        System.out.println("\n\nTry-Catch 1 \n");


        Customer A = new Customer("Abdi", 17, 4, 2017, "A@A.com");
        try {
            DatabaseCustomer.addCustomer(A);
        } catch (PelangganSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Customer B = new Customer("Tampan Sekali", 16, 4, 2018, "b@b.com");
        try {
            DatabaseCustomer.addCustomer(B);
        } catch (PelangganSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Customer C = new Customer("Fatah Tampan", 10, 4, 1997, "fattahaw@gmail.com");
        try {
            DatabaseCustomer.addCustomer(C);
            DatabaseCustomer.addCustomer(C);
        } catch (PelangganSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 2 \n");

        Pesanan pesan1 = new Pesanan(69, A);
        pesan1.setStatusAktif(true);
        try {
            DatabasePesanan.addPesanan(pesan1);
        } catch (PesananSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Pesanan pesan2 = new Pesanan(13, B);
        pesan2.setStatusAktif(true);
        try {
            DatabasePesanan.addPesanan(pesan2);
        } catch (PesananSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Pesanan pesan3 = new Pesanan(45, C);
        pesan3.setStatusAktif(true);
        try {
            DatabasePesanan.addPesanan(pesan3);
            DatabasePesanan.addPesanan(pesan3);
        } catch (PesananSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 3 \n");


        Lokasi test1 = new Lokasi(1, 2, "Taman Melati");
        Lokasi test2 = new Lokasi(3, 4, "Taman Mawar");
        Lokasi test3 = new Lokasi(5, 6, "Taman Tulip");
        Lokasi test4 = new Lokasi(7, 8, "Taman Rafflesia");

        Hotel D = new Hotel("Melati", test1, 5);
        try {
            DatabaseHotel.addHotel(D);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Hotel E = new Hotel("Mawar", test2, 4);
        try {
            DatabaseHotel.addHotel(E);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Hotel F = new Hotel("Tulip", test3, 3);
        try {
            DatabaseHotel.addHotel(F);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Hotel G = new Hotel("Rafflesia", test4, 3);
        try {
            DatabaseHotel.addHotel(G);
            DatabaseHotel.addHotel(D);
        } catch (HotelSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 4 \n");


        Room A101 = new SingleRoom(D, "A101");
        try {
            DatabaseRoom.addRoom(A101);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Room D404 = new PremiumRoom(D, "D404");
        try {
            DatabaseRoom.addRoom(D404);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Room B202 = new DoubleRoom(E, "B202");
        try {
            DatabaseRoom.addRoom(B202);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        Room C303 = new PremiumRoom(F, "C303");
        try {
            DatabaseRoom.addRoom(C303);
            DatabaseRoom.addRoom(A101);
        } catch (RoomSudahAdaException a) {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 5 \n");

        try {
            DatabaseCustomer.removeCustomer(1);
            DatabaseCustomer.removeCustomer(1);
        } catch (PelangganTidakDitemukanException a) {
            System.out.println(a.getPesan());
        }

        System.out.println("\n\nTry-Catch 6 \n");

        try {
            DatabaseHotel.removeHotel(2);
            DatabaseHotel.removeHotel(3);
            DatabaseHotel.removeHotel(5);
        } catch (HotelTidakDitemukanException a) {
            System.out.println(a.getPesan());
        }

        System.out.println("\n\nTry-Catch 7 \n");

        try {
            DatabaseRoom.removeRoom(D, "D404");
            DatabaseRoom.removeRoom(F, "A303");
        } catch (RoomTidakDitemukanException a) {
            System.out.println(a.getPesan());
        }


        System.out.println("\n\nTry-Catch 8 \n");

        try {
            DatabasePesanan.removePesanan(pesan1);
        } catch (PesananTidakDitemukanException a) {
            System.out.println(a.getPesan());
        }

        System.out.println("\n\n---  Hasil Akhir Pesanan  --- \n");
        System.out.println(DatabasePesanan.getPesananDatabase());
        System.out.println("\n\n---  Hasil Akhir Customer  --- \n");
        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println("\n\n---  Hasil Akhir Room  --- \n");
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println("\n\n---  Hasil Akhir Hotel  --- \n");
        System.out.println(DatabaseHotel.getHotelDatabase());


    }
public JHotel()
{

}
}