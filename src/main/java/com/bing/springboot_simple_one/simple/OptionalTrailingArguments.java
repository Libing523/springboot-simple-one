package com.bing.springboot_simple_one.simple;

import java.util.Iterator;

public class OptionalTrailingArguments {

	static void f(int required, String... trailing) {
		System.out.print("required: " + required + " ");
		for (String s : trailing)
			System.out.print(s + " ");
		System.out.println();

	}

	public static void main(String[] args) {

		f(1,"one");
		f(2,"one","two");
		f(0);
	}

}
