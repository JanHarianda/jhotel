import java.util.Date;
/** 
 * kelas ini memodelkan sistem pesanan dalam memesan kamar hotel
 * 
 * @author (Jan Harianda Barus)
 * @version (March 10, 2018)
 */

public class Pesanan
{
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;
   
    public Pesanan(double jumlahHari, Customer pelanggan)
    {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.biaya = (kamar.getDailyTariff()*jumlahHari);
        //tanggalPesan = new Date(year, month, date);
    }
    
    public int getID()
    {
        return id;
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

    public boolean getStatusAktif()
    {
        return isAktif;
    }

    public boolean getStatusDiproses()
    {
        return isDiproses;
    }

    public boolean getStatusSelesai()
    {
        return isSelesai;
    }

    public Room getRoom() 
    {
        return kamar;
    }
    
    public Date getTanggalPesan() 
    {
        return tanggalPesan;
    }

    public void setID(int id)
    {
        this.id = id;
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

    public void setStatusAktif(boolean aktif)
    {
        this.isAktif = isAktif;
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
    
    public void setTanggalPesan(Date tanggalPesan) 
    {
        this.tanggalPesan = tanggalPesan;
    }
    
    public String toString() 
    {
        return null;
    }
    
    /**
     * ini adalah method untuk print
     */
    public void printData()
    {
        System.out.println("Total Biaya :" +biaya);
        System.out.println("Jumlah Hari:" +jumlahHari);
        System.out.println("Nama Pelanggan:" +pelanggan.getNama());
        System.out.println("Kondisi Status Diproses:" +isDiproses);
        System.out.println("Kondisi Status Selesai:" +isSelesai);
        System.out.println("Room:" +kamar);
    }
}