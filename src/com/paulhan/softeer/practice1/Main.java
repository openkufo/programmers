package com.paulhan.softeer.practice1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    private static final int BUFFER_LIMIT = 5;
    private static final int MINUTE = 60;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalMinute = 0;

        for(int index = 0; index < BUFFER_LIMIT; index++){
            StringTokenizer timeTokenizer = new StringTokenizer(br.readLine());
            int diffTime = getDiffTime(timeTokenizer.nextToken(), timeTokenizer.nextToken());
            totalMinute += diffTime;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(totalMinute + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    private static int getDiffTime(String prevTime, String nextTime){
        return timeToMinute(nextTime) - timeToMinute(prevTime);
    }

    private static int timeToMinute(String time){
        StringTokenizer timeTokenizer = new StringTokenizer(time, ":");
        int hourOfTime = Integer.parseInt(timeTokenizer.nextToken());
        int minuteOfTime = Integer.parseInt(timeTokenizer.nextToken());
        return hourOfTime * MINUTE + minuteOfTime;
    }
}
