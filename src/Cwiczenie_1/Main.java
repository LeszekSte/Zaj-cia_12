package Cwiczenie_1;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("txt1.txt");
        Scanner scan = new Scanner(file);

        if (!file.exists()) {
            file.createNewFile();
        }

        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }


    }

}