package com.bit.day10;

public class Ex03 {

	public static void main(String[] args) {
		// ���ĺ� A-Z������ �迭�� �ְ� ����϶�
		
		int cnt;
		cnt=(int)('z'-'a')+1;
		int gap='a'-'A';
		
		char[] arr=new char[cnt];
		for(int i=0; i<cnt; i++){
			arr[i]=(char)('a'+i);
		}
		for(int i=0; i<cnt; i++){
			System.out.print((char)(arr[i]-gap)+":"+arr[i]+" ");
		}
		// A a
		// B b
		// C c
		// ..
		// Z z

	}

}