package net.mindview.util;

import java.text.DecimalFormat;

import ch.qos.logback.core.net.SyslogOutputStream;

public class FmtMicrometer {
	public static String fmtMicrometer(String text) {
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		double number = 0.00;
		try {
			number = Double.parseDouble(text);
		} catch (Exception e) {
			number = 0.00;
		}
		System.out.println(text+"——>"+df.format(number));
		return df.format(number);
	}

	public static void main(String[] args) {
		FmtMicrometer.fmtMicrometer("1");
		FmtMicrometer.fmtMicrometer("null");
		FmtMicrometer.fmtMicrometer(".75");
		FmtMicrometer.fmtMicrometer("1.");
		FmtMicrometer.fmtMicrometer("1.0");
		FmtMicrometer.fmtMicrometer("1.00");
		FmtMicrometer.fmtMicrometer("1.2");
		FmtMicrometer.fmtMicrometer("11111");
		FmtMicrometer.fmtMicrometer("11111.2");
		FmtMicrometer.fmtMicrometer("11111.25");
	}
}