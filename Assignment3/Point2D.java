package com.app.geometry;

public class Point2D{
	private int x;
	private int y;
	public Point2D() {}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getDetails() {
		return ""+this.x+","+this.y;
	}
	public boolean isEqual(Point2D p) {
		if(this.x == p.x && this.y==p.y) {
			return true;
		}
		return false;
	}
	
	public double calculateDistance(Point2D p) {
		double dist; 
		int diffX = this.x - p.x;
		int diffY = this.y - p.y;
		double power = Math.pow(diffX,2) + Math.pow(diffY,2);
		dist = Math.sqrt(power);
		return dist;
	}
}

