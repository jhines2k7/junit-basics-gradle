package iloveyouboss;

import java.util.*;

public class ScoreCollection {
	private List<Scorable> scores = new ArrayList<>();

	public void add(Scorable scoreable) {
		scores.add(scoreable);
	}

	public int arithmeticMean() {
		int total = scores.stream().mapToInt(Scoreable::getScore).sum();
		return total / scores.size();
	}
}