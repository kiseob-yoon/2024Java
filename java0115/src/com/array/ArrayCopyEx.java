package com.array;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {
		String [] arr = {"김사랑", "김하나", "김두율","김세엣"};
		
		String [] newArr = new String[arr.length];
		
		for(String str: newArr) {
			System.out.println(str);
		}
		//p 195 배열 복사 예제
		System.arraycopy(arr, 0, newArr, 0,newArr.length);
		//System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//Object: 모든 객체 타입, 따라서 모든 종류의 배열을 처리가능
		//src: 복사할 원본 배열
		//srcPos: 원본 배열에서 복사를 시작할 위치
		//dest: 복사될 대상 배열
		//destPos: 대상 배열에서 복사를 시작할 위치
		//length: 복사할 요소의 개수
		for(String str : newArr) {
			System.out.println(str);
		}
		//향상된 배열 복사
		String [] newArr1 = Arrays.copyOf(arr, arr.length);
		for(String str : newArr1) {
			System.out.println(str);
		}
	}

}
