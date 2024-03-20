package org.dwimara.iostreams;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
 * InputStream is an abstract class
 */
public class InputStreamLearn {

    public static void main(String[] args) throws FileNotFoundException {
        byte[] arr = new byte[100];

        try{
            InputStream inputStream = new FileInputStream("src/sample.txt");
            System.out.println("Available bytes in the file: " + inputStream.available());

            // Read a data from file as bytes
            inputStream.read(arr);
            System.out.println("Data read from the file: ");

            //convert byte array to string
            String data = new String(arr);
            System.out.println(data);


            inputStream.close();
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
