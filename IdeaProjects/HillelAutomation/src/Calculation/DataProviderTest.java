package Calculation;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import Calculation.ExcelUtils;
import org.testng.annotations.Test;


/**
 * Created by nsokh on 5/31/16.
 */

public class DataProviderTest {

    @DataProvider(name = "Addition", parallel = false)

    public  Object[][] credentials() throws Exception {
        Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Грам\\IdeaProjects\\HillelAutomation\\src\\Calculation\\dataTest\\TestData.xlsx","Add" );
        return  testObjArray;

        /*return new Object[][] { {2, 2 ,4},{3, 2 ,5}, {2, 3 ,5}, {3, 3 ,6}, {3, 4 ,7}, {2, 2 ,4}, {2, 2 ,4}, {2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4}};
*/
    }

    @Test(dataProvider = "Addition" )

    public void testAdd(Double a, Double b, Double c) throws InterruptedException {

        Double actualResult = a + b;
        Double expectedResult = c;
        Assert.assertEquals(actualResult, expectedResult, "Addition method failed");
        Thread.sleep(25);
    }
    @DataProvider(name = "Substraction", parallel = false)

    public  Object[][] Sub() throws Exception {
        Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Грам\\IdeaProjects\\HillelAutomation\\src\\Calculation\\dataTest\\TestData.xlsx", "Sub");
        return testObjArray;
    }
    @Test(dataProvider = "Substraction")
    public void testSub(Double a, Double b, Double c) throws InterruptedException{
        Double actualResult = a - b;
        Double expectedResult = c;
        Assert.assertEquals(actualResult, expectedResult, "Substraction method failed");
        Thread.sleep(25);
    }
    @DataProvider(name = "Division", parallel = false)

    public  Object[][] Div() throws Exception {
        Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Грам\\IdeaProjects\\HillelAutomation\\src\\Calculation\\dataTest\\TestData.xlsx", "Div");
        return testObjArray;
    }
    @Test(dataProvider = "Division")
    public void testDiv(Double a, Double b, Double c) throws InterruptedException{
        Double actualResult = a / b;
        Double expectedResult = c;
        Assert.assertEquals(actualResult, expectedResult, "Substraction method failed");
        Thread.sleep(25);
    }
    @DataProvider(name = "Multiplication", parallel = false)

    public  Object[][] Mult() throws Exception {
        Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Грам\\IdeaProjects\\HillelAutomation\\src\\Calculation\\dataTest\\TestData.xlsx", "Mult");
        return testObjArray;
    }
    @Test(dataProvider = "Multiplication")
    public void testMult(Double a, Double b, Double c) throws InterruptedException{
        Double actualResult = a * b;
        Double expectedResult = c;
        Assert.assertEquals(actualResult, expectedResult, "Substraction method failed");
        Thread.sleep(25);
    }
}