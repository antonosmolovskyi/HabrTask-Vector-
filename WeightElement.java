package com.habr;

import java.util.Arrays;

public class WeightElement {
	private int[] array;
	private int[] weightArray;
	private int[] helpArray;
	public WeightElement() {}
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public int[] getWeightArray() {
		return weightArray;
	}
	public void setWeightArray(int[] weightArray) {
		this.weightArray = weightArray;
	}
	public int[] getHelpArray() {
		return helpArray;
	}
	public void setHelpArray(int[] helpArray) {
		this.helpArray = helpArray;
	}
	public WeightElement(int[] array, int[] weightArray) {
		this.array = array;
		this.weightArray = weightArray;
	}
	
	public void fillArray(int length) {
		array = new int[length];
		weightArray = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10)+1;
		}
		int sumWeight = 0;
		for (int i = 0; i < weightArray.length; i++) {
			weightArray[i] = (int)(Math.random()*10)+1;
		}
		for (int i = 0; i < weightArray.length; i++) {
			sumWeight += weightArray[i];
		}
		int tempForWeight = 0;
		helpArray = new int[sumWeight];
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < weightArray[tempForWeight]; j++) {
				helpArray[j] = array[tempForWeight];
			}
			tempForWeight++;
		}
	}
	public int randomNumber() {
		return helpArray[(int)(Math.random()*helpArray.length)];
	}
	
	@Override
	public String toString() {
		return "WeightElement [array=" + Arrays.toString(array) + ", weightArray=" + Arrays.toString(weightArray)
				+ ", helpArray=" + Arrays.toString(helpArray) + "]";
	}
	
	
	
}
