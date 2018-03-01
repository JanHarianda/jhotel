/** 
 * kelas ini memodelkan sistem pesanan dalam memesan kamar hotel
 * 
 * @author (Jan Harianda Barus)
 * @version (March 1, 2018)
 */

public class Pesanan
{
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private String jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    
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
    
    public boolean getStatusDiproses()
    {
        return isDiproses;
    }
    
    public boolean getStatusSelesai()
    {
        return false;
    }
    
    
    public void setBiaya(double biaya){
        this.biaya=biaya;
    }
        
    public void setPelanggan(Customer baru){
        
        this.pelanggan = baru;
    }
    
    public void setStatusDiProses(boolean diproses){
        
        this.isDiproses = diproses;
    }    

    public void setStatusSelesai(boolean diproses){
        
        this.isSelesai = diproses;
    }
    
    //ini adalah method untuk print biaya
    public void printData()
    {
        System.out.println("Total Biaya :" +biaya);
    }
}