package apps;

import java.util.Collections;
import java.util.*;

public class Hopper {

	public Hopper() {

	}

	public Ball shuffle(List l) {

		Collections.shuffle(l);

		return (Ball) l.get(0);
	}

}
