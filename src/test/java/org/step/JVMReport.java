package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {

	public static void generateJVMReport(String json) {

		File f = new File(System.getProperty("user.dir")+"\\AllReports\\JvmReport");
		
		Configuration c = new Configuration(f, "Facebook Application");
		
		c.addClassifications("platform", "Windows");
		
		c.addClassifications("Sprint", "1");
		c.addClassifications("JDKVersion", "1.8");
		
		List<String> li = new ArrayList<String>();
		
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, c);
		
		r.generateReports();
		
	}
}
