package projectpbo;

public class Jajargenjang extends BangunDatar{
    float alas;
    float tinggi;
    float sisimiring;
    
    @Override 
    float luas() {
        float luas = (alas * tinggi);
        System.out.println("Luas Jajargenjang: " + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = (alas * 2 + sisimiring * 2);
        System.out.println("Keliling Jajargenjang: " + keliling);
        return keliling;
    }
}