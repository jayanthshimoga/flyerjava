package org.dwimara.iostreams;

import java.io.ByteArrayInputStream;

/*
 * Note: In ByteArrayInputStream, the input stream is created using the array of bytes.
 * It includes an internal array to store data of that particular byte array.
 */
public class ByteArrayInputStreamLearn {

    public static void main(String[] args) {

        // Creates an array of byte
        byte[] array = {1, 2, 3, 4};

        try{
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            for(int i= 0; i < array.length; i++) {
                int data = input.read();
                System.out.print(data + ", ");
            }
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
