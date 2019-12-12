package com.kr.first.numberbaseball;

public class Game {
	public static void main(String[] args) {
		int gameLen = 3;
		int result = gameLen;
		if(args.length > 0) {
			result = Utils.parseStringToInt(args[0], gameLen);
			if(result < 2 || result > 5) {
				result = gameLen;
			}	
		}		
		NumberBaseballGame nbg = new NumberBaseballGame(result);
		nbg.gameStart();		
	}
}
