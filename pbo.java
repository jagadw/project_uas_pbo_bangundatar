package projectpbo;

public class pbo {
    
    public static void main(String[] args) {
        
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        // membuat objek persegi dan mengisi nilai
        Persegi persegi = new Persegi();
        persegi.sisi = 7;
        
        // membuat objek Lingkaran dan mengisi nilai
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 14;
        
        // membuat objek Persegi Panjang dan mengisi nilai
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 3;
        persegiPanjang.lebar = 6;
        
        // membuat objek Segitiga dan mengisi nilai
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 9;
        mSegitiga.tinggi = 7;
        mSegitiga.sisi1 = 13;
        mSegitiga.sisi2 = 15;
        
        // membuat objek Trapesium dan mengisi nilai
        Trapesium Trapesium = new Trapesium();
        Trapesium.alas = 6;
        Trapesium.atap = 14;
        Trapesium.tinggi = 11;
        Trapesium.sisimiring1 = 9;
        Trapesium.sisimiring2 = 6;
        
        // membuat objek Layang-layang dan mengisi nilai
        Layanglayang Layanglayang = new Layanglayang();
        Layanglayang.sumbu1 = 13;
        Layanglayang.sumbu2 = 24;
        Layanglayang.sisiatas = 12;
        Layanglayang.sisibawah = 13;
        
        // membuat objek Jajargenjang dan mengisi nilai
        Jajargenjang Jajargenjang = new Jajargenjang();
        Jajargenjang.alas = 21;
        Jajargenjang.tinggi = 24;
        
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
        
        Trapesium.luas();
        Trapesium.keliling();
        
        Layanglayang.luas();
        Layanglayang.keliling();
        
        Jajargenjang.luas();
        Jajargenjang.keliling();
    }
}