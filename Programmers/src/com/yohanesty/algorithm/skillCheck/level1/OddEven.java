package com.yohanesty.algorithm.skillCheck.level1;

public class OddEven {
	
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.solution(3));
		System.out.println(s.solution(4));
		System.out.println(s.solution(0));
	}

}

class Solution1 {
	
	//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
	
    public String solution(int num) {
        String answer = "Odd";
        
        if(num%2 == 0){
            answer = "Even";
        }
        
        return answer;
    }
}