package com.seksimus.basicjava.module5;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;


public class Task3 {

    public static void main(String[] args) throws IOException {
        byte[] data = {48, 49, 50, 51};

        InputStream inputStream = new ByteArrayInputStream(data);
        Charset charset = StandardCharsets.US_ASCII;

        String result = readAsString(inputStream, charset);

        System.out.println(result);

//        String result2 = readAsString(
//                inputStream,
//                StandardCharsets.US_ASCII
//        );
//
//        System.out.println(result2);
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        int currentByte = inputStream.read();

        while (currentByte != -1) {
            outputStream.write(currentByte);
            currentByte = inputStream.read();
        }
        
        byte[] bytes = outputStream.toByteArray();

        return  new String(bytes, charset);
    }
}
