package Modeller.Departmanlar;

public class YonetimDepartmani implements Departman {
    final String departmanKodu = "YD";
    final int zamOrani = 30;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }

    @Override
    public String getDepartmanAdi() {
        return "Yonetim Departmani";
    }
}
