public class Customer
{
    protected int id;
    protected String nama;
    
    public Customer(int idIn, String namaIn)
    {
        id = idIn;
        nama = namaIn;

}
public int getID()
{
    return id;
}
public String getNama()
{
    return nama;
}
public void setID(int id1)
{
    id = id1;
}
public void setNama(String nama1)
{
    nama = nama1;
}
}
