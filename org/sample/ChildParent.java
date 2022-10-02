package org.sample;

public class ChildParent implements par, par2 {

	@Override
	public void test2() {
		System.out.println("test2");
		
	}

	@Override
	public void test1() {
		System.out.println("test1");
	}

	@Override
	public void test3() {
		System.out.println("test3");
		
	}
	public static void main(String[] args) {
		ChildParent cp = new ChildParent();
		cp.test1();
		cp.test2();
		cp.test3();
	}
}
