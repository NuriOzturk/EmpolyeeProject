package Veritabani;

import Modeller.Departmanlar.BilisimTeknolojileriDepartmani;
import Modeller.Departmanlar.Departman;
import Modeller.Departmanlar.InsanKaynaklariDepartmani;
import Modeller.Departmanlar.YonetimDepartmani;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Departmanlar {
    // TODO Bu class'da bir sey degistirmenize gerek yok

    static private final Departman BILISIM_TEKNOLOJILERI_DEPARTMANI = new BilisimTeknolojileriDepartmani();
    static private final Departman YONETIM_DEPARTMANI = new YonetimDepartmani();
    static private final Departman INSAN_KAYNAKLARI_DEPARTMANI = new InsanKaynaklariDepartmani();
    static private List<Departman> DepartmanList = new ArrayList<>(Arrays.asList(BILISIM_TEKNOLOJILERI_DEPARTMANI, YONETIM_DEPARTMANI, INSAN_KAYNAKLARI_DEPARTMANI));

    // getter method
    public static List<Departman> getDepartmanList() {
        return DepartmanList;
    }

}


























