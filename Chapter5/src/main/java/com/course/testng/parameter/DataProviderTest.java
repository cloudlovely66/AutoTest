package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name="+name+","+"age=" +age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] objects=new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return objects;
    }

}
