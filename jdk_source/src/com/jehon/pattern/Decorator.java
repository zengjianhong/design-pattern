package com.jehon.pattern;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Decorator {

	public static void main(String[] args) throws Exception{
		
		//˵��
		//1. InputStream �ǳ�����, ��������ǰ�潲�� Drink
		//2. FileInputStream ��  InputStream ���࣬��������ǰ��� DeCaf, LongBlack
		//3. FilterInputStream  ��  InputStream FilterInputStream���ࣺ��������ǰ�� �� Decorator ������
		//4. DataInputStream ��  ���࣬����������ߣ�����ǰ��� Milk, Soy ��
		//5. FilterInputStream �� ��  protected volatile InputStream in; ������װ����
		//6. �����ó���jdk ��io��ϵ�У�����ʹ��װ����ģʽ
		
		DataInputStream dis = new DataInputStream(new FileInputStream("d:\\abc.txt"));
		System.out.println(dis.read());
		dis.close();
	}

}


