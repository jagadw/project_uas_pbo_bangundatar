package projectpbo;

public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;
    float sisi1;
    float sisi2;

    @Override
    float luas() {
        float luas = alas * tinggi * 1/2 ;
        System.out.println("Luas Segitiga: "+ luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = alas + sisi1 + sisi2;
        System.out.println("Keliling Segitiga: "+ keliling);
        return keliling;
    }
}