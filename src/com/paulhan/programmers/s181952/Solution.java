package com.paulhan.programmers.s181952;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(a);
        bw.flush();
        bw.close();
        sc.close();
    }
}
