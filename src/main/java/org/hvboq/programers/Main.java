package org.hvboq.programers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class Tomato {
            int x, y, day;

            public Tomato(int x, int y, int day) {
                this.x = x;
                this.y = y;
                this.day = day;
            }
        }
        Queue<Tomato> ripeTomatos = new LinkedList<>();
        int[] xValues = {-1, 0, 1, 0};
        int[] yValues = {0, 1, 0, -1};

        int day = 0;

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();

        int[][] tomatos = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tomato = sc.nextInt();
                tomatos[i][j] = tomato;
                if (tomato == 1) {
                    ripeTomatos.add(new Tomato(j, i, 0));
                }
            }
        }

        while (!ripeTomatos.isEmpty()) {
            Tomato tomato = ripeTomatos.poll();
            for (int i = 0; i < 4; i++) {
                if (tomato.x + xValues[i] >= 0 && tomato.x + xValues[i] < m
                        && tomato.y + yValues[i] >= 0 && tomato.y + yValues[i] < n) {
                    if (tomatos[tomato.y + yValues[i]][tomato.x + xValues[i]] == 0) {
                        tomatos[tomato.y + yValues[i]][tomato.x + xValues[i]] = 1;
                        day = tomato.day + 1;
                        ripeTomatos.add(
                                new Tomato(tomato.x + xValues[i], tomato.y + yValues[i], day));

                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tomatos[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(day);
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt(), n = sc.nextInt();
//
//        int[][] tomatos = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                tomatos[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < m * n; i++) {
//            boolean isGood = true;
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < m; k++) {
//                    if (tomatos[j][k] == 0) {
//                        isGood = false;
//                        break;
//                    }
//                }
//            }
//            int[][] goodedTomatos = new int[n][m];
//            if (isGood) {
//                System.out.println(i);
//                return;
//            } else {
//                for (int j = 0; j < n; j++) {
//                    for (int k = 0; k < m; k++) {
//                        if (goodedTomatos[j][k] == 1)
//                            continue;
//                        goodedTomatos[j][k] = tomatos[j][k];
//                        if (tomatos[j][k] == 1) {
//                            if (j > 0) {
//                                if (tomatos[j - 1][k] == 0)
//                                    goodedTomatos[j - 1][k] = 1;
//                            }
//                            if (k > 0) {
//                                if (tomatos[j][k - 1] == 0)
//                                    goodedTomatos[j][k - 1] = 1;
//                            }
//
//                            if (j < n - 1) {
//                                if (tomatos[j + 1][k] == 0)
//                                    goodedTomatos[j + 1][k] = 1;
//                            }
//                            if (k < m - 1) {
//                                if (tomatos[j][k + 1] == 0)
//                                    goodedTomatos[j][k + 1] = 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//
//            boolean isFailed = true;
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < m; k++) {
//                    if (tomatos[j][k] != goodedTomatos[j][k]) {
//                        isFailed = false;
//                    }
//                }
//            }
//            if (isFailed) {
//                System.out.println(-1);
//                return;
//            } else {
//                tomatos = goodedTomatos;
//            }
//        }
//    }
}