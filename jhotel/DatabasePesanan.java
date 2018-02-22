public class DatabasePesanan
{
   private String[] list_pesanan;
   
   public boolean addPesanan(Pesanan baru)
   {
       return true;
    }
    
   public boolean removePesanan(Pesanan pesan)
    {
        return true;
    }
    
   public Pesanan getPesanan(Customer cust)
   {
       Pesanan pesan = new Pesanan();
       return pesan;
    }
    
   public String[] getPesananDatabase()
   {
       return list_pesanan;
    }
    
   public void pesananDibatalkan(Pesanan pesan)
   {
    }
}
