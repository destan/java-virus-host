package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Thanks: https://www.baeldung.com/java-testing-system-out-println
public class AppTest {

	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	void expectedOutput() {

		App.main(new String[] {});
		assertEquals("Hello world!", outputStreamCaptor.toString().trim());
	}

}
