//polymorphysm -> memungkinkan kelas dengan method yang sama antara superclass dan subclass tetapi dengan output yang berbeda
//salah satu jenis polymorp = override, jenis lain: overload
//dengan polymor hanya perlu membuat 1 objek saja untuk 
//method abstrak -> method yang tidak ada deskripsi nya sama sekali
package p9;

public class Main {
    public static void main(String[] args) {
//        BangunDatar bd = new BangunDatar();
//        bd.hitungLuas();
//        
//        Persegi p = new Persegi();
//        p.hitungLuas(); 

        //konsep polymorp -> overriding
        BangunDatar bd;
        
//        bd = new BangunDatar();
//        bd.hitungLuas();
//        
//        bd = new Persegi();
//        bd.hitungLuas();
//        
//        bd = new Lingkaran();
//        bd.hitungLuas();
    }
}

//class BangunDatar{
//    void hitungLuas(){
//        System.out.println("Hitung Luas Bangun Datar");
//    }
//}

//interfase -> abstract dengan aturan yang lebih ketat
interface BangunDatar{
    void hitungLuas();
    void hitungKeliling();
}

class Segitiga implements BangunDatar{
    @Override
    public void hitungLuas(){
        
    }
    @Override
    public void hitungKeliling(){
        
    }
}
//abstract method -> jika kita mau subclass yang dimiliki diwajibkan memiliki method yang kita miliki
//jika suatu kelas abstrak memiliki method, maka subclass yang extends pada class abstrak wajib memiliki method yang sama dengan supclass nya (override method)
//abstract class BangunDatar{
//    abstract void hitungLuas();
//    void hitungKeliling(){ 
//        
//    }
//}

//class Segitiga extends BangunDatar{
//
//    @Override
//    public void hitungLuas() {
//        
//    }
//    
//}

//class Persegi extends BangunDatar{
//    @Override
//    void hitungLuas(){
//        int sisi = 5;
//        int luas = sisi * sisi;
//        System.out.println("Luas Persegi : " + luas);
//    }
//}
//
//class Lingkaran extends BangunDatar{
//    void hitungLuas(){
//        double jari = 7;
//        double luas = 3.14 * jari * jari;
//        System.out.println("Luas Lingakaran : " + luas);
//    }
//}