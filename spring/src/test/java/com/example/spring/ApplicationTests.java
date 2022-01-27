package com.example.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	public void add(){
		assertEquals(30, junitcodes.add(10, 20));
	}

	@Test
	public void sub(){
		assertEquals(30, junitcodes.sub(50, 20));
	}

	@Test
	public void mul(){
		assertEquals(100, junitcodes.mul(25, 4));
	}

	@Test
	public void div(){
		assertEquals(5, junitcodes.div(25, 5));
	}

	@Test
	public void modu(){
		assertEquals(2, junitcodes.modu(12, 5));
	}
}