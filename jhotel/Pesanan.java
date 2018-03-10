/** 
 * kelas ini memodelkan sistem pesanan dalam memesan kamar hotel
 * 
 * @author (Jan Harianda Barus)
 * @version (March 10, 2018)
 */

public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    
    public Pesanan()
    {
        
    }
   
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
    }
    
    public double getBiaya()
    {
        return biaya;
    }
    
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    public String getNamaPelanggan() 
    {
        return null;
    }
    
    public TipeKamar getTipeKamar() 
    {
        return tipe_kamar;
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
        this.biaya = biaya;
    }
    
    public void setPelanggan(Customer pelanggan) 
    {
        this.pelanggan = pelanggan;
    }
    
    public void setNamaPelanggan(String nama_pelanggan) 
    {
        this.nama_pelanggan = nama_pelanggan;
    }
    
    public void setTipeKamar(TipeKamar tipe_kamar) 
    {
        this.tipe_kamar = tipe_kamar;
    }
    
    
    public void setStatusDiproses(boolean diproses) 
    {
        this.isDiproses = diproses;
    }    
    
    public void setStatusSelesai(boolean selesai)
    {
        this.isSelesai = selesai;
    }
    
    public void setRoom(Room kamar) 
    {
        this.kamar = kamar;
    }
    
    //ini adalah method untuk print
    public void printData()
    {
        System.out.println("Total Biaya :" +biaya);
        System.out.println("Nama Pelanggan:" +pelanggan);
        System.out.println("Tipe Kamar:" +tipe_kamar);
        System.out.println("Kondisi Status Diproses:" +isDiproses);
        System.out.println("Kondisi Status Selesai:" +isSelesai);
    }
}