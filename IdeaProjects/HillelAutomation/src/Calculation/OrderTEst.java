package lesson4.Suits;

import org.testng.annotations.Test;


/**
 * Created by nsokh on 5/31/16.
 */
public class OrderTEst {


    @Test(description = "Test to test 1", enabled = true )
    public void test1() throws InterruptedException {
        System.out.println("Test # 1");
        Thread.sleep(1000);
    }

    @Test(description = "Test to test 2", enabled = true)
    public void test2() throws InterruptedException {
        System.out.println("Test # 2");
        Thread.sleep(1000);
    }

    @Test(description = "Test to test 3", enabled = true)
    public void test3() throws InterruptedException {
        System.out.println("Test # 3");
        Thread.sleep(1000);
    }

    @Test(description = "Test to test 4", enabled = true)
    public void test4() throws InterruptedException {
        System.out.println("Test # 4");
        Thread.sleep(1000);
    }

    @Test(description = "Test to test 5", enabled = true)
    public void test5() throws InterruptedException {
        System.out.println("Test # 5");
        Thread.sleep(1000);
    }
}
