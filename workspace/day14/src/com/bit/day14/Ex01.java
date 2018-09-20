package com.bit.day14;

/*
 * ----------------------------------------------------
 * �л������������α׷�(ver 0.1.0)
 * ----------------------------------------------------
 * ���ο�>3
 * 1.��ü����	2.�Է�	3.�󼼺���	0.����>2
 * 
 * 1�� �л� ����>70
 * 1�� �л� ����>80
 * 1�� �л� ����>90
 * 
 * 1.��ü����	2.�Է�	3.�󼼺���	0.����>1
 * 
 * ---------------------------------------------
 * �й�		| ����		| ����		| ����		
 * ---------------------------------------------
 * 1			70			80			90		
 * 2			0			0			0		
 * 3			0			0			0		
 * ---------------------------------------------
 * 
 * 1.��ü����	2.�Է�	3.�󼼺���	(4.����)	0.����>2
 * 
 * 2�� �л� ����>90
 * 2�� �л� ����>80
 * 2�� �л� ����>70
 * 
 * 1.��ü����	2.�Է�	3.�󼼺���	0.����>1
 * 
 * ----------------------------------------------
 * �й�		| ����		| ����		| ����		
 * ----------------------------------------------
 * 1			70			80			90		
 * 2			90			80			70		
 * 3			0			0			0		
 * ----------------------------------------------
 * 
 * 1.��ü����	2.�Է�	3.�󼼺���	(4.����)	0.����>3
 * 
 * �й�> 1
 * 
 * ---------------------------------------------------------------
 * �й�		| ����		| ����		| ����		| �հ�		| ���
 * ---------------------------------------------------------------
 * 1			70			80			90			000			00.00
 * ---------------------------------------------------------------
 * 
 * 
 * 
*/
public class Ex01 {
	final static String title=" ----------------------------------------------------"
							 +"\n �л������������α׷�(ver 0.1.0)"
							 +"\n ----------------------------------------------------";
	final static String menu="1.��ü����\t2.�Է�\t3.�󼼺���\t4.����\t0.����>";

	public static void main(String[] args) {
		
		System.out.println(title);
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int tot=numInput("���ο�>",1,20);
		int input=0;
		int[][] students=new int[tot][3];
		int inputCount=0;
		while(true){
			input=numInput(menu,0,4);
			if(input==0){
				System.out.println("�̿����ּż� �����մϴ�");
				break;
			}else if(input==1){
				//1.��ü����
				String header1=" ----------------------------------------------"
								 +"\n �й�\t| ����\t| ����\t| ����"		
								 +"\n ----------------------------------------------";
				System.out.println(header1);
				for(int i=0; i<students.length; i++){
					int[] stu=students[i];
					System.out.print(i+1);
					for(int j=0; j<stu.length; j++){
						System.out.print("\t| "+stu[j]);
					}
					System.out.println();
				}
				
			}else if(input==2){
				//2.�Է�
				inputCount++;
				if(tot>inputCount-1){
//				students[inputCount-1][0]=numInput(inputCount+"�� �л� ����>",0,100);
//				students[inputCount-1][1]=numInput(inputCount+"�� �л� ����>",0,100);
//				students[inputCount-1][2]=numInput(inputCount+"�� �л� ����>",0,100);
				
					String[] lec={"����","����","����"};
					for(int i=0; i<students[inputCount-1].length; i++){
						students[inputCount-1][i]=numInput(inputCount+"�� �л� "+lec[i]+">",0,100);
					}
				
				}else{
					System.out.println("�Է��Ͻ� �л��� �����ϴ�");
				}
				
			}else if(input==3){
				//3.�󼼺���
				int sum=0;
				String header2=" ---------------------------------------------------------------"
								 +"\n �й�\t| ����\t| ����\t| ����\t| �հ�\t| ���"
								 +"\n ---------------------------------------------------------------";
				int num=numInput("������ �й�>",1,tot);
				
				System.out.println(header2);
				System.out.print(num+"\t| ");
				System.out.print(students[num-1][0]+"\t| ");
				System.out.print(students[num-1][1]+"\t| ");
				System.out.print(students[num-1][2]+"\t| ");
				for(int j=0; j<students[num-1].length; j++){
					sum+=students[num-1][j];
				}
				System.out.print(sum+"\t| ");
				System.out.print(sum*100/students[num-1].length/100.0);
				System.out.println();
				
			}else if(input==4){
				// ����
				int num=numInput("������ �й�>",1,tot);
				String[] lec={"����","����","����"};
				for(int i=0; i<students[num-1].length; i++){
					students[num-1][i]=numInput(num+"�� �л� "+lec[i]+">",0,100);
				}
				
			}else{
				System.out.println("ERR)�Է¿���");
			}
			
		}
	}

	public static int numInput(String msg, int min, int max){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int su=-9999999;
		while(true){
			try{
				System.out.print(msg);
				su=sc.nextInt();
			}catch(java.util.InputMismatchException e){
				sc=new java.util.Scanner(System.in);
				System.out.println(min+"~"+max+"������ ���ڸ� �Է��ϼ���");
			}
			if(min<=su&&su<=max){break;}
		}
		return su;
	}
}







