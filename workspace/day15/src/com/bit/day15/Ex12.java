package com.bit.day15;

import java.util.Vector;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec = new Vector(10,5);// default:10, �������� 2�辿
		for(int i=0; i<11; i++){
			vec.addElement(i);
		}
//		vec.removeElementAt(0);
		vec.trimToSize();
		vec.addElement(10);
		System.out.println("�뷮:"+vec.capacity());
	}

}