package PigLatin;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigDriver {
	static List<String> mine = new ArrayList<>();
	static StringBuilder test = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Give me a string");
		String a = input.nextLine();

		breakdown(a);

		for (int i = 0; i < mine.size(); i++) {
			pigcheck(mine.get(i));

		}
		System.out.println(test);

	}

	public static void breakdown(String string) {
		String regex = "(\\w(?<!\\d)[\\w'-]*)";

		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(string);

		// The substituted value will be contained in the result variable
		while (matcher.find()) {

			mine.add(matcher.group(1));

		}

	}

	public static void pigcheck(String a) {

		test.append(Con(a) + Vowel(a) + ConVowel(a) + " ");
	}

	public static String Vowel(String a) {
		String aeiou = "^[AEIOUaeiou]";
		String returnit = "";
		Pattern p = Pattern.compile(aeiou);

		Matcher m = p.matcher(a);
		boolean result = m.find();
		if (result) {

			returnit = a + "way";
		}
		return returnit;

	}

	public static String Con(String string) {
		String regex = "(^[^AEIOUaeiou \\s][^AEIOUaeiou \\s])";
		String returnit = "";
		String subst = "";

		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(string);
		boolean result = matcher.find();
		if (result) {
			String add = matcher.group(1);
			String result2 = matcher.replaceAll(subst);

			returnit = result2 + add.toLowerCase() + "ay";
		}

		return returnit;
		// The substituted value will be contained in the result variable

	}

	public static String ConVowel(String string) {
		String regex = "^([^AEIOUaeiou]([AEIOUaeiou]))";

		String regex2 = "^[^AEIOUaeiou]";
		String returnit = "";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		// String add = matcher.group(1);
		if (matcher.find()) {

			String subst = "";
			Pattern pattern2 = Pattern.compile(regex2);
			Matcher matcher2 = pattern2.matcher(string);

			if (matcher2.find()) {

				String add = matcher2.group(0);
				String result2 = matcher2.replaceAll(subst);

				// System.out.println(add);
				returnit = result2 + add.toLowerCase() + "ay";
			}
		}
		return returnit;

	}

}
