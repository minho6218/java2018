package com.bit.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(1111);
		list1.add(2222);
		
		List list2 = new ArrayList();
		list2.add(1111);
		list2.add(2222);
		list2.add(3333);
		list2.add(4444);
		
		//list2.removeAll(list1);
		
		//List list3 = list2.subList(1, 4);
		
		Object[] arr = list2.toArray();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
//		for(int i=0; i<list2.size(); i++)
//		{
//			System.out.println(list2.get(i));
//		}
		
//		Iterator ite = list2.iterator();
//		
//		while(ite.hasNext()){
//			System.out.println(ite.next());
//		}
	}

}











