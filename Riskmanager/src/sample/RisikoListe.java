package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RisikoListe {
    ArrayList<Risk> risikoliste = new ArrayList<Risk>();


    void gemiliste(Risk risk){
        risikoliste.add(risk);
    }

    Risk loadfraliste(int tal){
        return risikoliste.get(tal);
    }

    void savetofile(Risk risk) throws IOException {
        FileWriter fw = new FileWriter("log.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter output = new PrintWriter(bw);
        output.print(risk.getName() + " ");
        output.print(risk.getDiscibtion() + " ");
        output.print(risk.getSeverity());
        output.println();
        output.close();
    }

    int loadfromfile() throws IOException {
        FileReader file = new FileReader("log.txt");
        BufferedReader input = new BufferedReader(file);
        int lines=0;
        while (input.readLine() != null) {lines++;};
        return lines;
    }
    String parameterfromfile() throws FileNotFoundException {
      Scanner scanner = new Scanner(new File("log.txt"));
      return scanner.next();
    }
    int parameterfromfileint() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("log.txt"));
        return scanner.nextInt();
    }







}
