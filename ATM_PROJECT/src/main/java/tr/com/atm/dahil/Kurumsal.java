package tr.com.atm.dahil;

public class Kurumsal extends musteri {

    private String sirketAdi;

    public Kurumsal(String tcKimlikNo, String adSoyad, int hesapBakiyesi, String sirketAdi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nBankamıza Hoş Geldiniz");
        sb.append("\nSayın " + getAdSoyad());
        sb.append("\nŞirket Adı: " + sirketAdi);
        sb.append("\nTc Kimlik No: " + getTcKimlikNo());
        sb.append("\nHesap Bakiyesi: " + getHesapBakiyesi());
        return sb.toString();
    }

}
