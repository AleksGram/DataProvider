package Calculation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import Calculation.ExcelUtils;
import org.testng.annotations.Test;


/**
 * Created by nsokh on 5/31/16.
 */

public class DataProviderTest {

    @DataProvider(name = "Addition", parallel = false)

    public  Object[][] credentials() throws Exception {
        Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\Грам\\IdeaProjects\\HillelAutomation\\src\\Calculation\\dataTest\\TestData.xlsx","Sheet1" );
        return  testObjArray;

        /*return new Object[][] { {2, 2 ,4},{3, 2 ,5}, {2, 3 ,5}, {3, 3 ,6}, {3, 4 ,7}, {2, 2 ,4}, {2, 2 ,4}, {2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4}};
*/
    }

    @Test(dataProvider = "Addition" )

    public void test(double a, double b, double c) throws InterruptedException {

        double actualResult = a + b;
        double expectedResult = c;
        Assert.assertEquals(actualResult, expectedResult, "Addition method failed");
        Thread.sleep(400);
        }

}