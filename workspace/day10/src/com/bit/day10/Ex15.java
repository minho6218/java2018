package com.bit.day10;

public class Ex15 {

	public static void main(String[] args) {
		// �ߺ� ����
		int[] arr = new int[4];
		for(int i=0; i<arr.length; i++){
			arr[i]=random();
			for(int j=0; j<i ; j++){
				if(arr[i]==arr[j]){
					i--;
					break;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	// 1~4
	public static int random(){
		return (int)(Math.random()*4)+1;
	}

}
