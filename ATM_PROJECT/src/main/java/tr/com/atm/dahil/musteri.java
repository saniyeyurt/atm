package tr.com.atm.dahil;

public class musteri {

    private String tcKimlikNo;
    private String adSoyad;
    private double hesapBakiye;

    public musteri() {

    }

    public musteri(String tcKimlikNo, String adSoyad, double hesapBakiyesi) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiye = hesapBakiyesi;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public double getHesapBakiyesi() {
        return hesapBakiye;
    }

    public void setHesapBakiyesi(double hesapBakiyesi) {
        this.hesapBakiye = hesapBakiyesi;
    }

}
