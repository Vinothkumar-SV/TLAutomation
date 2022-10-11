package assignment3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Reoccurance {

	public static void main(String[] args) {
		String str = "Vinothkumarvinolajanaksllkkmeodiorppplmnnnnunuoooiiiiiiiiiii";
		Map<Character, Integer> mpa = new HashMap<Character, Integer>();
		char[] cs = str.toCharArray();

		for (char MK : cs) {
			if (mpa.containsKey(MK)) {
				mpa.put(MK, mpa.get(MK) + 1);

			} else {
				mpa.put(MK, 1);
			}
		}
		for (Entry<Character, Integer> rev : mpa.entrySet()) {
			System.out.println(" " + rev);

		}
	}

}