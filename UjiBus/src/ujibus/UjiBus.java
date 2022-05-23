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
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bus mini = new Bus ();
        mini.penumpang = 5;
        mini.maxpenumpang = 5;
        mini.cetak();
        
        mini.penumpang = mini.penumpang+5;
        mini.cetak();
        
        mini.penumpang = mini.penumpang-3;
        mini.cetak();
    }
    
}
