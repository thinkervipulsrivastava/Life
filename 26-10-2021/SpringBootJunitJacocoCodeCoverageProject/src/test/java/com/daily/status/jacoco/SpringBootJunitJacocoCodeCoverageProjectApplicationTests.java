package com.daily.status.jacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJunitJacocoCodeCoverageProjectApplicationTests {

	@Test
	public void testName()
	{
		Message obj = new Message();
		Assertions.assertEquals("Hello World!", obj.getMessage("World"));
	}

	@Test
	public void testNameBlank()
	{
		Message obj = new Message();
		Assertions.assertEquals("Please Provide a name!", obj.getMessage(""));
	}

	@Test
	public void testNameNull()
	{
		Message obj = new Message();
		Assertions.assertEquals("Please Provide a name!", obj.getMessage(null));
	}

}
