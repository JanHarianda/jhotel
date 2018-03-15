/** 
 * kelas ini memodelkan sistem pesanan dalam memesan kamar hotel
 * 
 * @author (Jan Harianda Barus)
 * @version (March 10, 2018)
 */

public class Pesanan
{
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
   
    public Pesanan(double jumlahHari, Customer pelanggan, Room kamar)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
    }
    
    public double getBiaya()
    {
        return biaya;
    }
    
    public double getjumlahHari()
    {
        return jumlahHari;
    }
    
    public Customer getPelanggan() 
    {
        return pelanggan;
    }
    
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    public Room getRoom() 
    {
        return kamar;
    }
    
    public void setBiaya(double biaya) 
    {        
        this.biaya = kamar.dailyTariff*jumlahHari;
    }
    
    public void setJumlahHari(double jumlahHari) 
    {
        this.jumlahHari = jumlahHari;
    }
    
    public void setPelanggan(Customer pelanggan) 
    {
        this.pelanggan = pelanggan;
    }
    
    public void setStatusDiproses(boolean diproses) 
    {
        this.isDiproses = isDiproses;
    }   
    
    public void setStatusSelesai(boolean selesai)
    {
        this.isSelesai = selesai;
    }
    
    public void setRoom(Room kamar) 
    {
        this.kamar = kamar;
    }
    
    /**
     * ini adalah method untuk print
     */
    public void printData()
    {
        System.out.println("Total Biaya :" +biaya);
        System.out.println("Jumlah Hari:" +jumlahHari);
        System.out.println("Nama Pelanggan:" +pelanggan);
        System.out.println("Kondisi Status Diproses:" +isDiproses);
        System.out.println("Kondisi Status Selesai:" +isSelesai);
        System.out.println("Room:" +kamar);
    }
}