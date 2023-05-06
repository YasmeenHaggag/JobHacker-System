package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    void task2() throws FileNotFoundException {
        File file = new File("B: Lincoln.txt");
        if (file.exists()) {
            System.out.println("File is already exists");
        }
        PrintWriter output = new PrintWriter(file);
        output.println("Four score and seven years ago our fathers brought forth on this continent, a new nation, \n" +
                "conceived in Liberty, and dedicated to the proposition that all men are created equal.\n" +
                "\n" +
                "Now we are engaged in a great civil war, testing whether that nation, or any nation so \n" +
                "conceived and dedicated, can long endure. We are met on a great battle-field of that war. \n" +
                "We have come to dedicate a portion of that field, as a final resting place for those who here gave their \n" +
                "lives that that nation might live. It is altogether fitting and proper that we should do this.\n" +
                "\n" +
                "But, in a larger sense, we can not dedicate -- we can not consecrate -- we can not hallow -- this ground. \n" +
                "The brave men, living and dead, who struggled here, have consecrated it, far above our poor power to add or detract. \n" +
                "The world will little note, nor long remember what we say here, but it can never forget what they did here. \n" +
                "It is for us the living, rather, to be dedicated here to the unfinished work which they who fought here have thus \n" +
                "far so nobly advanced. It is rather for us to be here dedicated to the great task remaining before us -- that from these \n" +
                "honored dead we take increased devotion to that cause for which they gave the last full measure of devotion -- that \n" +
                "we here highly resolve that these dead shall not have died in vain -- that this nation, under God, shall have a new \n" +
                "birth of freedom -- and that government of the people, by the people, for the people, shall not perish from the earth.  ");
        output.close();
        try(Scanner sc = new Scanner(new FileInputStream(file))){
            int count=0;
            while(sc.hasNext()){
                sc.next();
                count++;
            }
            System.out.println("Number of words: " + count);
        }
    }
}
