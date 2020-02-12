package com.viva;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestPaymentService {
	
	@Autowired
	PaymentService service;

	@Test
	public void test() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
	
//		PaymentService service = context.getBean(PaymentService.class);
		service.execute();
	}

}
