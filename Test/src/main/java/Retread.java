/**
 * 
 */
package main.java;

/**
 * @author ss
 * 
 */
class MyException extends Exception {
}

class Tire {
	void doStuff() {
	}
}

public class Retread extends Tire {
	public static void main(String[] args) {
		new Retread().doStuff();
	}

	void doStuff() throws RuntimeException {
		System.out.println(7 / 0);
	}
}
