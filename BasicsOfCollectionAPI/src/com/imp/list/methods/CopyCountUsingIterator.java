package com.imp.list.methods;

public class CopyCountUsingIterator {

	
	Integer element;
	Integer count;
	
	public CopyCountUsingIterator() {}

	public CopyCountUsingIterator(Integer element, Integer count) {
		super();
		this.element = element;
		this.count = count;
	}

	public Integer getElement() {
		return element;
	}

	public void setElement(Integer element) {
		this.element = element;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "CopyCountUsingIterator [element=" + element + ", count=" + count + "]";
	};
	
	
}
