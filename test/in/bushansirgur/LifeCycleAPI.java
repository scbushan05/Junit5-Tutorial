package in.bushansirgur;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycleAPI {

	@BeforeAll
	static void setupphaseAtClassLevel() {
		System.out.println("Before All annotation");
	}
	
	@BeforeEach
	void setupphase() {
		System.out.println("Before each annotation");
	}
	
	@Test
	void test() {
		System.out.println("This is first test case");
	}
	
	@AfterEach
	void cleanupphase() {
		System.out.println("After each annotation");
	}
	
	@AfterAll
	static void cleanphaseAtClassLevel() {
		System.out.println("After All annotation");
	}

}











