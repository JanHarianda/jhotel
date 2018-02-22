public class Pesanan
{
    // instance variables - replace the example below with your own
    private double biaya;
    private Customer pelanggan;
    private string nama_pelanggan;
    private string jenis_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    
    public Pesanan()
    {
        
    }
    public double getBiaya()
    {
        return biaya;
    }   
    public Customer getPelanggan()
    {
        return pelanggan;
    }
    
    public boolean getStatusSelesai()
    {
        return isSelesai;
    }
    public void setPelanggan(Customer baru)
    {
        pelanggan = baru;
    }
    public void setStatusDiProses(boolean diproses)
    {
        isDiproses = diproses;
    }    

    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }
}