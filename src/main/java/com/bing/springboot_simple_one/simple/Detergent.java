package com.bing.springboot_simple_one.simple;

class Cleanser {

	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append("dilute()");
	}

	public void apply() {
		append("apply()");
	}

	public void scrub() {
		append("scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}

public class Detergent extends Cleanser {

	public void scrbu() {
		append("Detergent.scrub()");
		super.scrub();
	}

	public void foam() {
		append("foam()");
	}

	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("test base class:");
		Cleanser.main(args);
	}
}
