/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11;

/**
 *
 * @author rubby
 */
public class ThrowExample {
    static void demo(){
        NullPointerException t;
        t = new NullPointerException("Coba Throw");
        throw t;
        // Baris ini tidak lagi dikerjakan;
        //System.out.println("Ini tidak lagi dicetak");
    }
    public static void main(String[] args) {
        try{
            demo();
            System.out.println("Selesai");
        }
        catch(NullPointerException e){
            System.out.println("Ada pesan error: "+ e);
        }
    }
}
