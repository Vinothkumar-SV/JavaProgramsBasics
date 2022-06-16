package assignment;

import java.util.HashMap;
import java.util.Map;
public class Chararrrep {
	public static void main(String[] args) {
		String[] A = { "VinothVinothS" };
		int n = A.length;
		HashMap<String, Integer> hash_table = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			Integer j = hash_table.get(A[i]);
			hash_table.put(A[i], (j == null) ? 1 : j + 1);
		}
		int max_freq = 0;
		int second_highest_freq = 0;
		for (Map.Entry<String, Integer> entry : hash_table.entrySet()) {
			max_freq = Math.max(max_freq, entry.getValue());
			if (second_highest_freq < entry.getValue() && entry.getValue() < max_freq) {
				second_highest_freq = entry.getValue();
			}
		}
		for (Map.Entry<String, Integer> entry : hash_table.entrySet()) {
			if (entry.getValue() == second_highest_freq) {
				System.out.println(entry.getKey());

			}
		}

	}

}