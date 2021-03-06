package jhotel;
/**
 * Ini adalah kelas PremiumRoom
 *
 * @author (Jan Harianda Barus)
 * @version (April 18, 2018)
 */
public class PremiumRoom extends Room
{
    // instance variables
    private static TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;
    private static double DISCOUNT = 0.3;

    /**
     * Konstruktor dari class PremiumRoom
     *
     * @param hotel sebagai hotel yang memiliki kamar
     * @param nomor_kamar  nomor kamar
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        super(hotel, nomor_kamar);
        setDailyTariff(1000000);
    }

    /**
     * Method ini digunakan untuk mengambil nilai tipe kamar.
     *
     * @return    TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    /**
     * Method ini digunakan untuk mengambil diskon harga.
     *
     * @return  DISCOUNT
     */
    public double getDiscount()
    {
        return DISCOUNT;
    }

    /**
     * Method ini digunakan untuk mengeset tarif harian.
     *
     * @param   dailytariff tarif sewa harian kamar
     */
    public void setDailyTariff(double dailytariff)
    {
        super.dailyTariff = dailyTariff * DISCOUNT;
    }


}
