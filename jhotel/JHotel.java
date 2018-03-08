/**
 * kelas ini menjelaskan tentang sistem utama/main pada JHotel
 * 
 * @author (Jan Harianda Barus)
 * @version (March 1, 2018)
 */
public class JHotel
{
    public  void main(String args[])
    {
        Customer Jan = new Customer(10, "Jan");
        Lokasi Kosan = new Lokasi(9,5, "Barel");
        Hotel Margo = new Hotel("Margo", Kosan, 2);
        Pesanan pesanan10 = new Pesanan(1506673795, Jan);
        System.out.println(pesanan10);
        System.out.println(Jan);
        pesanan10.printData();
        Margo.printData();
        
        Jan.setNama("Nanda");
        Jan.printData();
        pesanan10.printData();
    }
    
    public JHotel()
    {
        
    }
}
