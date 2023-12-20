package com.bit.test;

import java.io.IOException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pages.HomePage;



public class SmokeTest  extends baseTest {
	
	HomePage hp; 
	@Test
	public void test1(){
		hp =  new HomePage(driver);
	}

}
