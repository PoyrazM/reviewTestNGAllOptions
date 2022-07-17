package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void demo(){
        System.out.println("I am the demo method");

    }
    @Test(groups = {"Smoke"})
    public void secondTest(){
        System.out.println("ı am the secondTest method");
        Assert.assertTrue(false);
    }

    @Test(dataProvider = "getData")
    public void signUp(String username , String password){
        System.out.println("Sıgn Up Test");
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];
        // First combination - username password - good credit history = row
        data[0][0] = "firstSetUsername";
        data[0][1] = "firstPassword";
        // Second combination
        data[1][0] = "secondSetUsername";
        data[1][1] = "secondPassword";
        // Third combination
        data[2][0] = "thirdSetUsername";
        data[2][1] = "thirdPassword";

        return data;
    }

    @AfterTest
    public void lastMethodInTest(){
        System.out.println("I will execute lastly for test");
    }
}
