package projectpbo;

public class Layanglayang extends BangunDatar{
    float sumbu1;
    float sumbu2;
    float sisiatas;
    float sisibawah;
    
    @Override 
    float luas() {
        float luas = (sumbu1 * sumbu2 * 1/2);
        System.out.println("Luas Layang-layang: " + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = (sisiatas * 2 + sisibawah * 2);
        System.out.println("Keliling Layang-layang: " + keliling);
        return keliling;
    }
}