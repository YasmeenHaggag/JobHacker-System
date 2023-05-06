package com.company;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {
    private static String getUrlContents(String theUrl) {
        StringBuilder content = new StringBuilder();
        // Use try and catch to avoid the exceptions
        try {
            URL url = new URL(theUrl); // creating a url object
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }

        public static void main(String[] args) throws IOException {
        Task1 object1 = new Task1();
        //object.task1();
        Task2 object2=new Task2();
        //object2.task2();

         int sum=0;
            File file = new File("B: Lincoln.txt");
            //File file = new File("B: scores.txt");
            String fileUrl=new Scanner(System.in).next();
            URL url=new URL(fileUrl);
        Scanner input = new Scanner(url.openStream());
        PrintWriter output = new PrintWriter(file);
        while (input.hasNext()){
            sum+=input.nextInt();
            output.println(input.next());
        }
        System.out.println(sum);
            System.out.println(sum/26);
        output.close();
/*
        String output  = getUrlContents("http://liveexample.pearsoncmg.com/data/Scores.txt");
        System.out.println(output);

            File file = new File("B: Lincoln.txt");
            if (file.exists()) {
                System.out.println("File is already exists");
            }
            PrintWriter outputt = new PrintWriter(file);
            outputt.println(output);
            outputt.close();*/


            /*URL oracle = new URL("http://liveexample.pearsoncmg.com/data/Scores.txt");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();

            File file = new File("B: Lincoln.txt");
            if (file.exists()) {
                System.out.println("File is already exists");
            }
            PrintWriter outputt = new PrintWriter(file);
            outputt.println(inputLine);
            outputt.close();*/

    }
}
