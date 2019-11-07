package com.study.javaclass.innerclass;

public class ClientParcell {
	public static void main(String[] args) {
		Parcell parcell = new Parcell();

		//  外部类使用内部类
		Parcell.Contents contents = parcell.getContents();
	}
}
