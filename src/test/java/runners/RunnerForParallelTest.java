package runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.DriverClass;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"step_definitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class RunnerForParallelTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters(value = "browser")
    public void beforeClass(String browserName){
        DriverClass.setThreadDriverName(browserName);
    }
    @AfterClass
    public static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("Windows User Name",System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone",System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("User Name","Team7");
        ExtentService.getInstance().setSystemInfo("Application Name","Enuygun.com");
        ExtentService.getInstance().setSystemInfo("Operating System Info",System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department","QA");


    }
}
