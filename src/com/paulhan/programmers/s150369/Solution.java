package com.paulhan.programmers.s150369;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // 최대로 실을 수 있는 개수
        int cap = 4;

        // 집 개수
        int n = 5;

        // 각 i+1 번째 집에 배달해야할 택배 개수
        int[] deliveries = {1,0,3,1,2};

        // 각 i+1 번째 집에서 수거해야할 택배 개수
        int[] pickups = {0,3,0,4,0};

        long answer = new Solution().solution(cap, n, deliveries, pickups);
        System.out.println(answer);
    }
    
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int box = 0;
        List<Integer> deliveryBoxList = new ArrayList<Integer>();
        List<Integer> pickupBoxList = new ArrayList<Integer>();

        for(int i = deliveries.length; i > 0; i--){
            if(box + deliveries[i-1] > cap){
                break;
            }
            box += deliveries[i-1];
            deliveryBoxList.add(i);
        }
        
        for(int i = pickups.length; i > 0; i--){
            if(pickups[i-1] > 0){
                pickupBoxList.add(i);
                break;
            }
        }
        
        int pickupElement = 0;
        int deliveryElement = 0;

        if(pickupBoxList.size() > 0){
            pickupElement = pickupBoxList.get(pickupBoxList.size()-1);
        } else {
            pickupBoxList.add(0);
        }

        if(deliveryBoxList.size() > 0){
            deliveryElement = deliveryBoxList.get(deliveryBoxList.size()-1);
        } else {
            deliveryBoxList.add(0);
        }
        
        boolean pickupIsGreater = pickupElement > deliveryElement;
        if(pickupIsGreater){
            answer += pickupElement;
        }

        for(int i = 0; i < deliveries.length; i++){
            answer++;

            if(deliveryBoxList.contains(i+1)){
                deliveryBoxList.remove(i);
                deliveries[i] = 0;
            }

            if(deliveryBoxList.isEmpty()){
                break;
            }
        }
        
        box = 0;

        for(int i = pickups.length; i > 0; i--){
            answer++;
            if(box + pickups[i-1] <= cap){
                box += pickups[i-1];
                pickups[i-1] = 0;
            }
        }

        System.out.println(Arrays.toString(deliveries));
        System.out.println(Arrays.toString(pickups));

        return answer;
    }
}