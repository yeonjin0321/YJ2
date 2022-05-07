package com.design.duck;

public abstract class Duck {

	 XXXBehavior flyBehavior;
	pubilc Behavior quackBehavior;

	public Duck() {
	}

	public abstract void XXXXXXX();

	public void performFly() { //날기 실행 매소드 1
		xxxBehavior.fly();
	}

	public void performQuack() { //콱실행 매소드 2
		xxxxxBehavior.quack();
	}

	public void swimming() { //스위밍 매소드 3
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}
}
