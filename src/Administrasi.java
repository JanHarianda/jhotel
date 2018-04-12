
/**
 * kelas ini akan mengatur logika pemesanan dan pembatalan pesanan.
 * 
 * @author (Jan Harianda Barus)
 * @version (March 10, 2018)
 * 
 */
public class Administrasi 
{
    public Administrasi() 
    {
        
    }
    
    /**
     * Method ini untuk memproses ruangan yang akan di-assign. 
     */
    
    public static void pesananDitugaskan(Pesanan pesan, Room kamar) 
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        
        roomAmbilPesanan(pesan, kamar);
    }
    
    /**
     * Method ini untuk menyatakan bahwa status ruangan sudah berubah menjadi “booked” dan “ter-link” dengan objek Pesanan yang diberikan. 
     */
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar) 
    {
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    
    }
    
    /**
     * Method ini untuk menyatakan kalau status room menjadi “vacant” dan “ter-unlink” dengan objek Pesanan apapun
     */
    public static void roomLepasPesanan(Room kamar) 
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room yang telah membatalkan pesanan serta me-unlink masing-masing objek. 
     */
    public static void pesananDibatalkan(Room kamar) 
    {
        kamar.getPesanan().setStatusSelesai(false);
        kamar.getPesanan().setStatusDiproses (false);
        kamar.getPesanan().setRoom(null);
        
        roomLepasPesanan(kamar);
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room yang telah menyelesaikan pesanan serta me-unlink masing-masing objek
     */
    
    public static void pesananSelesai(Room kamar) 
    {
        kamar.getPesanan().setStatusSelesai(true);
        kamar.getPesanan().setStatusDiproses(false);
        kamar.getPesanan().setRoom(null);
        
        roomLepasPesanan(kamar);
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room yang telah membatalkan pesanan serta me-unlink masing-masing objek.
     * 
     */
    public static void pesananDibatalkan(Pesanan pesan) 
    {
        roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room yang telah membatalkan pesanan serta me-unlink masing-masing objek.
     * 
     */
    public static void pesananSelesai(Pesanan pesan) 
    {
        roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
    
}
