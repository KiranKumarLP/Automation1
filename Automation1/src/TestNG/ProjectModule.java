package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test
	public void createproject() {
		Reporter.log("createProject",true);
	}
	
	@Test
	public void modifyProject() {
		Reporter.log("modifyProject",true);
	}
	
	@Test
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}
}
