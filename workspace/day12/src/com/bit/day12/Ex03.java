package com.bit.day12;

public class Ex03 {

	public static void main(String[] args) {
		// int�� ���� Ŭ����
		Integer su1=new Integer(128);
		Integer su2=new Integer("150");

		// ������
		System.out.println(su1);
		System.out.println(su2);
		// �ʵ�-�Ӽ�
		System.out.println(su1.MIN_VALUE);
		System.out.println(su1.MAX_VALUE);
		System.out.println(su1.SIZE);
		// �޼���-���
		System.out.println(su1.hashCode());
		System.out.println(su1.toString());
		System.out.println(su1.equals(su2));
		System.out.println(su1.intValue());
		System.out.println(su1.byteValue());
		System.out.println(su1.shortValue());
		System.out.println(su1.longValue());
		System.out.println(su1.floatValue());
		System.out.println(su1.doubleValue());
		System.out.println(su1.compareTo(su2));
		// static
		int su3=Integer.parseInt("1234");
		System.out.println(su3);
		Integer su4=Integer.valueOf(1111);
		Integer su5=Integer.valueOf("2222");
		int su6=16;
		System.out.println("2����:"+Integer.toBinaryString(su6));
		System.out.println("8����:"+Integer.toOctalString(su6));
		System.out.println("16����:"+Integer.toHexString(su6));
	}

}











