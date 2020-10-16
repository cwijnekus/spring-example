package me.claystation.testexample;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TestUnitStatic {

	StaticController controller;

	@Test
	void testOriginalClass() {
		controller = new StaticController();
	}
}
