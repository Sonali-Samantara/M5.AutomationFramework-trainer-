package practice;

import java.io.IOException;

import genericUtilities.ExcelFileUtility;
import genericUtilities.JavaUtility;
import genericUtilities.PropertyFileUtility;

public class GenericUtilityPractice {
	
	public static void main(String[] args) throws IOException {
		
		//test script
		PropertyFileUtility pUtil = new PropertyFileUtility();
		String value = pUtil.readDataFromPropertyFile("abc");
		System.out.println(value);
		String value1 = pUtil.readDataFromPropertyFile("password");
		System.out.println(value1);

		
		JavaUtility jUtil = new JavaUtility();
		String date = jUtil.getSystemDateInFormat();
		System.out.println(date);
		
		
		int ran = jUtil.getRandomNumber();
		System.out.println(ran);
		
		ExcelFileUtility eUtil = new ExcelFileUtility();
		String orgname = eUtil.readDataFromExcel("Organizations", 1, 2);
		String orgNameWithRandom = orgname+ran;
		
		System.out.println(orgname);
		System.out.println(orgNameWithRandom);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
