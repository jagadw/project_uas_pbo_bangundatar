package projectpbo;

public class Persegi extends BangunDatar{
    float sisi;

    @Override
    float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    @Override
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
}
/* Extends pada java berfungsi untuk memanggil fungsi dari class lain, sehingga
kita tidak perlu lagi membuat script yang sama pada class yang akan kita buat
dengan class yang kita buat sebelumnya.

Override memiliki artian yaitu menimpa, dalam java method superclass dapat
ditimpa oleh subclass dengan cara menuliskan lagi nama method yang sama pada subclass.
gunanya agar subclass memiliki fungsi yang lebih spesifik.
*/