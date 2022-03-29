package oop;

import org.checkerframework.checker.units.qual.g;

//to implement all methods declared in interface Webdriver
public class Googlechrome implements Webdriver {

	public static void main(String[] args) {
		Webdriver i=new Googlechrome();
		System.out.println(i.a);
		i.closebrowser();
	}

	@Override
	public void openbrowser() {
		//create body/logic according to requirement of class
		System.out.println("Open Googlechrome browser");
		
	}

	@Override
	public void closebrowser() {
		System.out.println("Close Googlechrome browser");
		
	}

	@Override
	public void navigatebrowser() {
		System.out.println("Navigate Googlechrome browser");
		
	}

	public void addons() {
		System.out.println("Many extensions are inbuilt");
		
	}
}
