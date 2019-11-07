package com.bing.springboot_simple_one.simple;

class Art {
	Art() {
		System.out.println("art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}

public class Cartoon extends Drawing {
	public static final int VALUE_THREE = 39;
	
	public Cartoon() {
		System.out.println("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon cartoon = new Cartoon();
	}
}
