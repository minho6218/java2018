package com.bit.day14;

abstract class Mashine{
	void on(){
		System.out.println("�״�");
	}
	void off(){
		System.out.println("����");
	}
	abstract void work();
}

class Tv extends Mashine{
	
	void work(){
		System.out.println("ȭ���� ����Ѵ�");
	}
}

class Radio extends Mashine{
	
	void work(){
		System.out.println("���ļ��� ��� ����� ����ش�");
	}
}

class Audio extends Mashine{
	void work(){
		System.out.println("������ ����ش�");
	}
}

class Monitor extends Mashine{

	@Override
	void work() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex11 {

	public static void main(String[] args) {
		
		
		//Mashine target=new Tv();
		//Mashine target=new Radio();
		//Mashine target=new Audio();
		Mashine target=new Monitor();
		target.on();
		target.work();
		target.off();

	}

}


















