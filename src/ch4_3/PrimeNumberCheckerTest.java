package ch4_3;

import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrimeNumberCheckerTest {
	PrimeNumberChecker checker;
	
	@BeforeClass
	public void setup() {
		checker = new PrimeNumberChecker();
	}
	
	@DataProvider (name="CSVDataProvider")
	public Iterator<Object[]> CSVDataProvider() {
		return ReadCSV.CSVDataProvider();
	}
	
	@Test (dataProvider="CSVDataProvider")
	public void testIsPrime(String description,int number,boolean expected) {
		boolean actualResult = checker.isPrime(number);
		Assert.assertEquals(actualResult, expected, "FAILED: " + description);
	}
}
