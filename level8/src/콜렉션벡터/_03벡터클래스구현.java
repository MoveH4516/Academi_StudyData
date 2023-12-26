package 콜렉션벡터;

import java.util.Arrays;

class MyVector{
	int[] arr;
	int size;
	int capacity;
	MyVector() {
		arr = new int[10];
		capacity = 10;
	}
	
	void add(int value) {
		size++;
		int[] temp = new int[size];
		for (int i = 0; i < size - 1; i++) {
			temp[i] = arr[i];
		}
		arr = new int[size];
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
		arr[size - 1] = value;
	}
	
	void remove(int idx) {
		if (idx < 0 || idx >= size) {
			throw new IndexOutOfBoundsException();
		}
		int index = 0;
		size--;
		int[] temp = arr;
		arr = new int[size];
		for (int i = 0; i < temp.length; i++) {
			if (i != idx) {
				arr[index++] = temp[i];
			}
		}
	}
	
	void add (int idx, int value) {
		if (idx < 0 || idx >= size) {
			throw new IndexOutOfBoundsException();
		}
		size++;
		int[] temp = arr;
		arr = new int[size];
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (i != idx) {
				arr[i] = temp[index++];
			}
		}
		arr[idx] = value;
	}
	
	int size() {
		return size;
	}
	
	void set (int idx, int value) {
		if (idx < 0 || idx >= size) {
			throw new IndexOutOfBoundsException();
		}
		arr[idx] = value;
	}
	
	int get (int idx) {
		return arr[idx];
	}
	
	void clear() {
		arr = null;
		size = 0;
	}
	
	@Override
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		return Arrays.toString(arr);
	}

	int capacity() {
		if (size > capacity) {
			capacity += 10;
		}
		return capacity;
	}
}

public class _03벡터클래스구현 {
	public static void main(String[] args) {
		
		MyVector v1 = new MyVector();
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		for (int i = 0; i < 10; i++) {
			v1.add(i * 10);
		}
		System.out.println(v1.size());
		System.out.println(v1.get(2));
		System.out.println(v1);
		
		v1.set(2, 2000);
		System.out.println(v1.get(2));
		System.out.println(v1);
		
		v1.add(3, 3000);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1);
		
		v1.remove(5);
		System.out.println(v1.get(5));
		System.out.println(v1.get(4));
		System.out.println(v1.size());
		System.out.println(v1);
		
		v1.clear();
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
	}
}
