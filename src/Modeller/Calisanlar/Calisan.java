package Modeller.Calisanlar;
import Modeller.Departmanlar.Departman;
import Veritabani.Calisanlar;

public class Calisan {
    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman Departman;
    private String isimKodu = "";
    private static int calisanSayisi = 250;

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        this.setCalisanId();
        calisanSayisi++;
        Calisanlar.addACalisan(this);
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    private void setDepartman(String departman) {
            for (Departman dep : Veritabani.Departmanlar.getDepartmanList()) {
                if (dep.getDepartmanKodu().equals(departman)) {
                    this.Departman = dep;
                }
            }
    }

    private void setCalisanId() {
        this.calisanId = this.Departman.getDepartmanKodu() + calisanSayisi + getCalisanIsimKodu();
    }

    private String getCalisanIsimKodu() {
        String[] isimler = adSoyad.split(" ");
        for (String isim : isimler) {
            this.isimKodu += isim.substring(0, 1).toUpperCase();
        }
        return this.isimKodu;// TODO burayi unutmayin
    }

    public String getCalisanId() {
        return this.calisanId;
    }

    public Departman getDepartman() {
        return this.Departman;
    }

    public String getDepartmanAdi() {
        return this.Departman.getDepartmanAdi();
    }

    public static void zamYap(String calisanId) {
        if (calisanId.equals("")) {
            System.out.println("Boyle bir calisan yok");
        }else {
            for (Calisan calisan : Calisanlar.getCalisanList()) {
                if (calisan.getCalisanId().equals(calisanId)) {
                    calisan.setMaas(calisan.getMaas() + calisan.getMaas() * calisan.getDepartman().getZamOrani() / 100);
                    System.out.println("Zam yapildi");
                    return;
                }
            }
        }
    }

    @Override
    public String toString() {
        return this.getCalisanId() + " " + this.getAdSoyad() + " " + this.getDepartmanAdi() + " " + this.getMaas();
    }
}
