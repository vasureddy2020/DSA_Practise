package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File myFile = new File("C:\\Vasu\\JAVAPRACTISE\\Filehandling\\file1.txt");
            Scanner myReader = new Scanner(myFile);
            String data = myReader.nextLine();
            System.out.println(data);

        }
        catch (FileNotFoundException e){
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
}
