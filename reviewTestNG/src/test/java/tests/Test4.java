package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {

    @BeforeClass
    public void beforeMethod(){
        System.out.println("I will start first from this class");
    }

    @Parameters({"URL","APIKey/username"})
    @Test
    public void web1(String urlName , String key){
        System.out.println("I am the web1 method");
        System.out.println(urlName+"\n"+key);
    }

    @Test(groups = {"Smoke"})
    public void mobile1(){
        System.out.println("I am the mobile1 method");
    }

    @Test
    public void api1(){
        System.out.println("I am the api1 method");
    }

    @Test(dependsOnMethods = {"web1","api1"})
    public void web2(){
        System.out.println("I am the web2 method");
    }

    @Test(enabled = false)
    public void mobile2(){
        System.out.println("I am the mobile2 method");
    }

    @Test(timeOut = 4000)
    public void api2(){
        System.out.println("I am the api2 method");
    }


}
