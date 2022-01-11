package com.collections;

public class Stack {
	int size = 10;
	private Object[] array = new Object[size];
	private int top = -1;
	public void push(Object o) {
		if(top == size-1) {
			System.out.println("Stack is overflow");
		}else {
			array[++top]=o;
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is underslow");
		}else {
			array[top--]=null;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("[ ");
		for (Object object : array) {
			if(object==null)
				break;
			s.append(object);
			s.append(",");
		}
		s.deleteCharAt(s.length()-1);
		s.append(" ]");
		return s.toString();
	}

}
