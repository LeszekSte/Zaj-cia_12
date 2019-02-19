package Cwiczenie_2;

import java.io.*;
import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) throws IOException {



        FileWriter fileWriter = new FileWriter("plik.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("jan;kowalski;25");
        bufferedWriter.newLine();
        bufferedWriter.write("wwwwjan;qqqqkowalski;456325");
        bufferedWriter.newLine();

        Product []products= new  Product[3];

        products[0] = new Product("kkk", "ljljljk", 23);
        products[1] = new Product("kkksssssss", "ljljljk", 23);
        products[2] = new Product("kkkaaaaaa", "ljljljk", 23);

        for (Product product : products) {

            bufferedWriter.write(product.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();



        FileReader fileReader= new FileReader("plik.csv");
        BufferedReader bfr= new BufferedReader(fileReader);
        String line= null;

        String [][]zdanie = new String[52][];
        int i = 0;
        while((line= bfr.readLine()) != null){

            zdanie[i] = line.split(";");
            i++;
        System.out.println(line);}
        bfr.close();

        for (String[] strings : zdanie) {

        }

    }
}
