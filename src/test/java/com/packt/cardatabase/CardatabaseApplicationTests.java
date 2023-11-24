package com.packt.cardatabase;

import com.packt.cardatabase.web.CarController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CardatabaseApplicationTests {
	@Autowired
	private CarController Controller;

	@Test
	@DisplayName("First example test case")
	void contextLoads() {
		assertThat(Controller).isNotNull();
	}

	@Test
	public void testMethod() {
		//테스트 케이스 코드
	}

}
