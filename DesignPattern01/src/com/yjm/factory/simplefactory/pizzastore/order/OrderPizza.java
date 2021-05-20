package com.yjm.factory.simplefactory.pizzastore.order;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.yjm.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.yjm.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.yjm.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.yjm.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
//构造器
	
//	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType;//订购披萨类型
//		do {
//			orderType = getType();
//			if(orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName("希腊披萨");
//			}else if(orderType.equals("cheese")) {
//				pizza = new CheesePizza();
//				pizza.setName("奶酪披萨");
//			}else if(orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("胡椒披萨");
//			}
//			
//			else {
//				break;
//			}
//			//输出pizza制作过程
//			pizza.bake();
//			pizza.box();
//			pizza.cut();
//			pizza.prepare();
//		}while(true);
//	}
	//定义一个简单工厂对象
	SimpleFactory simplefactory;
	Pizza pizza = null;
	//构造器
	public OrderPizza(SimpleFactory simplefactory) {
		setFactory(simplefactory);
	}
	public void setFactory(SimpleFactory simplefactory) {
		String orderType = "";//用户输入
		this.simplefactory = simplefactory;//设置简单工厂对象
		do {
			orderType = gettype();
		pizza =	this.simplefactory.createPizza(orderType);
		
		//输出pizza
		if(pizza != null) {//订购成功
			pizza.prepare();
			pizza.bake();
			pizza.box();
			pizza.cut();
		}else {
			System.out.println("订购披萨失败");
			break;
		}
		}while(true);
		
	
	
	
	}
	
	//写一个方法，可以获取客户希望订购的披萨种类

private String gettype() {
	
	try {
		BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("input pizza 种类:");
				String str = strin.readLine();
				return str;
	}catch (IOException e) {
		e.printStackTrace();
		return "";
	}
}
	
	
	
	
	
	
	
	
	
}
