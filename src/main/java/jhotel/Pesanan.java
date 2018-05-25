package jhotel;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
/** 
 * kelas ini memodelkan sistem pesanan dalam memesan kamar hotel
 * 
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */


public class Pesanan
{
    private double biaya;
    private int id;
    private Customer pelanggan;
    private double jumlahHari;
    private boolean isDiproses;
    private boolean isSelesai;
    private boolean isAktif;
    private Room kamar;
    private Date tanggalPesan;


    /**
     * method ini berfungsi untuk mendeklarasikan biaya dan pelanggan
     * pada saat pembuatan kelas
     *
     * @pram biaya Parameter dengan tipe data double
     * @pram pelanggan Parameter dengan tipe data Customer
     * @return tidak ada
     */
    public Pesanan(double jumlahHari, Customer pelanggan) {
        this.pelanggan = pelanggan;
        this.jumlahHari = jumlahHari;
        tanggalPesan = new GregorianCalendar().getTime();
        isAktif = true;
        id = DatabasePesanan.getLastPesananId() + 1;
    }
    /**
     * method ini berfungsi untuk menampilkan nilai biaya
     *
     * @return biaya
     */
    public double getBiaya() {
        return biaya;
    }
    /**
     * method ini berfungsi untuk menampilkan nilai pelanggan
     *
     * @return pelanggan
     */
    public int getID() {
        return id;
    }

    /**
     * Method ini berfungsi untuk mendapat data pelanggan
     * @return pelanggan data pelanggan
     */
    public Customer getPelanggan() {
        return pelanggan;
    }

    /**
     * Method ini berfungsi untuk mendapatkan jumlah hari
     * @return jumlahHari jumlah hari
     */
    public double getJumlahHari() {
        return jumlahHari;
    }
    /**
     * method ini berfungsi untuk menampilkan status yang telah diproses
     *
     * @return isDiproses
     */
    public boolean getStatusDiproses() {
        return isDiproses;
    }
    /**
     * method ini berfungsi untuk menampilkan status yang sudah selesai
     *
     * @return isSelesai
     */
    public boolean getStatusSelesai() {
        return isSelesai;
    }

    /**
     * Method ini untuk mendapatkan data room
     *
     * @return kamar data room
     *
     */
    public Room getRoom() {
        return kamar;
    }

    public Date getTanggalPesan() {
        DateFormat formatter = new SimpleDateFormat("'DOB : 'dd MMMM yyyy");
        String output = formatter.format(tanggalPesan);
        System.out.println(output);
        return tanggalPesan;
    }
    /**
     * Mendapatkan nilai status aktif
     *
     * @return isAktif true jika aktif
     *
     */
    public boolean getStatusAktif()
    {
        return isAktif;
    }


    /**
     * method ini berfungsi untuk memberikan nilai pada biaya
     *
     * @return tidak ada
     */
    public void setBiaya() {
        biaya = jumlahHari * kamar.getDailyTariff();
    }

    /**
     * Memberi nilai isAktif
     *
     * @param aktif true jika aktif
     *
     */
    public void setStatusAktif(boolean aktif) {
        isAktif = aktif;
    }

    /**
     * Memberi nilai id pesanan
     *
     * @param id id
     *
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * method ini berfungsi untuk memberikan nilai pada pelanggan
     *
     * @return tidak ada
     */

    public void setPelanggan(Customer baru)
    {
        pelanggan = baru;
    }

    /**
     * Memberi jumlah hari
     *
     * @param jumlahHari hari
     *
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }
    /**
     * method ini berfungsi untuk memberikan nilai pada status yang
     * telah diproses
     *
     * @return tidak ada
     */
    public void setStatusDiproses(boolean diproses){
        isDiproses = diproses;
    }
    /**
     * method ini berfungsi untuk memberikan nilai pada status yang
     * telah selesai
     *
     * @return tidak ada
     */
    public void setStatusSelesai(boolean diproses){
        isSelesai = diproses;
    }
    /**
     * Memberi nilai kamar
     *
     * @param kamar room pada pesanan
     */
    public void setRoom(Room kamar)
    {
        this.kamar = kamar;
    }

    public void setTanggalPesan(Date tanggalPesan)
    {
        this.tanggalPesan = tanggalPesan;
    }

    public String toString() {
        String final_status = "KOSONG";

        if (isDiproses == true && isSelesai == false){
            final_status = "DIPROSES";
        } else if (isDiproses == false && isSelesai == false){
            final_status = "KOSONG";
        } else if (isDiproses == false && isSelesai == true){
            final_status = "SELESAI";
        }

        if (getRoom() != null) {
            return "\n Pesanan" +
                    "\n pelanggan   : " + pelanggan.getNama() +
                    "\n jumlah hari : " + jumlahHari +
                    "\n hotel       : " + kamar.getHotel().getNama() +
                    "\n kamar       : " + kamar.getNomorKamar() +
                    "\n tipeKamar   : " + kamar.getTipeKamar() +
                    "\n status      : " + final_status+
                    "\n ID          : "+pelanggan.getID()+"\n";

        }
        return "\n Pesanan" +
                "\n pelanggan   : " + pelanggan.getNama() +
                "\n jumlah hari : " + jumlahHari +
                "\n hotel       : null" +//kamar.getHotel().getNama()+
                "\n kamar       : null" +//kamar.getNomorkamar() +
                "\n tipeKamar   : null" +//kamar.getTipeKamar() +
                "\n status      : " + final_status+
                "\n ID          : "+pelanggan.getID()+"\n";
    }

}
