package com.bit.day13;

public class Ex09 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int result=0;
		
		try{
			int su=sc.nextInt();
			result=10/su;
			
			System.out.println("10/"+su+"="+result);
		}catch(java.util.InputMismatchException e){
			System.out.println("����ȸ��java.util.InputMismatchException");
		}catch(java.lang.ArithmeticException e){
			System.out.println("����ȸ��ArithmeticException");
		}catch(java.lang.RuntimeException e){
			System.out.println("����ȸ��RuntimeException");
		}catch(java.lang.Exception e){
			System.out.println("����ȸ��Exception");
		}
	}

}