package com.paulhan.programmers.s178870;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        // int[] answer = new Solution().solution(new int[]{1, 2, 3, 4, 5}, 7);
        // int[] answer2 = new Solution().solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5);
        // int[] answer3 = new Solution().solution(new int[]{2, 2, 2, 2, 2}, 6);
        // System.out.println("answer4 : " + Arrays.toString(new Solution().solution(new int[]{1,3,1,1,1,1,1}, 4)));
        // System.out.println("answer : " + Arrays.toString(new Solution().solution(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println("answer2 : " + Arrays.toString(new Solution().solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5)));
        // System.out.println("answer3 : " + Arrays.toString(new Solution().solution(new int[]{2, 2, 2, 2, 2}, 6)));
        // System.out.println("answer4 : " + Arrays.toString(new Solution().solution(new int[]{1,1,1,1,1,1,3}, 3)));
        // System.out.println("answer5 : " + Arrays.toString(new Solution().solution(new int[]{2, 2, 2, 2, 2, 10, 10, 10, 10, 10, 10}, 30)));
        // System.out.println("answer6 : " + Arrays.toString(new Solution().solution(new int[]{1, 2, 2, 2, 2, 3, 3, 3}, 8)));
        // System.out.println("answer7 : " + Arrays.toString(new Solution().solution(new int[]{2, 2, 2, 2, 2}, 2)));
        // System.out.println("answer8 : " + Arrays.toString(new Solution().solution(new int[]{1, 2, 3, 4, 10, 10}, 10)));
        // System.out.println("answer9 : " + Arrays.toString(new Solution().solution(new int[]{3, 24, 109, 159, 176, 255, 320, 367, 404, 919}, 726)));
        // int[] sequence = new int[1000000];
        // Arrays.fill(sequence, 1);
        // System.out.println("answer9 : " + Arrays.toString(new Solution().solution(sequence, 1000000)));


    }

    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        int left = 0;
        int right = 0;
        int prevDiff = Integer.MAX_VALUE;
        long sum = 0;

        while(left < sequence.length){
            while(sum < k && right < sequence.length){
                sum += sequence[right++];
            }
            
            boolean isAnswer = sum == k
                            && right - 1 - left < prevDiff;
            if(isAnswer){
                answer[0] = left;
                answer[1] = right - 1;
                prevDiff = right - 1 - left;
            }
            
            sum -= sequence[left++];
        }
        return answer;
    }

    public int[] wrongAnswer(int[] sequence, int k) {
        int[] answer = {sequence.length, sequence.length + 1};

        int sequenceSize = sequence.length;
        
        int start = 0;
        while(start < sequence.length){
            int sum = 0;
            
            List<Integer> sequenceList = new ArrayList<Integer>();

            for(int i = start; i < sequence.length; i++){
                sum += sequence[i];

                if(sum > k){
                    break;
                }

                sequenceList.add(sequence[i]);
                if(sequenceSize < sequenceList.size()){
                    break;
                }
                
                if(sum == k){
                    int[] result = {start, start + sequenceList.size() - 1};

                    boolean isAnswer = sequenceSize > sequenceList.size()
                                    || (answer[0] >= result[0]
                                    && answer[1] > result[1]);

                    if(isAnswer){
                        sequenceSize = sequenceList.size();
                        answer[0] = result[0];
                        answer[1] = result[1];
                    }
                    break;
                }

            }

            if(answer[0] == answer[1]){
                break;
            }

            start++;
        }
        return answer;
    }
}
