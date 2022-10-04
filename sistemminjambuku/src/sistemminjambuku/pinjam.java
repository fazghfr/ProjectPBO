/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemminjambuku;

/**
 *
 * @author fauza
 */
public class pinjam{

    /**
     * @return the p1
     */
    public peminjam getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(peminjam p1) {
        this.p1 = p1;
    }

    /**
     * @return the b1
     */
    public buku getB1() {
        return b1;
    }

    /**
     * @param b1 the b1 to set
     */
    public void setB1(buku b1) {
        this.b1 = b1;
    }
    private peminjam p1;
    private buku b1;
    public int lama;
    
    public void cetak(){
        System.out.println("Buku : ");
        System.out.println("Judul : "+getB1().judul);
        System.out.println("penulis : "+getB1().penulis);
        System.out.println("id : " +getB1().getId());
        System.out.println("Jenis : "+getB1().jenis);
        
        System.out.println("dipinjam oleh: ");
        System.out.println("nama : "+getP1().getNama());
        System.out.println("id : "+getP1().getId());
        System.out.println("selama : "+lama +" hari");
    }
}
