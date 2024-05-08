package org.hvboq.baekjoon;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q7576Tomato {
    void q7576Tomato() {
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
                if (tomato.x + xValues[i] > 0 && tomato.x + xValues[i] < m - 1
                        && tomato.y + yValues[i] > 0 && tomato.y + yValues[i] < n - 1) {
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
                }
            }
        }
        System.out.println(day);
    }

    @Test
    @DisplayName("q7576Tomato")
    void test() {
        q7576Tomato();
    }

    class Tomato {
        int x, y, day;

        public Tomato(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
}