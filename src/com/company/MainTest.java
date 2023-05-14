package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {
        System.out.println("main函数");
        File x=new File("C:\\Users\\71878\\Calculator\\15158630593");
        Boolean y=x.exists();
        String s1=String.valueOf(y);
        Assert.assertEquals("true",s1);
    }

    @Test
    public void makeFormula() {
        System.out.println("makeFormula测试");
        Assert.assertNotNull(Main.MakeFormula());
    }

    @Test
    public void solve() {
        System.out.println("solve测试");
        Assert.assertNotNull(Main.Solve(Main.MakeFormula()));
    }
}