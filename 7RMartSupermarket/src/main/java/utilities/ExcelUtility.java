package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constant;

public class ExcelUtility {
	static FileInputStream f;  //inbuilt class to read the file from the excel
	static XSSFWorkbook wb;   //inbuilt class from the apache,to read the details from workbook
	static XSSFSheet   sh;  //inbuilt class from the apache,to read the details from the sheet
	public static String getStringData(int a,int b, String sheet) throws 
IOException
	{
		f=new FileInputStream(Constant.TESTDATA);
		wb= new XSSFWorkbook(f);
		sh=wb.getSheet(sheet);//getSheet is a method to get the details from sheet
		XSSFRow r =sh.getRow(a);// inbuilt class in apache,to read the details from row, getRow is a method used to get details from row
		XSSFCell c = r.getCell(b); //inbuilt class in apache,to get the details of value from cell, getCell is a method used to get value from value. r.getCell - as its inside row we use r.
		return c.getStringCellValue();//getStringCellValue - to get the string value from cell
	}
	//method to get the integer value
	public static int getIntData(int a, int b, String sheet) throws IOException
	{
		f= new FileInputStream(Constant.TESTDATA);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int d = (int)c.getNumericCellValue();//getNumericCellValue() - to get the numbers(double value) from cell
		//(int)- type casting - to convert one datattype to another - typecasting
		//return String.valueOf(d); //Valueof() - method used for type conversion-as we want the o/p
		return(d);
	}

}
