/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemminjambuku;

/**
 *
 * @author fauza
 */
public class buku extends pinjam{

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    public String judul;
    public String penulis;
    private String id;
    public String jenis;
    
    buku(String judul,String penulis, String id, String jenis){
        this.judul = judul;
        this.id = id;
        this.jenis = jenis;
        this.penulis = penulis;
    }
    
    public void cetak(){
        System.out.println("Judul : "+judul);
        System.out.println("penulis : "+penulis);
        System.out.println("id : " +getId());
        System.out.println("Jenis : "+jenis);
    }
}
