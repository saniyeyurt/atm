package tr.com.atm.yapılanislemler;

import tr.com.atm.dahil.musteri;
import tr.com.atm.dahil.Bireysel;
import tr.com.atm.dahil.Kurumsal;

import java.util.*;

public class islemler {
    private List<musteri> tumMusteriler() {
        List<musteri> musteriList = new ArrayList<>();

        musteriList.add(new Kurumsal("000000000", "A kişisi", 4500, "A mahallesi"));
        musteriList.add(new Kurumsal("111111111", "B kişisi", 5000, "B mahallesi"));
        musteriList.add(new Kurumsal("222222222", "C kişisi", 3250, "C mahallesi"));
        musteriList.add(new Kurumsal("333333333", "D kişisi", 3250, "D mahallesi"));
        musteriList.add(new Kurumsal("444444444", "E kişisi", 4500, "E mahallesi"));
        musteriList.add(new Bireysel("555555555", "F kişisi", 4500, "F mahallesi"));
        musteriList.add(new Bireysel("666666666", "G kişisi", 5000, "G mahallesi"));
        musteriList.add(new Bireysel("777777777", "H kişisi", 3250, "H mahallesi"));
        musteriList.add(new Bireysel("888888888", "I kişisi", 3250, "I mahallesi"));
        musteriList.add(new Bireysel("999999999", "J kişisi", 4500, "J mahallesi"));

        return musteriList;
    }

    @org.jetbrains.annotations.NotNull
    private Map<String, musteri> hesapNoVeMusteriler() {
        Map<String, musteri> hesapNoVeMusterilerMap = new HashMap<>();
        List<musteri> musteriList = tumMusteriler();
        hesapNoVeMusterilerMap.put("000000000", musteriList.get(0));
        hesapNoVeMusterilerMap.put("111111111", musteriList.get(1));
        hesapNoVeMusterilerMap.put("222222222", musteriList.get(2));
        hesapNoVeMusterilerMap.put("333333333", musteriList.get(3));
        hesapNoVeMusterilerMap.put("444444444", musteriList.get(4));
        hesapNoVeMusterilerMap.put("555555555", musteriList.get(5));
        hesapNoVeMusterilerMap.put("666666666", musteriList.get(6));
        hesapNoVeMusterilerMap.put("777777777", musteriList.get(7));
        hesapNoVeMusterilerMap.put("888888888", musteriList.get(8));
        hesapNoVeMusterilerMap.put("999999999", musteriList.get(9));
        return hesapNoVeMusterilerMap;
    }

}