/* Weichen Liu
APCS
HW05 -- SummerHW03
2021-09-27
*/

public class Time{
	
	public static void main(String[] args){
		int hour = 11;
		int minute = 18;
		int second = 32;
		int Totalsec = 86400;
		int midnightsec = (hour * 3600) + (minute * 60) + second;
		System.out.println(midnightsec);
		int Dayleft = (Totalsec - midnightsec);
		System.out.println(Dayleft);
		int PercentPass = ((midnightsec * 100)/ Totalsec);
		System.out.println(PercentPass + "%");
		hour = 11;
		minute = 35;
		second = 24;
		int SecElapsed = ((hour * 3600) + (minute * 60) + 24) - midnightsec;
		System.out.println(SecElapsed);
	}
	
}
	
	
