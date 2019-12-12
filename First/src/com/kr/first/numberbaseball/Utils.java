package com.kr.first.numberbaseball;

public class Utils {
	public static int parseStringToInt(String val, int def) {		
		int result = def;
		try {
			result = Integer.parseInt(val);
		}catch(Exception e) {}
		return result;
	}
}
