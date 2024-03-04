package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int integer = in.nextInt();
        in.nextLine();
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        if (integer > 7) {
            System.out.println("Привет!");
        }

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        int[] integers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        Arrays.stream(integers).filter(i -> i % 3 == 0).forEach(i -> System.out.println(i));

        in.close();
    }
}

/*
 * 
( ) ( ) ( ( ( ( ( ) ) ) ) ( ) ) *правильная последовательность
1 0 1 0 1 2 3 4 5 4 3 2 1 2 1 0

Дана последовательность скобок. Она считется правильной, если есть все пары скобок, стоящией на своих местах. Допустим за открывающую скобку будет принимать +1, а закрывающую -- наоборот. То есть получается, что такая правильная последовательность скобок должна равняться нолю, то есть (если последовательность правильная), например:
( ( ) )
1 2 1 0

Или (если последовательность неправильная):
( ( ( ) ) ( ) ( ( ( ) ( )
1 2 3 2 1 2 1 2 3 4 3 4 3

То есть здесь нехватает 3-х скобок справа.
Если число становится отрицательным, то недостаёт скобок слева:
( ( ) ( ) )  )
1 2 1 2 1 0 -1
 */