package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

    @Test(groups = {"Smoke"})
    public void test2(){
        System.out.println("I am the test2 method");
    }

    @BeforeSuite
    public void prerequisite(){
        System.out.println("I will execute first");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("I will execute lastly everything");
    }

}
