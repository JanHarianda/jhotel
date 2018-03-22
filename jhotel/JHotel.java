import java.text.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 * kelas ini menjelaskan tentang sistem utama/main pada JHotel
 * 
 * @author (Jan Harianda Barus)
 * @version (March 1, 2018)
 */
public class JHotel
{
    public static void main(String args[]) 
    {
        Customer cust1 = new Customer(1, "Jan", new GregorianCalendar(1997,1,12).getTime());
        //cust1.getDOB();
        System.out.println(cust1.getDOB());
        //Lokasi Margonda = new Lokasi(5,4,"Depok");
        //Hotel satu = new Hotel("Margo", Margonda, 4);
        //Room room1 = new SingleRoom(satu, "12", true, StatusKamar.Vacant);
        //Customer customer1 = new Customer (12,"Jan");
        //room1.setDailyTariff(200000);
        //Pesanan pesanan1 = new Pesanan(60, customer1,room1);
        //System.out.println("Selamat datang di JHotel");
        //Margonda.printData();
        //customer1.printData();
        //satu.printData();
        
        //System.out.println("==================METHOD 1===================="); 
        //Administrasi.pesananDitugaskan(pesanan1, room1);
        //room1.printData();
        //pesanan1.printData();
        
        /*System.out.println("==================METHOD 2====================");
        Administrasi.pesananDibatalkan(room1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("==================METHOD 3====================");
        Administrasi.pesananDibatalkan(pesanan1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("==================METHOD 4====================");
        Administrasi.pesananSelesai(room1);
        room1.printData();
        pesanan1.printData();
        Administrasi.pesananDitugaskan(pesanan1, room1);
        
        System.out.println("==================METHOD 5====================");
        Administrasi.pesananSelesai(pesanan1);
        room1.printData();
        pesanan1.printData();
        */
 
        
    }
    
    public JHotel()
    {
        
    }
}
