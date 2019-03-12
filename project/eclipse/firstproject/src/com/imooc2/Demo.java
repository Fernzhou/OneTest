package com.imooc2;

public class Demo {
	User one = new User();

	public void test1() {

		one.setId(1);
		System.out.println(one.getId());
		Demo demo = new Demo();
		demo.test2(3);
		System.out.println(one.getId());

	}

	public void test2(int i) {
		one.setId(i);
		System.out.println(one.getId());
		// one.setId(2);
	}

	public static void main(String[] args) {
		Demo test = new Demo();
		test.test1();
	}
}
