package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uch burchtuktun osnovaniasyn jazynyz?");
    triangle.a = scanner.nextInt();
        System.out.println("Uch burchtuktun biyiktigin jazynyz?");
    triangle.h = scanner.nextInt();
        System.out.println("uch burchtuktun osnovaniasy:"+triangle.a);
        System.out.println("uch burchtuktun biyiktigi:"+triangle.h);
        triangle.area();
    }
}
