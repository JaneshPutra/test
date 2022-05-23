/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujibus;

/**
 *
 * @author JaneshPutra
 */
public class Bus {
    private 
            int penumpang, maxpenumpang;
    
    public void cetak (){
        System.out.println("Penumpang : "+penumpang);
        System.out.println("Maksimal Penumpang : "+maxpenumpang);
    }
}
