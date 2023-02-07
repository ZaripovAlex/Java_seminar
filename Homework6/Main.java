package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        List <Notebook>  NbColl = new ArrayList<>();
        Map<String, String> Params = new HashMap<>();
        NbColl=test(NbColl);
//        System.out.println(NbColl.toString());
        Params.put("ОЗУ", "8");
        Params.put("SSD", "128");
        System.out.println((filter(Params,NbColl)).toString());
    }


    public static List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        List<Notebook> rez = new ArrayList<>();

        for (String s:params.keySet()) {
            for (Notebook nb: notebooks) {
                switch (s){
                    case "Процессор":
                        if (nb.getProcessor() == params.get(s)){
                            rez.add(nb);
                        }
                        break;
                    case "ОЗУ":
                        if (nb.getOzu() == Integer.parseInt(params.get(s))){
                            rez.add(nb);
                        }
                        break;
                    case "SSD":
                        if (nb.getSsd() == Integer.parseInt(params.get(s))){
                            rez.add(nb);
                        }
                        break;
                    case "Видеокарта":
                        if (nb.getVideocard() == params.get(s)){
                            rez.add(nb);
                        }
                        break;
                }
            }
        }
        return rez;
    }
    public static List<Notebook> AddNb(List<Notebook> lst){

        Scanner scanner = new Scanner(System.in);
        boolean flag =false;
        do {
            Notebook notebook = new Notebook();
            System.out.print("Введите название ноутбука: -> ");
            notebook.setName(scanner.nextLine());
            System.out.print("Введите Название процессора: -> ");
            notebook.setProcessor(scanner.nextLine());
            System.out.print("Введите количество ядер: -> ");
            notebook.setKolvoYader(scanner.nextInt());
            System.out.print("Введите объём оперативной памяти: -> ");
            notebook.setOzu(scanner.nextInt());
            System.out.print("Введите наименование видеокарты: -> ");
            notebook.setVideocard(scanner.nextLine());
            System.out.print("Введите объём видеопамяти в ГБ: -> ");
            notebook.setVideoozu(scanner.nextInt());
            System.out.print("Введите объём жесткого диска в ГБ: -> ");
            notebook.setHdd(scanner.nextInt());
            System.out.print("Введите объём SSD в ГБ: -> ");
            notebook.setSsd(scanner.nextInt());
            System.out.print("Введите Диагональ: -> ");
            notebook.setDiag(scanner.nextInt());
            System.out.print("Введите Операционную систему: -> ");
            notebook.setOs(scanner.nextLine());
            System.out.print("Введите цвет: -> ");
            notebook.setColor(scanner.nextLine());
            lst.add(notebook);
            System.out.print("Хотите добавить еще один ноутбук. Если да введите 1. Нет 0! ->");
            int f = scanner.nextInt();
            flag = (f==1) ? true : false;
        }while (flag);
        return lst;
    }
    public static List<Notebook> test(List<Notebook> lst){
        Notebook notebook1 = new Notebook();
        notebook1.setName("Alienware X16");
        notebook1.setProcessor("Intel Core i9-13900HK");
        notebook1.setVideocard("Nvidia GeForce RTX 4080");
        notebook1.setOs("Windows 11 Home");
        notebook1.setSsd(1000);
        notebook1.setHdd(0);
        notebook1.setVideoozu(16);
        notebook1.setOzu(32);
        notebook1.setKolvoYader(10);
        notebook1.setColor("Черный");
        notebook1.setDiag(16);
        lst.add(notebook1);
        Notebook notebook2 = new Notebook();
        notebook2.setName("HP ZBook Power G8 4F8L3EA");
        notebook2.setProcessor("Intel Core i9-11950");
        notebook2.setVideocard("nVidia Quadro RTX A3000");
        notebook2.setOs("Windows 11 Home");
        notebook2.setSsd(1000);
        notebook2.setHdd(0);
        notebook2.setVideoozu(8);
        notebook2.setOzu(32);
        notebook2.setKolvoYader(10);
        notebook2.setColor("Черный");
        notebook2.setDiag(15);
        lst.add(notebook2);
        Notebook notebook3 = new Notebook();
        notebook3.setName("Apple MacBook Pro 16 2021 Z14X0007U ");
        notebook3.setProcessor("Apple M1 Max");
        notebook3.setVideocard("Apple M1 Max");
        notebook3.setOs("MacOS");
        notebook3.setSsd(8000);
        notebook3.setHdd(0);
        notebook3.setVideoozu(8);
        notebook3.setOzu(64);
        notebook3.setKolvoYader(10);
        notebook3.setColor("Серый");
        notebook3.setDiag(16);
        lst.add(notebook3);
        lst.add(notebook2);
        Notebook notebook4 = new Notebook();
        notebook4.setName("Irbis NB283");
        notebook4.setProcessor("Intel Celeron N3350");
        notebook4.setVideocard("Intel HD Graphics 500");
        notebook4.setOs("Windows 10 Pro");
        notebook4.setSsd(128);
        notebook4.setHdd(0);
        notebook4.setVideoozu(0);
        notebook4.setOzu(4);
        notebook4.setKolvoYader(2);
        notebook4.setColor("Черный");
        notebook4.setDiag(14);
        lst.add(notebook4);
        Notebook notebook5 = new Notebook();
        notebook5.setName("Haier U1510SM");
        notebook5.setProcessor("Intel Celeron N4000");
        notebook5.setVideocard("Intel HD Graphics 600");
        notebook5.setOs("Windows 10 Home");
        notebook5.setSsd(128);
        notebook5.setHdd(0);
        notebook5.setVideoozu(0);
        notebook5.setOzu(4);
        notebook5.setKolvoYader(2);
        notebook5.setColor("Белый");
        notebook5.setDiag(15);
        lst.add(notebook5);
        Notebook notebook6 = new Notebook();
        notebook6.setName("Lenovo ThinkPad X1 Titanium Yoga Gen 1");
        notebook6.setProcessor("Intel Core i5 1130G7");
        notebook6.setVideocard("Intel Iris Xe Graphics");
        notebook6.setOs("Windows 10 Pro");
        notebook6.setSsd(256);
        notebook6.setHdd(0);
        notebook6.setVideoozu(0);
        notebook6.setOzu(16);
        notebook6.setKolvoYader(2);
        notebook6.setColor("Серый");
        notebook6.setDiag(15);
        lst.add(notebook6);
        Notebook notebook7 = new Notebook();
        notebook7.setName("MSI Modern 2021");
        notebook7.setProcessor("Intel Core i5 1135G7");
        notebook7.setVideocard("NVIDIA GeForce MX450");
        notebook7.setOs("Windows 10 Home");
        notebook7.setSsd(512);
        notebook7.setHdd(0);
        notebook7.setVideoozu(0);
        notebook7.setOzu(8);
        notebook7.setKolvoYader(2);
        notebook7.setColor("Серый");
        notebook7.setDiag(14);
        lst.add(notebook7);
    return  lst;
    }

}
