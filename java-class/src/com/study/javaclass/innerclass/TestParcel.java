package com.study.javaclass.innerclass;

public class TestParcel {

	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents contents = p.contents();
		Destination tasmania = p.destination("Tasmania");

	}
}
