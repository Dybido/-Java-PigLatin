import java.util.*;
import java.io.*;

public class PigLatin {
	
	public static void main(String[] argc){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			String in = sc.nextLine().toString();
			String letter = in.substring(0, 1);
			if(isVowel(letter)){
				String yay = "yay";
				in = in + yay;
				System.out.println(in);
			}else{
				letter = letter + "ay";
				String encrypted = in.substring(1, in.length());
				encrypted = encrypted + letter;
				System.out.println(encrypted);
			}
		}
		sc.close();
	}
	
	public static boolean isVowel(String s){
		String[] vowels = {"a" ,"e", "i", "o", "u"};
		for(String c : vowels){
			if(c.equals(s)){
				return true;
			}
		}
		return false;
	}
}
