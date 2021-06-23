package kr.boj.steps.s2_if.q4_quadrant_n;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int positionX = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int positionY = Integer.parseInt(st.nextToken());

        printQuadrant(positionX, positionY);

    }

    private static void printQuadrant(int positionX, int positionY) {
        if(positonX>0 && positionY>0){
          System.out.println("1")
        }
    }

}
