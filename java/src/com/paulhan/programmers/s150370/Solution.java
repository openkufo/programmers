package com.paulhan.programmers.s150370;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution {

    private final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy.MM.dd");
    private final int LAST_DAY = 28;
    private Map<String, Integer> expireDateMap;
    public static void main(String[] args) throws ParseException {
        String date = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] answer = new Solution().solution(date, terms, privacies);
        
        System.out.println("answer : " + Arrays.toString(answer));

    }

    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> resultList = new ArrayList<Integer>();

        initExpireDateMap(terms);
        for(int index = 0; index < privacies.length; index++){
            LocalDate expireDate = getExpireDate(today, privacies[index]);
            if(isValid(today, expireDate)){
                resultList.add(index + 1);
            }
        }

        answer = resultList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }

    private void initExpireDateMap(String[] terms){
        this.expireDateMap = new HashMap<String, Integer>();
        for (String term : terms) {
            StringTokenizer st = new StringTokenizer(term);
            this.expireDateMap.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }
    }

    private LocalDate getExpireDate(String today, String privacy){
        StringTokenizer st = new StringTokenizer(privacy);
        LocalDate privacyDate = LocalDate.parse(st.nextToken(), DATE_TIME_FORMAT);
        int expireMonth = expireDateMap.get(st.nextToken());
        
        int year = privacyDate.getYear();
        int month = privacyDate.getMonthValue();
        int day = privacyDate.getDayOfMonth();

        if(day == 1){
            if(month == 1){
                year--;
                month = 12;
            } else {
                month--;
            }

            day = LAST_DAY;
        } else {
            day--;
        }

        privacyDate = LocalDate.of(year, month, day);
        
        return privacyDate.plusMonths(expireMonth);
    }

    private boolean isValid(String today, LocalDate expireDate){
        LocalDate date = LocalDate.parse(today, DATE_TIME_FORMAT);
        
        return date.isAfter(expireDate);
    }
}