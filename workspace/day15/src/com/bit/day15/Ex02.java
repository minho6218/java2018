package com.bit.day15;

interface Inter01{
	// ������Ģ - ù���� ���� �빮�ڻ��
	// ���� �߻�޼���� ����� ������ ����
	// �޼��� - abstract - ��������
	// �޼��� - ���������ڴ� ���� public - ��������
	// ���� - final ��������
	final int su1=1111;
	int su2=2222;
	
	public abstract void func01();
	
	public void func02();
	
	void func03(); 
}

interface Inter02 extends Inter01,Inter03{
	// interface�� ������ ����� extends
	// ���߻���� ���
	int su2=333;
}

interface Inter03{
	void func04();
}

interface Inter05{}

















