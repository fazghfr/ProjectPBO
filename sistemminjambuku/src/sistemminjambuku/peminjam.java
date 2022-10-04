/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemminjambuku;

/**
 *
 * @author fauza
 */
public class peminjam extends pinjam{

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    private String nama;
    private int id;
    
    peminjam(String nama, int id){
        this.nama = nama;
        this.id = id;
    }
    
    public void cetak(){
        System.out.println("nama : "+nama);
        System.out.println("id : "+id);
    }
    
    public void cetak(int halaman){
        System.out.println("nama : "+nama);
        System.out.println("id : "+id);
        System.out.println("halaman : " +halaman);
    }
}
