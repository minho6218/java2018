package com.bit.day11;

public class Ex04 {

	public static void main(String[] args) {
		// String ���ڿ�Ŭ����
		java.lang.String st1="���ڿ�";
		String st2=new String("�������� ȣ���� ���� ���ڿ� ����");
		System.out.println("st2="+st2);
		
		// ""==null
		String st3=new String();
		System.out.println("st3="+st3);
		String st4=null;
		st4="";
		
		System.out.println(st1+st2);
		System.out.println(1+2+st1+true+1);
		
		String st5="���ڿ�";
		System.out.println(st1==st5);
		String st6=new String("���ڿ�");
		System.out.println("st1���� "+(st1==st6));
		System.out.println("st1���� "+(st1.equals(st6)));
		String st7="����";
		String st8="��";
		String st9=st7+st8;
		System.out.println(st9);
		System.out.println(st8);
		System.out.println(st7);
	}

}





















