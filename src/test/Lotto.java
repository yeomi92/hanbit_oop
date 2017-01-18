package test;
/**
@FILE  : LottoDraw.java
@DATE  : 2017. 01. 18.
@AUTHOR: Yeom Hye-Seon
@STORY : 로또볼 추첨
1~45까지 랜덤숫자
볼갯수는 총 6개
이미 추첨된 숫자는 배제.
출력은 []
 */
public class Lotto {
	private int lottoNum, count;
	private int[] ball;
	public void lottoDraw(String[] args) {
		int lottoNum = 0, count=0;
		int ball1=0,ball2=0,ball3=0,ball4=0,ball5=0,ball6=0;
		while(count<6){
			lottoNum = (int)(Math.random()*45+1);
			count++;
			switch(count){
			case 1:
				ball1=lottoNum;
				break;
			case 2:
				ball2=lottoNum;
				count=(lottoNum==ball1)?count--:count;
				break;
			case 3:
				ball3=lottoNum;
				count=(lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			case 4:
				ball4=lottoNum;
				count=(lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			case 5:
				ball5=lottoNum;
				count=(lottoNum==ball4||lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			case 6:
				ball6=lottoNum;
				count=(lottoNum==ball5||lottoNum==ball4||lottoNum==ball3||lottoNum==ball2||lottoNum==ball1)?count--:count;
				break;
			}
		}
		System.out.printf("[%d %d %d %d %d %d]",ball1,ball2,ball3,ball4,ball5,ball6);
	}
	
}
