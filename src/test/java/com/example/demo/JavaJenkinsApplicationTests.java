package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JavaJenkinsApplicationTests {

	static Logger log = LoggerFactory.getLogger(JavaJenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		log.info("Test Case Executing...");
		assertEquals(true,true);
	}

}
