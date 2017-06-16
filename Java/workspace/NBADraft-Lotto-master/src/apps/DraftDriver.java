package apps;

import java.util.HashMap;
import java.util.*;

public class DraftDriver {

	public static void main(String[] args) {
		BallFactory b1 = new BallFactory();
		List<Ball> nbaBalls = new ArrayList<>(1001);
		List<Ball> nbaBalls2 = new ArrayList<>(1001);

		Map<Integer, Integer> nbaMap = new HashMap<>();

		// nbaMap.put(key, value)String[] team = { "s1", "s2", "s3", "s4", "s5",
		// "s6", "s6", "s7", "s8", "s9", "s10", "s11", "s12", "s13",
		// "s14" };
		// int[] numBalls = { 250, 199, 156, 119, 88, 63, 43, 28, 17, 11, 8, 7,
		// 6, 5
		// };
		//

		for (int i = 1; i < 69; i++) {
			nbaBalls.add(b1.createBall(Integer.toString(i)));

		}

		for (int i = 1; i < 26; i++) {
			nbaBalls2.add(b1.createBall(Integer.toString(i)));
		}

			// for (int i = 0; i < numBalls.length; i++) {
			// nbaBalls.addAll(b1.createBall(numBalls[i], team[i]));

			Hopper nba = new Hopper();

			for (int h = 0; h < 1; h++) {
				nba.shuffle(nbaBalls2);
				System.out.println("Red: " + nbaBalls2.get(0));

				for (int j = 0; j < 5; j++) {
					nba.shuffle(nbaBalls);
					System.out.println("White: " + nbaBalls.get(0));
					nbaBalls.remove(0);

				

			}

			// System.out.println(nbaBalls + "\n");
			// System.out.println(nbaBalls.size());
		}

	}
}
