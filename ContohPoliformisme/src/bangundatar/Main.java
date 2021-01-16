/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ElpamaZ
 */
public class Main {
       public static void main(String[]args) {
           
           bangundatar bangundatar = new bangundatar();
           Persegi persegi = new Persegi(4);
           Segitiga segitiga = new Segitiga(6, 3);
           Lingkaran lingkaran = new Lingkaran(50);
           
           //memanggil method luas dan keliling
           bangundatar.luas();
           bangundatar.keliling();
           
           System.out.println("Luas persegi: " + persegi.luas());
           System.out.println("Keliling persegi: " + persegi.keliling());
           System.out.println("Luas segitiga: " + segitiga.luas() );
           System.out.println("Luas lingkaran: " + lingkaran.luas());
           System.out.println("Keliling lingkaran:" + lingkaran.keliling());
           
       }
    
}
