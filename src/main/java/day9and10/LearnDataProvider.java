package day9and10;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {

	@DataProvider(name="fetchdata")
	public static String[][] getData(){
		String[][] testdata=new String[3][3];
		testdata[0][0]="CTS";
		testdata[0][1]="Lauv";
		testdata[0][2]="lak";
		
		testdata[1][0]="wipro";
		testdata[1][1]="praveen";
		testdata[1][2]="kannan";
		
		testdata[2][0]="hcl";
		testdata[2][1]="susmitha";
		testdata[2][2]="maha";
		return testdata;
	}
}
