package day9and10;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectLogin {

	@Test(groups={"smoke"},dataProvider="fetchdata1")
	public void createLead1(String cName,String fName,String lName)throws InterruptedException{
		clickByLinkNoSnap("Create Lead");			
		enterById("createLeadForm_companyName",cName);		
		//enterById("createLeadForm_parentPartyId","13591");
		enterById("createLeadForm_firstName",fName);
		enterById("createLeadForm_lastName",lName);

		/*selectVisibileTextById("createLeadForm_dataSourceId","Direct Mail");
			selectVisibileTextById("createLeadForm_marketingCampaignId","Car and Driver");

			enterById("createLeadForm_firstNameLocal","Praveen");
			enterById("createLeadForm_lastNameLocal","Kannan");
			enterById("createLeadForm_personalTitle","Mr.");
			enterById("createLeadForm_generalProfTitle","Simple");
			enterById("createLeadForm_departmentName","Testing");
			enterById("createLeadForm_annualRevenue","6000");
			selectVisibileTextById("createLeadForm_currencyUomId","INR - Indian Rupee");


			selectVisibileTextById("createLeadForm_industryEnumId","Distribution");
			enterById("createLeadForm_numberEmployees","500");
			selectVisibileTextById("createLeadForm_ownershipEnumId","Partnership");
			enterById("createLeadForm_sicCode","1234");
			enterById("createLeadForm_tickerSymbol","%@#");
			enterById("createLeadForm_description","Good Luck....");
			enterById("createLeadForm_importantNote","Good luck2....");
			enterById("createLeadForm_primaryPhoneCountryCode","+91");
			enterById("createLeadForm_primaryPhoneAreaCode","85");
			enterById("createLeadForm_primaryPhoneNumber","8888888888");
			enterById("createLeadForm_primaryPhoneExtension","4321");
			enterById("createLeadForm_primaryPhoneAskForName","praveen");
			enterById("createLeadForm_primaryEmail","sek2525@gmail.com");
			enterById("createLeadForm_primaryWebUrl","http://www.leaftaps.com");

			enterById("createLeadForm_generalToName","Praveen");
			enterById("createLeadForm_generalAttnName","kannan");
			enterById("createLeadForm_generalAddress1","SS no1");
			enterById("createLeadForm_generalAddress2","KK NAgar");
			enterById("createLeadForm_generalCity","Chennai");
			selectVisibileTextById("createLeadForm_generalCountryGeoId","India");
			enterById("createLeadForm_generalPostalCode","600030");
			enterById("createLeadForm_generalPostalCodeExt","044");
			selectVisibileTextById("createLeadForm_generalStateProvinceGeoId","TAMILNADU");*/
		clickByClassName("smallSubmit");
	}
	@DataProvider(name="fetchdata1")
	public static Object[][] getData() throws InvalidFormatException, IOException{
		File fis=new File("./data/value.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		XSSFRow row=sheet.getRow(0);
		int colCount=row.getLastCellNum();
		Object[][] testdata=new Object[rowCount][colCount];

		for (int i = 1; i <= rowCount; i++) {
			row=sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				testdata[i-1][j]=cell.getStringCellValue();
			}
		}
		wb.close();
		return testdata;
	}

}
