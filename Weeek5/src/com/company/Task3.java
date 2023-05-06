package com.company;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Task3 {
    void readFromWebToFile(URL url) throws MalformedURLException {
        File file = new File("B: Lincoln.txt");
        //File file = new File("B: scores.txt");
        String fileUrl=new Scanner(System.in).next();
         url=new URL(fileUrl);


    }
}
