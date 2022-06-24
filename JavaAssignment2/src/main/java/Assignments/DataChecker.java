//package Assignments;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.NetworkMode;
//
//
//public class DataChecker {
//	static XSSFSheet workSheet1;
//	static XSSFSheet workSheet2;
//	static String empId1,empName1,bankAccount1,accNumber1,salary1,empId2,empName2,bankAccount2,accNumber2,salaryCredited2;
//	static int rowCount1,rowCount2;
//	static ArrayList<String> empIdList1,empNameList1,bankAccList1,accNumberList1,salaryList1,empIdList2,empNameList2,bankAccList2,accNumberList2,salaryCreditedList2;
//	
//	static ExtentReports extent = new ExtentReports("C:\\Users\\YKAREDDY\\eclipse-workspace\\JavaAssignment2\\Reports\\report.html", false, NetworkMode.OFFLINE);
//	static ExtentTest test = extent.startTest("Difference Report", "Below is the log of difference found ");
//
//	public static void main(String[] args) throws IOException {
//		try {
//			printColumns();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		continueCheck();
//	}
//	public static void printColumns() throws IOException {
//
//	Scanner sc = new Scanner(System.in);
//	File file1 = new File("C:\\Users\\YKAREDDY\\eclipse-workspace\\Automation\\src\\main\\resources\\EmpData.xlsx");
//	FileInputStream inputStream1 = new FileInputStream(file1);
//	// Binary file is converted to WorkBook.
//	XSSFWorkbook wb1=new XSSFWorkbook(inputStream1);
//	XSSFSheet workSheet1 = wb1.getSheet("Sal");
//	File file2 = new File("C:\\Users\\YKAREDDY\\eclipse-workspace\\Automation\\src\\main\\resources\\PayrollData.xlsx");
//	FileInputStream inputStream2 = new FileInputStream(file2);
//	XSSFWorkbook wb2=new XSSFWorkbook(inputStream2);
//	XSSFSheet workSheet2 = wb2.getSheet("Bank");
//
//	System.out.println("\nColumns from book1Sheet1");
//	rowCount1 = workSheet1.getPhysicalNumberOfRows();
//	int columnCount1 = workSheet1.getRow(0).getLastCellNum();
//	XSSFRow file1Sheet1_row0 = workSheet1.getRow(0);
//	for(int i=0;i<columnCount1;i++) {
//		XSSFCell data1 = file1Sheet1_row0.getCell(i);
//		data1.setCellType(CellType.STRING);
//		String value1 = data1.getStringCellValue();
//		System.out.println("1"+i+". "+value1);
//	}
//	
//	System.out.println("\nColumns from book2Sheet1");
//	
//	rowCount2 = workSheet2.getPhysicalNumberOfRows();
//	int columnCount2 = workSheet2.getRow(0).getLastCellNum();
//	XSSFRow file2sheet1_row0 = workSheet2.getRow(0);
//	for(int i=0;i<columnCount2-1;i++) {
//		XSSFCell data2 = file2sheet1_row0.getCell(i);
//		data2.setCellType(CellType.STRING);
//		String value2 = data2.getStringCellValue();
//		System.out.println("2"+i+". "+value2);
//	}
//	if(rowCount1 == rowCount2) {
//		System.out.println("\nEnter the index of columns from book1Sheet1");
//		int [] cases = new int[columnCount1];
//		for(int i=0;i<cases.length;i++) {
//			cases[i]
//		}
//		int case1 = sc.nextInt();
//		System.out.println("\nEnter the index of columns from book2Sheet1");
//		int case2 = sc.nextInt();
//			switch (case1) {
//			case 10: //EmpID
//				empIdList1 = new ArrayList<String>(rowCount1-1);
//				for(int i=1;i<rowCount1;i++) {
//				XSSFRow row10 = workSheet1.getRow(i);
//				empId1="";
//				XSSFCell empId11 = row10.getCell(0);
//				empId11.setCellType(CellType.STRING);
//				empId1 = empId11.getStringCellValue();
//				empIdList1.add(empId1);
//				}
//				break;
//			case 11: //EmpName
//				empNameList1 = new ArrayList<String>(rowCount1-1);
//				for(int i=1;i<rowCount1;i++) {
//				XSSFRow row11 = workSheet1.getRow(i);
//				empName1="";
//				XSSFCell empName11 = row11.getCell(1);
//				empName11.setCellType(CellType.STRING);
//				empName1 = empName11.getStringCellValue();
//				empNameList1.add(empName1);
//				}
//				break;
//			case 12: //BankAccount
//				bankAccList1 = new ArrayList<String>(rowCount1-1);
//				for(int i=1;i<rowCount1;i++) {
//				XSSFRow row12 = workSheet1.getRow(i);
//				bankAccount1="";
//				XSSFCell bankAccount11 = row12.getCell(2);
//				bankAccount11.setCellType(CellType.STRING);
//				bankAccount1 = bankAccount11.getStringCellValue();
//				bankAccList1.add(bankAccount1);
//				}
//				break;	
//			case 13: //AccNumber
//				accNumberList1 = new ArrayList<String>(rowCount1-1);
//				for(int i=1;i<rowCount1;i++) {
//				XSSFRow row13 = workSheet1.getRow(i);
//				accNumber1="";
//				XSSFCell accNumber11 = row13.getCell(3);
//				accNumber11.setCellType(CellType.STRING);
//				accNumber1 = accNumber11.getStringCellValue();
//				accNumberList1.add(accNumber1);
//				}
//				break;
//			case 14: //Salary
//				salaryList1 = new ArrayList<String>(rowCount1-1);
//				for(int i=1;i<rowCount1;i++) {
//				XSSFRow row14 = workSheet1.getRow(i);
//				salary1="";
//				XSSFCell salary11 = row14.getCell(4);
//				salary11.setCellType(CellType.STRING);
//				salary1 = salary11.getStringCellValue();
//				salaryList1.add(salary1);
//				}
//				break;
//			default:
//				break;
//			}
//			switch (case2) {
//			case 20: //Emp ID
//				empIdList2 = new ArrayList<String>(rowCount1-1);
//				for(int i=1;i<rowCount2;i++) {
//				XSSFRow row20 = workSheet2.getRow(i);
//				empId2="";
//				XSSFCell empId22 = row20.getCell(0);
//				empId22.setCellType(CellType.STRING);
//				empId2 = empId22.getStringCellValue();
//				empIdList2.add(empId2);
//				}
//				for(int i=0;i<empIdList1.size();i++) {
//				if(!empIdList1.get(i).equals(empIdList2.get(i))) {
//					System.out.println("[ERROR] : "+"Differece in empId, at "+"Emp book>Sal sheet, empId: "+empIdList1.get(i)+" || "+"PayRoll book>Bank sheet, empId: "+empIdList2.get(i));
//					test.log(LogStatus.ERROR, "Differece in empId, at "+"Emp book>Sal sheet, empId: "+empIdList1.get(i)+"PayRoll book>Bank sheet, empId: "+empIdList2.get(i));
//				}
//				}
//				break;
//			case 21: //EmpName
//				empNameList2 = new ArrayList<String>(rowCount1-1);
//				for(int i=1;i<rowCount2;i++) {
//				XSSFRow row21= workSheet2.getRow(i);
//				empName2="";
//				XSSFCell empName22 = row21.getCell(1);
//				empName22.setCellType(CellType.STRING);
//				empName2 = empName22.getStringCellValue();
//				empNameList2.add(empName2);
//				}
//				for(int i=0;i<empNameList2.size();i++) {
//					if(!empNameList1.get(i).equals(empNameList2.get(i))) {
//						System.out.println("[ERROR] : "+"Differece in empName, at "+"Emp book>Sal sheet, empId: "+empIdList1.get(i)+"\\\\ empName: "+empNameList1.get(i)+" \\\\ "+"but in book>Bank sheet, at empId: "+empIdList1.get(i)+" \\\\ empName: "+empNameList2.get(i));
//						test.log(LogStatus.ERROR, "Differece in empName, at "+"Emp book>Sal sheet, empId: "+empIdList1.get(i)+"\\\\ empName: "+empNameList1.get(i)+" \\\\ "+"but in PayRoll book>Bank sheet, at empId: "+empIdList1.get(i)+" \\\\ empName: "+empNameList2.get(i));
//					}
//				}
//				break;	
//			case 22: //BankAccount
//				bankAccList2 = new ArrayList<String>(rowCount1-1);
//				for(int i=1;i<rowCount2;i++) {
//				XSSFRow row22 = workSheet2.getRow(i);
//				bankAccount2="";
//				XSSFCell bankAccount22 = row22.getCell(2);
//				bankAccount22.setCellType(CellType.STRING);
//				bankAccount2 = bankAccount22.getStringCellValue();
//				bankAccList2.add(bankAccount2);
//				}
//				for(int i=0;i<bankAccList2.size();i++) {
//					if(!bankAccList1.get(i).equals(bankAccList2.get(i))) {
//						System.out.println("[ERROR] : "+"Differece in bankAccount, at "+"Emp book>Sal sheet, empId: "+empIdList1.get(i)+"\\\\ bankAccount: "+bankAccList1.get(i)+" \\\\ "+"but in PayRoll book>Bank sheet, at empId: "+empIdList2.get(i)+" \\\\ bankAccount: "+bankAccList2.get(i));
//						test.log(LogStatus.ERROR, "Differece in bankAccount, at "+"Emp book>Sal sheet, empId: "+empIdList1.get(i)+"\\\\ bankAccount: "+bankAccList1.get(i)+" \\\\ "+"but in PayRoll book>Bank sheet, at empId: "+empIdList2.get(i)+" \\\\ bankAccount: "+bankAccList2.get(i));
//					}
//				}
//				break;		
//			case 23: //AccNumber
//				accNumberList2 = new ArrayList<String>(rowCount1-1);
//				for(int i=1;i<rowCount2;i++) {
//				XSSFRow row23 = workSheet2.getRow(i);
//				accNumber2="";
//				XSSFCell accNumber22 = row23.getCell(3);
//				accNumber22.setCellType(CellType.STRING);
//				accNumber2 = accNumber22.getStringCellValue();
//				accNumberList2.add(accNumber2);
//				}
//				for(int i=0;i<accNumberList2.size();i++) {
//					if(!accNumberList1.get(i).equals(accNumberList2.get(i))) {
//						System.out.println("[ERROR] : "+"Differece in accNumber, at "+"Emp book>Sal sheet, at empId: "+empIdList1.get(i)+" \\\\ accNumber: "+accNumberList1.get(i)+" \\\\ "+"but in PayRoll book>Bank sheet, at empId: "+empIdList1.get(i)+" \\\\ accNumber: "+accNumberList2.get(i));
//						test.log(LogStatus.ERROR, "Differece in accNumber, at "+"Emp book>Sal sheet, at empId: "+empIdList1.get(i)+" \\\\ accNumber: "+accNumberList1.get(i)+" \\\\ "+"but in PayRoll book>Bank sheet, at empId: "+empIdList1.get(i)+" \\\\ accNumber: "+accNumberList2.get(i));
//					}
//				}
//				break;
//			
//			case 24: //SalaryCredited
//				salaryCreditedList2 = new ArrayList<String>(rowCount1-1);
//				for(int i=1;i<rowCount2;i++) {
//				XSSFRow row24 = workSheet2.getRow(i);
//				salaryCredited2="";
//				XSSFCell salaryCredited22 = row24.getCell(4);
//				salaryCredited22.setCellType(CellType.STRING);
//				salaryCredited2 = salaryCredited22.getStringCellValue();
//				salaryCreditedList2.add(salaryCredited2);
//				}
//				for(int i=0;i<salaryCreditedList2.size();i++) {
//					if(!salaryList1.get(i).equals(salaryCreditedList2.get(i))) {
//						System.out.println("[ERROR] : "+"Differece in salary, at "+"Emp book>Sal sheet, at empId: "+empIdList1.get(i)+" \\\\ salary: "+salaryList1.get(i)+" \\\\ "+"but in PayRoll book>Bank sheet, at empId: "+empIdList1.get(i)+" \\\\ salaryCredited: "+salaryCreditedList2.get(i));
//						test.log(LogStatus.ERROR, "Differece in salary, at "+"Emp book>Sal sheet, at empId: "+empIdList1.get(i)+" \\\\ salary: "+salaryList1.get(i)+" \\\\ "+"but in PayRoll book>Bank sheet, at empId: "+empIdList1.get(i)+" \\\\ salaryCredited: "+salaryCreditedList2.get(i));
//					}
//				}
//				break;
//	
//			default:
//				break;
//			}	
//		}
//	else {
//		test.log(LogStatus.INFO, "Row count of 1: "+rowCount1+" Row count of 2: "+rowCount2);
//		System.out.println("Row count of 1: "+rowCount1+" Row count of 2: "+rowCount2);
//	}
//		extent.endTest(test);
//		extent.flush();
//	}
//	
//	public static void continueCheck() throws IOException {
//		System.out.println("\nPress \"Y\" to compare, to stop press anyKey");
//		Scanner sc= new Scanner(System.in);
//		char cont = sc.next().charAt(0);
//		if(cont == 'Y') {
//			printColumns();
//		}
//		else {
//			System.out.println("\nEND");
//			return;
//		}
//		continueCheck();
//	}
//	
//}
//
//
//
//
//
//
//
