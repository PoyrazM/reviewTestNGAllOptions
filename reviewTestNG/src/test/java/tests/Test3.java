package tests;

import org.testng.annotations.*;

public class Test3 {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before executing all methods in Test3 class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I will work before every methods in Test3 class");
    }

    @Parameters({"URL", "APIKey/location" })
    @Test(priority = 1)
    public void firstStep(String url2, String key){
        System.out.println("This is step \t:"+1);
        System.out.println(url2+"\n"+key);
    }

    @Test(priority = 2)
    public void secondStep(){
        System.out.println("This is step \t:"+2);
    }

    @Test(priority = 3,groups = {"Smoke"})
    public void thirdStep(){
        System.out.println("This is step \t:"+3);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I will work after every methods in Test3 class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After executing all methods in Test3 class");
    }


}
