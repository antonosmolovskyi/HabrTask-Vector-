package com.habr;

public class Vector {
	private double x;
	private double y;
	private double z;

	public Vector() {
	}

	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double countVectorLength() {
		return Math.sqrt((x * x) + (y * y) + (z * z));
	}

	public double countScalar(Vector vector) {
		return x * vector.x + y * vector.y + z * vector.z;
	}

	public Vector countVectorMulty(Vector vector) {
		return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
	}

	public double cos(Vector vector) {
		return countScalar(vector) / (this.countVectorLength() * vector.countVectorLength());
	}

	public static Vector[] arrays(int n) {
		Vector[] vectors = new Vector[n];
		for (int i = 0; i < vectors.length; i++) {
			vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
		} 
		return vectors;
	}
	
	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

}
