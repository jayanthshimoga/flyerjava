package org.dwimara.iostreams;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamLearnNoBytes {

    public static void readFile(){
        try {
            InputStream inputStream = new FileInputStream("src/sample.txt");

            System.out.println("Data in the file: ");
            int i = inputStream.read();
            while(i != -1){
                System.out.print((char)i);
                // Reads next byte from the file
                i = inputStream.read();
            }
            inputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void knowReadByte(){
        //skip(5) means we can skip five bytes from the read

        // Fileinputstream doesn't have the below methods:
        // mark() mark the position in input stream up to which data has been read.
        // reset() returns the control to the point in the input stream where the mark was set.
        try {
            InputStream inputStream = new FileInputStream("src/sample.txt");

            System.out.println("Available of bytes in beginning "+inputStream.available());
            inputStream.read();
            inputStream.read();
            inputStream.read();

            System.out.println("After reading 3 read function, 1read=1byte, now the cursor stands ar "+inputStream.available());


            inputStream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InputStreamLearnNoBytes.readFile();
        InputStreamLearnNoBytes.knowReadByte();

    }
}
