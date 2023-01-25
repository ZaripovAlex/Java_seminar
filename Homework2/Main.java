package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoadToFile(ZaprosChisla());

    }

    private static void LoadToFile(byte zaprosChisla){
        try (FileWriter fw = new FileWriter("result.txt",false)) {
            fw.write(Byte.toString(zaprosChisla));
            fw.append("\n");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        }

    private static byte ZaprosChisla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: => ");
        byte rez = sc.nextByte();
        return rez;
    }
}