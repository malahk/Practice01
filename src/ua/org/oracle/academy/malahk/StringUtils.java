package ua.org.oracle.academy.malahk;

//вынес строки в костанты
//переделал return в isDate method

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

	public static final String BLANK_STRING = "";
	public static final String SPACE_BAR = " ";
	public static final String DATE_PATTERN = "[0-9]{2}.[0-9]{2}.[0-9]{4}";
	public static final String PHONE_PATTERN = "\\+[0-9]{1}\\([0-9]{3}\\)[0-9]{3}-[0-9]{2}-[0-9]{2}";

	public StringUtils() {

	}

	// TODO Строки можно вынести в константы - solved
	public static String reverseString(String s) {
		String[] stringArray = s.split(BLANK_STRING);
		StringBuilder builder = new StringBuilder();

		for (int i = stringArray.length - 1; i > -1; --i) {
			builder.append(stringArray[i]);
		}

		return builder.toString();
	}

	// TODO Строки можно вынести в константы - solved

	public static boolean isPolyndrom(String s) {
		String noSpaces = s.replaceAll(SPACE_BAR, BLANK_STRING);
		String reversedS2 = reverseString(noSpaces);
		return noSpaces.equalsIgnoreCase(reversedS2);
	}

	public static String replaceWord(String s) {
		String[] stringArray = s.split("[^\\w]*");
		String stringAt0 = stringArray[stringArray.length - 1];
		stringArray[stringArray.length - 1] = stringArray[0];
		stringArray[0] = stringAt0;
		String tempS = BLANK_STRING;

		for (int i = 0; i < stringArray.length; ++i) {

			tempS = tempS.concat(stringArray[i] + SPACE_BAR);
		}

		return tempS.trim();
	}

	public static String replaceWordsInSentence(String s) {
		String[] sentenceArray = s.split(SPACE_BAR);
		StringBuilder builder = new StringBuilder();
		for (int i = sentenceArray.length - 1; i > 0; --i) {
			builder.append(sentenceArray[i]);
			builder.append(SPACE_BAR);
		}
		builder.append(sentenceArray[0]);

		return builder.toString();
	}

	public static boolean isDate(String s) {
		//@ TODO find не тот метод который тут нужно было использовать
		//сделал
		return Pattern.matches(DATE_PATTERN, s);

	}

	public static List<String> findPhoneNumber(String s) {
		int index = 0;
		Pattern datePatt = Pattern
				.compile(PHONE_PATTERN);
		Matcher m = datePatt.matcher(s);
//		String[] phoneNumber = new String[m.groupCount() + 1];
		List<String> phoneNumber = new ArrayList<>();

		while (m.find()) {
			phoneNumber.add(m.group());

		}

		return phoneNumber;
	}
}
