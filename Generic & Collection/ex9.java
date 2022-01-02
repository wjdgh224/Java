package practice7;
import java.util.*;

interface IStack<T> {
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	Vector<T> v = new Vector<T>();
	public T pop() {
		if(v.size()==0)
			return null;	
		return v.remove(v.size()-1);
	}
	public boolean push(T ob) {
		if(v.capacity()<=v.size())
			return false;
		v.add(ob);
		return true;
	}
}

public class ex9 {

	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i=0; i<10; i++) stack.push(i);
		while(true) {
			Integer n = stack.pop();
			if(n==null) break;
			System.out.print(n + " ");
		}
	}

}
