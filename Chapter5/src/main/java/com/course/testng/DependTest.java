package com.course.testng;

import org.testng.annotations.Test;

/**
 * testNG的依赖测试演练， test2方法依赖test1方法
 * test1方法如果执行失败，则test2不会执行
 * 比如你要购买东西，必须要先依赖登录，那如果登录失败了，购买用例也就不用执行测试了
 */

public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run!");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("test2 run!");
    }
}
