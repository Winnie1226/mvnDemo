package com.my.surefireDemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test1.class, Test2.class, Test3.class, seleniumDemo.class })
public class AllTests {

}
