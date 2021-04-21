package com.example.intro;

public class Main {

    public static void main(String[] args) {
        //camelCase
        String internetSubeButonu = "İnternet Şubesi";
        double dolarDun = 8.15;
        double dolarBugun = 8.18;
        int vade = 36;
        boolean dustuMu = false;

        System.out.println(internetSubeButonu);

        if(dolarBugun<dolarDun){
            System.out.println("Dolar düştü resmi");
        } else if(dolarBugun>dolarDun) {
            System.out.println("Dolar yükseldi resmi");
        }
        else {
            System.out.println("Dolar değişmedi resmi");
        }

        String[] krediler = {
                "Hızlı kredi",
                "Mutlu emeklilik kredisi",
                "Çiftçi kredisi",
                "Konut kredisi",
                "Msb kredisi",
                "Meb kredisi",
                "Kültür bakanlığı kredisi"
        };

        //foreach
        for(String kredi : krediler){
            System.out.println(kredi);
        }

        for(int i = 0; i<krediler.length; i++){
            System.out.println(krediler[i]);
        }

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);

        int[] sayilar1 ={1,2,3,4,5};
        int[] sayilar2 ={10,20,30,40,50};
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]);

        String sehir1 = "Ankara";
        String sehir2 = "İstanbul";
        sehir1 = sehir2;
        sehir2 = "İzmir";
        System.out.println(sehir1);
    }
}
