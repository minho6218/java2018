package com.bit.day13;

public class Ex03 {

	public static void main(String[] args) {
		// ����ó��
		int a=2;
		int b=1;
		int c=0;
		try{
			System.out.println("��");
				c=a/b;
			System.out.println("��");
		}catch(java.lang.ArithmeticException e){
			System.out.println("������ ������");
		}
		System.out.println(c);
	}

}