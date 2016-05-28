package Calculation;

import Calculation.Calculation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Created by Грам on 25.05.2016.
 */

public class CalcTest {
    Calculation calc2 = new Calculation();

    @BeforeMethod
    public void precondition() {
        System.out.println("Precondition ");

    }

    @Test(description = "Check the Set - method", enabled = true)

    public void checkSet() {
        System.out.println("Set method");
        Calculation calc1 = new Calculation();
        double check = 2.5;
        calc1.setNumber1(check);
        double rez = calc1.getNumber1();

        Assert.assertTrue(rez == check, "Set method does not work");
    }

    @BeforeMethod
    public void precondition1() {
        System.out.println("Precondition1 ");
    }


    @Test
    public void checkAdd() {
        System.out.println("Add method");
        double check = calc2.add(2.0, 2.0);

        Assert.assertTrue(check == 4, "Add does not work");
    }

    @Test
    public void checkArAdd() {
        System.out.println("check Add with Arrey ");
        double i;
        for (i = 0; i <= 50; i++) {
            double checkAr = calc2.add(i, 0.0);
            Assert.assertTrue(checkAr == i);
            //System.out.println("checkAr= " + checkAr + " " + "i= " + i);
        }
    }
    @Test
    public void doubleAr(){
      double j;
        double g;
        for(j=0,g=50; j<=50; j++,g--){
            double checkDouble=calc2.add(j,g);
            //System.out.println(j+" "+g);
            Assert.assertTrue(checkDouble==50, "Wrong in adding method");
        }
    }


}


