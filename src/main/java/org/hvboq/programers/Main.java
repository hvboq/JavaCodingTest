package org.hvboq.programers;

import java.util.Scanner;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        q1914HanoiTower(n, '1', '2', '3', sb);
        System.out.println(count);
        System.out.println(sb);
    }

    public static void q1914HanoiTower(int n, char from, char mid, char to, StringBuilder sb) {
        count++;
        if (n == 1) {
            sb.append(from + " " + to + "\n");
            return;
        }
        q1914HanoiTower(n - 1, from, to, mid, sb);
        sb.append(from + " " + to + "\n");
        q1914HanoiTower(n - 1, mid, from, to, sb);
    }
}