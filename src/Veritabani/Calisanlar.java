package Veritabani;

import Modeller.Calisanlar.Calisan;
import java.util.ArrayList;

public class Calisanlar {
    private static ArrayList<Calisan> calisanList = new ArrayList<>();

    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }

    public static void addACalisan(Calisan calisan) {
        calisanList.add(calisan);
    }

    public static void deleteACalisanWithId(String calisanId) {
        boolean found = false;
        for (Calisan calisan : calisanList) {
            if (calisan.getCalisanId().equals(calisanId)) {
                calisanList.remove(calisan);
                found = true;
                System.out.println("Çalışan başarıyla silindi.");
                break;
            }
        }
        if (!found) {
            System.out.println("Böyle bir çalışan yok");
        }
    }
    public static void printDepartmandakiCalisanlar(String departmanKodu) {
        for (Calisan calisan2 : calisanList) {
            if (calisan2.getDepartman().getDepartmanKodu().equals(departmanKodu)) {
                System.out.println(calisan2);
            }
        }
    }

    public static void printCalisanlar() {
        for (Calisan calisan3 : calisanList) {
            System.out.println(calisan3);
        }
    }
}
