package recursion2;

import java.security.SecureRandom;
import java.util.Random;

public class Rough {

	public static void main(String[] args) {
		// System.out.println("testing_10dlc".toUpperCase());
		String s = "Raman";
		s = s.replace('*', 'a');
		System.out.println(s);
		s = s.replace('*', 'a');
		System.out.println(s);
		s = s.replace('*', 'a');
		System.out.println(s);
	}

	public String getCampaignName() {
		int length = 5;
		Random random = new SecureRandom();
		char[] CHARSET_AZ_09 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		char[] result = new char[length];
		for (int i = 0; i < result.length; i++) {
			// picks a random index out of character set > random character
			int randomCharIndex = random.nextInt(CHARSET_AZ_09.length);
			result[i] = CHARSET_AZ_09[randomCharIndex];
		}
		return "Automation_Campaign_" + new String(result);
	}

	public String getPhoneNumber() {
		int length = 9;
		Random random = new SecureRandom();
		char[] CHARSET_09 = "0123456789".toCharArray();
		char[] result = new char[length];
		for (int i = 0; i < result.length; i++) {
			// picks a random index out of character set > random character
			int randomCharIndex = random.nextInt(CHARSET_09.length);
			result[i] = CHARSET_09[randomCharIndex];
		}
		return "12" + new String(result);
	}

}
