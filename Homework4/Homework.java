package org.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


import static java.lang.Math.abs;

public class Homework {

        //Даны два Deque представляющие два целых числа. Цифры хранятся в обратном порядке,
        // и каждый из их узлов содержит одну цифру.
        public static void main(String[] args) {
            Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(8,-2));
            Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(8 ));
            Deque<Integer> d3 = new ArrayDeque<>(Arrays.asList(5,2));
            Deque<Integer> d4 = new ArrayDeque<>(Arrays.asList(4));
            System.out.println(multiple(d3, d4));
            // result [0,0,1]
           System.out.println(sum(d1, d2));
            // result [0,-2]
        }

        // Умножьте два числа и верните произведение в виде связанного списка.
        public static Deque<Integer> multiple(Deque<Integer> d1, Deque<Integer> d2){
            int tmp1 = 0;
            int mul = 0;
            int tmp2 = 0;
            Deque<Integer> res = new ArrayDeque<>();
            for (int i = 0; i<d1.size()+1; i++) {
                mul = d1.removeFirst() * d2.getFirst()+tmp1;
                if (mul > 9) {
                    tmp2 = (mul % 10);
                    tmp1 = mul / 10;
                    if (tmp2 > 9) {
                        res.addLast(tmp2 % 10);
                        res.addLast(tmp2 / 10);
                    }
                    res.addLast(tmp2);
                    } else {
                    res.addLast(tmp2);
                    tmp1 = (mul / 10);
                }
            }
            if (tmp1>0) res.addLast(tmp1);

            return res;
}

        // Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными
        public static Deque<Integer> sum(Deque<Integer> sl1, Deque<Integer> sl2){
            Deque<Integer> res = new ArrayDeque<>();
            Deque<Integer> d1 = new ArrayDeque<>();
            Deque<Integer> d2 = new ArrayDeque<>();

            int flag = 1;
            int tmp = 0;
            int sum1 = 0;
            if (sl1.size()< sl2.size()) {
            d1 = sl1;
            d2 = sl2;
            }else {
                d1 = sl2;
                d2 = sl1;
            }
            if(d1.getLast()<0 || d2.getLast()<0) flag = -1;
            for (int i = 0; i < d1.size(); i++) {
                sum1 = (d1.removeFirst()*flag)+ d2.removeFirst();
                if (sum1 > 9){
                    res.addLast(sum1 % 10 + (tmp));
                    tmp = sum1 / 10;
                } else if (sum1<0) {
                    res.addLast(abs(sum1));
                }else {
                    res.addLast(sum1 + (tmp));
                    tmp = 0;
                }
            }
            if (tmp > 0){
                res.addLast(tmp);
            }
            for (int i = 0; i < d2.size(); i++) {
                res.addLast(d2.removeFirst());
            }


            return res;

        }
    }

