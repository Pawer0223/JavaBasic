package Operation;

import java.security.cert.CertStoreSpi;

public class RoundCalc {

	public static void main(String[] args) {

		/*
		 * 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
		 * 변환공식이 'C = 5/9 x (F-32)'라고 할 때
		 * 변환결과값을 소수점 셋째자리에서 반올림 하도록 구하여라 
		 * Math.round() 사용금지
		 */
		
		int fahrenheit = 100;
//		float celcius = ( /* (1) */ );
		float celcius = (int)(( 5/9f * ( fahrenheit - 32 ))*100 + 0.5) / 100f ;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		/*
		 * 1. 값에 100을 곱한다.
		 *    37.77778 * 100
		 * 
		 * 2. 1의 결과에 0.5를 더한다.
		 *    3777.778 + 0.5 -> 3778.278
		 *    
		 * 3. 2의 결과를 int타입으로 변환한다.
		 *    (int)3778,278 -> 3778
		 * 
		 * 4. 3의 결과를 100f로 나눈다. ( 100으로 나누면 소수점 아래의 값을 잃는다. )
		 *    3778 / 100f -> 37.78
		 *    
		 * 
		 * 
		 */

	}

}
