package com.skilldistillery.web;

import java.util.*;

public class BallFactory {
	// private String team;

	public BallFactory() {

	}

//	public List<Ball> createBall(int amount, int team) {
//		List<Ball> balls = new ArrayList<>();
//		for (int i = 0; i < amount; i++) {
//			Ball b1 = new Ball(i);
//			balls.add(b1);
//
//		}
//		return balls;
//	}

	public Ball createBall(int team) {

		Ball b1 = new Ball(team);

		return b1;
	}

}
