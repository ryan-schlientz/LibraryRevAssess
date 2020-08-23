package com.revature.suitetests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import com.revature.modeltests.BookTest;
import com.revature.repotests.BookRepoTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({BookTest.class, BookRepoTest.class})
public class BookSuiteTest {

}
