package tr.com.atm.dahil;

public class Bireysel extends musteri {
    private String evAdresi;

    public Bireysel() {

    }

    public Bireysel(String tcKimlikNo, String adSoyad, int hesapBakiyesi, String evAdresi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nBankamıza Hoş Geldiniz");
        sb.append("\nSayın " + getAdSoyad());
        sb.append("\nTc Kimlik No: " + getTcKimlikNo());
        sb.append("\nHesap Bakiyesi: " + getHesapBakiyesi());
        sb.append("\nEv Adresi: " + evAdresi);
        return sb.toString();
    }

}