package com.skilldistillery.web;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class PullBalls {

	public List<Integer> Input = new ArrayList<>();

	private int balls;

	private int high;

	public int getBalls() {

		return balls;
	}

	public void setBalls(int balls) {
		this.balls = balls;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}


	public List<Integer> getInput() {
		return Input;
	}

	public void setInput() {
		List<Ball> balllist = new ArrayList<>();
		BallFactory ballFac = new BallFactory();
		for (int i = 0; i < high; i++) {
			Ball b1 = (Ball) ballFac.createBall(i);
			balllist.add(b1);

		}
		Collections.shuffle(balllist);
		for (int j = 0; j < balls; j++) {
			int winner = balllist.get(j).getId();
			Input.add(winner);

		}
	}

	public PullBalls(int balls, int high) {
		this.balls = balls;
		this.high = high;
	}

}
