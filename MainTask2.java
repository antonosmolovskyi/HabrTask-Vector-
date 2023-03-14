package com.habr;

public class MainTask2 {

	public static void main(String[] args) {
		WeightElement arrays = new WeightElement();
		arrays.fillArray(3);
		System.out.println(arrays.toString());
		System.out.println(arrays.randomNumber());
	}

}
