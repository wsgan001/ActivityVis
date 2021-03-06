package com.ibm.us.vis.geo;
import processing.core.PApplet;

//import java.awt.Color;

public class color  {
	public int r; 
	public int g; 
	public int b; 
	public int a; 
	public static color lightGray = new color(165, 161, 160, 150); 
	public static color lightBlue = new color(183, 226, 240, 150); 
	public static color darkBlue = new color(123, 166, 180, 150); 
	public static color lightGreen= new color(174, 255, 144, 150); 
	public static color darkGreen = new color(124, 205, 94, 150); 
	public static color lightPink= new color(239, 173, 245, 150); 
	public static void fill(color c, PApplet pa){
		pa.fill(c.r, c.g, c.b, c.a); 
	}
	public static void stroke(color c, PApplet pa){
		pa.stroke(c.r, c.g, c.b); 
	}
	public color(int r, int g, int b){
		//super(r, g, b); 
		this.r=r; this.g=g; this.b=b; 
	}
	color(int r, int g, int b, int a){
		//super(r, g, b, a); 
		this.r=r; this.g=g; this.b=b; this.a=a;  
	}
	public static color s(color c1, float s, color c2){
		return new color(c1.r+(int)((c2.r-c1.r)*s), c1.g+(int)((c2.g-c1.g)*s), c1.b+(int)((c2.b-c1.b)*s)); 
	}
}