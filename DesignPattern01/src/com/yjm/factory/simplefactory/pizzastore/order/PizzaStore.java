package com.yjm.factory.simplefactory.pizzastore.order;
//相当与一个客户端，发出订购
public class PizzaStore {
	
	public static void main(String[] args) {
		//new OrderPizza();
		
		
		//使用简单工厂模式
		new OrderPizza(new SimpleFactory());
		System.out.println("退出了程序~~");
	}

}
