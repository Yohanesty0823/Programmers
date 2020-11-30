package com.yohanesty.algorithm.hash;

import java.util.Arrays;

public class PlayerOfUncompleted {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};
		System.out.println(s.solution(participant1, completion1));
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(s.solution(participant2, completion2));
		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "ana", "mislav"};
		System.out.println(s.solution(participant3, completion3));
	}
}

class Solution{
	/*
	 * #프로그래머스ㅡ해시ㅡ완주하지 못한 선수
	 * 참가자와 완주자를 정렬하여, 
	 * 완주자는 참가자보다 개수가 1이 적다는 조건으로 인해, 비교 반복문에서 리턴하지 않으면 마지막 참가자가 완주하지 못한 선수이다.
	 * 
	 * */
	public String solution(String[] participant, String[] completion) {
		// 1. 입력 값 배열을 정렬한다.
        // 참가자 정렬
        Arrays.sort(participant);
        // 완주자 정렬
        Arrays.sort(completion);
        // 2. 완주자 길이만큼 반복, 참가자와 완주자를 비교하여 참가자와 완주자와 같지 않은 경우를 리턴한다.
        int i;
        for(i=0; i<completion.length; i++){
        	// 참가자 중 완주자가 아닌 경우
            if(!participant[i].equals(completion[i]))
            	// 참가자 리턴
                return participant[i];
        }
        // 3. 반복문 종료 후, 마지막 남은 참가자를 리턴한다.
        return participant[i];
    }
}