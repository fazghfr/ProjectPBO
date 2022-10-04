/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemminjambuku;

/**
 *
 * @author fauza
 */
public class test {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    public static void main(String[] args) {
        peminjam p1;
        p1 = new peminjam("fauzan", 110);
        
        buku b1;
        b1 = new buku("doraeman", "ahmad", "R0010001", "komik");

        pinjam p = new pinjam();
        p.setB1(b1);
        p.setP1(p1);
        String lama = "500";
        p.lama = Integer.parseInt(lama); 
        
        p.cetak();
    }
    
}
