import java.util.*;
import java.io.*;
/**
 * 
 * @author dybido
 * If it starts with vowel : append "yay" to word
 * Else if it starts with consonant : all letters before the first vowel are placed at the 
 *    end of the word and appended with an "ay"
 */
public class PigLatin {
	public static String[] vowels = {"a" ,"e", "i", "o", "u"};
	 
	public static void main(String[] argc){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			String in = sc.nextLine().toString();
			//Obtaining the first letter in the word
			String letter = in.substring(0, 1);
			
			if(isVowel(letter)){
				String yay = "yay";
				in = in + yay;
				System.out.println(in);
			}else{
				String postfix = isConsonant(in);
				//Obtaining all letters after and including the first vowel
				String prefix = in.substring(postfix.length(), in.length()); 
				
				postfix = postfix + "ay";
				prefix = prefix + postfix;
				System.out.println(prefix);
			}
		}
		sc.close();
	}
	
	/**
	 * 
	 * @param s is the string to be checked for vowels
	 * @return TRUE if the first letter is a vowel, else false
	 */
	public static boolean isVowel(String s){
		for(String c : vowels){
			if(c.equals(s)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param s is the string to be checked for consonants 
	 * @return a string including all the letters(which are consonants) before the first vowel
	 */
	public static String isConsonant(String s){
		String[] str = s.split("");
		String str2 = "";
		
		int i = 0;
		while(!isVowel(str[i])){
			str2 = str2 + str[i];
			i++;
		}
		return str2;
	}
}
