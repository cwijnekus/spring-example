package me.claystation.testexample;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TestUnitDependencyInjection {

	AController controller;

	@Test
	void testOriginalClass() {
		controller = new AController(new AComponentClass());
	}

	@Test
	void testMockClass() {
		AComponentClass mockComponent = mock(AComponentClass.class);
		when(mockComponent.thisMethodCallsGCP()).thenReturn(false);
		controller = new AController(mockComponent);
	}

}
