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
public class Percobaan2 {
    public static void main(String[] args) {
        int i = 0;
        String greetings[] = {
            "Hello, World!",
            "No, I mean it!",
            "HELLO WORLD"
        };

        while(i < 4){
            try {
                System.out.println(greetings[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                i = 0;
                //looping goes brrr!!
            }
        }
    }
}