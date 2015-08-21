package ua.org.oracle.academy.malahk;

import java.util.Arrays;

public class StringUtilsMain {


	public static void main(String[] args) {
	
		System.out.println(StringUtils.reverseString("I AM GROOT"));
		// TODO Auto-generated method stub
		System.out.println(StringUtils.isPolyndrom("А роза упала на лапу Азора"));
		
		System.out.println(StringUtils.replaceWord("I AM GROOT"));

		System.out.println(StringUtils.replaceWordsInSentence("I AM GROOT. I AM GROOT. I AM GROOT"));

		System.out.println(StringUtils.isDate("28.04.1987"));
	
		System.out.println(Arrays.toString(StringUtils.findPhoneNumber("+3(063)277-18-78" + "+3(050)277-18-89")));
	}
    
   
   

}