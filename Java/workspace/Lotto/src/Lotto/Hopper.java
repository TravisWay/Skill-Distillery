package Lotto;

import javax.swing.Box.Filler;

import java.util.*;

public class Hopper {

	BallFactory b1 = new BallFactory();

	static List<Ball> BList = new ArrayList<>();

	public Hopper() {

	}

	public Ball shuffle(List l) {

		Collections.shuffle(l);

		return (Ball) l.get(0);
	}

	public List FillHopper(Map<String, Integer> map) {
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			int number = (int) pair.getValue();
			String value = (String) pair.getKey();
			BList.addAll(b1.createBall(number, value));
			it.remove();
		}

		return BList;

	}

}
