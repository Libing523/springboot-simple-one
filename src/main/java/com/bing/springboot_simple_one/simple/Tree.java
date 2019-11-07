package com.bing.springboot_simple_one.simple;

public class Tree {

	int height;
	public Tree() {
		System.out.println("Planting a seeding");
		height = 0;
	}
	public Tree(int height) {
	
		this.height = height;
		System.out.println("Create new 	Tree that is"+height+"feel tall");
	}
	void info() {
		System.out.println("Tree is "+height+"feel tall");
	}
	void info(String s) {
		System.out.println(s+":Tree is"+height+"feel tall");
	}
	
	
}
