// program to find all files of a folder and select only given extention fileName and
//read content of this file using byte array

package com.stackroute.tdd;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FindAllFilesOfFolder {
    public static void main(String[] args) throws Exception {
        File file = new File("/home/akhila/files");       //setting the path
        File[] files = file.listFiles();        //list the files
        for (File f : files)
            System.out.println(f.getName());     //list the file names


        for (File f : files) {
            String name = f.getName();
            if (name.endsWith(".txt")) {        //extracting files that ends with .txt
                System.out.println(f);

                readByteArray(f);
            }

        }

    }

    public static void readByteArray(File f) throws Exception {
        String fileName = f.getName();
        InputStream input = null;

        input = new FileInputStream(fileName);
        byte[] content = new byte[1024];
        int readCount = 0;
        while ((readCount = input.read(content)) > 0)       //reading content from the files named with .txt
        {
            System.out.println(new String(content, 0, readCount - 1));
        }


    }
}

