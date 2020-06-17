package com.my.app.main.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/config/spring/root-context.xml"})
public class MainServiceTest {
	
	@Autowired
	private MainService mainService;
	
	@Test
	public void testGetMain() {
		mainService.getMain();
	}

}
