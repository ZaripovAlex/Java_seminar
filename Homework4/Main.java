package org.example;

public class Main {

    //Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
    // является ли входная строка логически правильной.
    // Входная строка логически правильная, если:
    // 1) Открытые скобки должны быть закрыты скобками того же типа.
    // 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
    // открытую скобку того же типа.
    // ()[] = true
    // () = true
    // {[()]} = true
    // ()() = true
    // )()( = false
    // public static void main(String[] args) {
    //     String source = "({[]})";

    // }



    public static void main(String[] args) {

//      String source = "}){][}({";
        String source = "({[]})";
        if (Vl(source)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    public static boolean Vl(String d1){
        if(d1.length()%2!=0) return false;
        String temp = "";
        while (d1.length() != temp.length())
        {
            temp = d1;
            d1 = d1
                    .replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");
        }
        return (d1.length() == 0);

    }
}