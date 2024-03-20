package org.dwimara.iostreams;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamLearn {

    public static void main(String[] args) {
        String dataLine = "E Sala Cup namde";
        try {
            OutputStream outputStream = new FileOutputStream("src/output.txt");

            //convert byte to string
            byte[] bytes = dataLine.getBytes();

            //write bytes to file
            outputStream.write(bytes);
            System.out.println("Data is written to the file.");


            outputStream.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
