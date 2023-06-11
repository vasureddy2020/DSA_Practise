package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File myFile = new File("C:\\Vasu\\JAVAPRACTISE\\Filehandling\\file1.txt");
            if(myFile.createNewFile()){
                System.out.println("file created");
            }
            else {
                System.out.println("file name already exists");
            }
            FileWriter myWriter = new FileWriter("C:\\Vasu\\JAVAPRACTISE\\Filehandling\\file1.txt");
            myWriter.write("Hi ra Vasu ga ela unnavghjjg");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

        }
        catch (IOException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }

    }
}
