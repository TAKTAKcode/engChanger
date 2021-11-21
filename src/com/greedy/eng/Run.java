package com.greedy.eng;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		/* 영어 대,소문자 교환
		 * 1. 대문자 <=> 소문자 서로 바꿔서 출력 해주는 것
		 * ex) Apple <=> aPPLE
		 * 2. 영어로만 한정됨
		 * 3. 글자수는 제한 없이
		 * 
		 * !! chap10 - api / string.Appication1 참조!!
		 * */
		
		 /* toLowerCase() : 모든 문자를 소문자로 변환시킨다.
		  * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
		  * 원본에 영향을 주지 않는다. */
		
		
//		 String caseStr = "JavaOracle";
//		 System.out.println("toLowerCase() : " + caseStr.toLowerCase());
//		 System.out.println("toUpperCase() : " + caseStr.toUpperCase());
//		 
//		 System.out.println("caseStr : " + caseStr);
		 
//		 toLowerCase와 toUpperCase를 서로 구분해줘야함
//		 그러러면 무슨 키를 써야할까..for문..if문..
		 
//		 if(a ~ z 이면 >> A ~ Z 로 toUpperCase)
//		 else(A ~ Z 이면 >> a ~ z 로 toLowerCase)
//		
//		유니코드를 사용해서 a ~ z   / A ~ Z  구분해주기
//		a ~ z >>> 97 ~ 122
//		A ~ Z >>> 65 ~ 90 
//		
//		 
//		 charAt() 사용해서 개별적으로 단어 봐야할듯 + length 로 문자 전체 길이 판단
		
///////////////////////////////////////////////////////////////////////		 

		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하시는 문자열을 입력해주세요 : ");	//원하는 문자열 입력!
		String eng = sc.nextLine();						//입력할 수 있는 란 추가
		
		String all = "";								//대소문자 바꾸고 합치는 문자열
		
		for(int i = 0; i < eng.length(); i++) {			

			char sb = eng.charAt(i);					//한글자씩 확인 후 변환
		if( sb >= 65 && sb <=90 ) {						//아스키 코드로 대,소문자 구분
			
			all += String.valueOf(sb).toLowerCase();	
		} else if(sb >= 97 && sb <= 122) {
			
			all += String.valueOf(sb).toUpperCase();
		}
	}
		System.out.println(all);						//한글자 한글자 대소문자 구분 후 출력해줌!
		
		

	}

}
