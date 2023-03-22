package com.paulhan.programmers.s120875;

public class Solution {
    public static void main(String[] args) {
        int answer = new Solution().solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}});
        System.out.println("answer : " + answer);
    }
    public int solution(int[][] dots) {
        int answer = 0;

        Pos[] posArray = new Pos[dots.length];
        for(int i = 0; i < dots.length; i++){
            int posX = dots[i][0];
            int posY = dots[i][1];
            posArray[i] = new Pos(posX, posY);
        }

        boolean isParallel1 = getSlope(posArray[0], posArray[1]) == getSlope(posArray[2], posArray[3]);
        boolean isParallel2 = getSlope(posArray[0], posArray[2]) == getSlope(posArray[1], posArray[3]);
        boolean isParallel3 = getSlope(posArray[0], posArray[3]) == getSlope(posArray[1], posArray[2]);

        answer = isParallel1 || isParallel2 || isParallel3 ? 1 : 0;
        return answer;
    }

    private double getSlope(Pos p1, Pos p2){
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

}

class Pos{
    private double x;
    private double y;

    public Pos(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    @Override
    public String toString() {
        return "x : " + x + ", y : " + y;
    }
}