/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author rubby
 */
public class RandomAccessRevisi {
    public static void main(String[] args) {
        String bookList[] = {"Satu","Dua","Tiga"};
        int yearList[] = {1920,1230,1940};
        
        try{
            
            try (RandomAccessFile books = new RandomAccessFile("books.txt","rw")) {
                for(int i=0;i<3;i++){
                    books.writeUTF(bookList[i]);
                    books.writeInt(yearList[i]);
                }
                
                books.seek(0);
                System.out.println(books.readUTF() + " " + books.readInt());
                System.out.println(books.readUTF() + " " + books.readInt());
            }
        }

        catch(IOException e){
            System.out.println("Indeks melebihi batas");
        }
        System.out.println("test");
    }
}