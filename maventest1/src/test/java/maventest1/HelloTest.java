package maventest1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class HelloTest {

	@Test
	public void test() {
		Hello hel = new Hello();
		Assert.assertEquals(hel.sayHello(), "hello");
	}
	@Test
	public void test2(){
		Hello hel = new Hello();
		Assert.assertEquals(hel.sayHello(), "hel");
	}
	//just modify this
}
