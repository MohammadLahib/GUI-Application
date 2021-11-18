import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTests {
	
	Triangle test =  new Triangle();


	@Test
	public void test1() {
		String result =  test.computeType("4", "4", "6");
		 assertEquals("Isosceles", result);
		
	}
	
	@Test
	public void test2() { 
		String result1 =  test.computeType("3", "4", "6");
		 assertEquals("Scalene", result1);
		
	}
	
	@Test
	public void test3() { 
		String result1 =  test.computeType("4", "4", "4");
		 assertEquals("Equilateral", result1);
		
	}
	
	@Test
	public void test4() { 
		String result1 =  test.computeType("true", "true", "true");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	@Test
	public void test5() { 
		String result1 =  test.computeType("4", "4", "-4");
		 assertEquals("Uncorrect_Error", result1);	
	}
	
	@Test
	public void test6() { 
		String result1 =  test.computeType("true", "60", "*");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	@Test
	public void test7() { 
		String result1 =  test.computeType("-1", "-1", "-1");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	@Test
	public void test8() { 
		String result1 =  test.computeType("400", "400", "400");
		 assertEquals("Equilateral", result1);
		
	}
	
	@Test
	public void test9() { 
		String result1 =  test.computeType("0", "0", "0");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	@Test
	public void test10() { 
		String result1 =  test.computeType("man", "man", "man");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	@Test
	public void test11() { 
		Triangle test =  new Triangle();
		String result1 =  test.computeType("a", "b", "1");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	@Test
	public void test12() { 
		String result1 =  test.computeType("", "", "");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	@Test
	public void test13() { 
		String result1 =  test.computeType("1", "", "");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	@Test
	public void test14() { 
		String result1 =  test.computeType("2", "2", "");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	@Test
	public void test15() { 
		String result1 =  test.computeType("2000000000", "200", "2000000000");
		 assertEquals("Isosceles", result1);
		
	}
	
	@Test
	public void test16() { 
		String result1 =  test.computeType("1", "1", "1");
		 assertEquals("Equilateral", result1);
		
	}

	
	
	@Test
	public void test17() { 
		String result1 =  test.computeType("2", "50", "50");
		 assertEquals("Isosceles", result1);
		
	}
	@Test
	public void test18() { 
		String result1 =  test.computeType("", "4", "4");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test19() { 
		String result1 =  test.computeType("4", "", "4");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test20() { 
		String result1 =  test.computeType("-1", "*", "2");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test21() { 
		String result1 =  test.computeType("a", "b", "1");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test22() { 
		String result1 =  test.computeType("", "", "4");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test23() { 
		String result1 =  test.computeType("4", "", "");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test24() { 
		String result1 =  test.computeType("2000000", "2", "2000000");
		 assertEquals("Isosceles", result1);
		
	}
	@Test
	public void test25() { 
		String result1 =  test.computeType("1", "5000", "2");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test26() { 
		String result1 =  test.computeType("1", "2", "5000");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test27() { 
		String result1 =  test.computeType("5000", "1", "2");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test28() { 
		String result1 =  test.computeType("2147483648", "1", "4");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test29() { 
		String result1 =  test.computeType("1", "2147483648", "2");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test30() { 
		String result1 =  test.computeType("2147483648", "1", "1");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test31() { 
		String result1 =  test.computeType("1", "2147483648", "2");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test32() { 
		String result1 =  test.computeType("-2147483647", "1", "2");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test33() { 
		String result1 =  test.computeType("1", "-2147483647", "2");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test34() { 
		String result1 =  test.computeType("1", "0", "0");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test35() { 
		String result1 =  test.computeType("1", "2", "0");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test36() { 
		String result1 =  test.computeType("0", "0", "1");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test37() { 
		String result1 =  test.computeType("1", "am", "2.5");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	@Test
	public void test38() { 
		String result1 =  test.computeType("-1", "-3", "-2");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test39() { 
		String result1 =  test.computeType("cmps", "cmps", "cmps");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test40() { 
		String result1 =  test.computeType("1", "2", "4");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test41() { 
		String result1 =  test.computeType("1", "1", "1");
		 assertEquals("Equilateral", result1);
		
	}
	@Test
	public void test42() { 
		String result1 =  test.computeType("1", "2", "-2147483647");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test43() { 
		String result1 =  test.computeType("4", "4", "4");
		 assertEquals("Equilateral", result1);
		
	}
	@Test
	public void test44() { 
		String result1 =  test.computeType("-2147483647", "1", "2");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test45() { 
		String result1 =  test.computeType("-2147483647", "4", "4");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test46() { 
		String result1 =  test.computeType("1", "2", "5000");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test47() { 
		String result1 =  test.computeType("1", "2", "2147483646");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test48() { 
		String result1 =  test.computeType("1", "-2147483646", "2");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test49() { 
		String result1 =  test.computeType("1", "2147483646", "4");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	@Test
	public void test50() { 
		String result1 =  test.computeType("1", "0", "4");
		 assertEquals("Uncorrect_Error", result1);
		
	}
	
	
	
}
