import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int celciusDegree;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Hava sıcaklığını (celcius cinsinden) giriniz: ");
		celciusDegree = inp.nextInt();
		
		if(celciusDegree < 5) {System.out.println("Kayak yapmak için ideal bir sıcaklık.");}
		else if(celciusDegree >= 5 && celciusDegree < 15) {System.out.println("Sinemaya gitmek için güzel bir hava.");}
		else if(celciusDegree >= 15 && celciusDegree < 25) {System.out.println("Hava tam piknik yapmalık :)");}
		else {System.out.println("Hava baya sıcak, hadi yüzmeye!");}
	}
}
