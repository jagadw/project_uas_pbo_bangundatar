package projectpbo;

public class Trapesium extends BangunDatar {
    float alas;
    float atap;
    float tinggi;
    float sisimiring1;
    float sisimiring2;
    
    
    @Override 
    float luas() {
        float luas = ((alas+atap) * tinggi * 1/2);
        System.out.println("Luas Trapesium: " + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = (alas + atap + sisimiring1 + sisimiring2);
        System.out.println("Keliling Trapesium: " + keliling);
        return keliling;
    }
}