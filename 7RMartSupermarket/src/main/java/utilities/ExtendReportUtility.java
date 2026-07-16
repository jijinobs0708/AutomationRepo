package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() { // mult testcases should not collide so
																		// synchronsastion is given
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html"); // LOCATION OFTHE HTML REP TO BE GENRATED, ./ : this is the directory,
		//extent-report - folder name 																
																										
		reporter.config().setReportName("7martsupermarket"); // config().setReportName("7RMart Project") 2 methods in ExtentSparkReporter
		//config,setreportname - when we call these 2 methods, the project name we gave will be displayed on top of report												
		extentReports.attachReporter(reporter); // attaching of extend report and extendssparkrep for report generation, if not done report wont generate
		extentReports.setSystemInfo("Organization", "Obsqura"); // org name
		extentReports.setSystemInfo("Name", "Jijin");// team membersname
		return extentReports; // createExtentReports() returns extentReports
	}
}
