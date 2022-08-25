package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
//Uncomment each one separately to Run Single test below

  @SuiteClasses({TC1_SearchTest.class})
//@SuiteClasses({TC2_SearchTest.class})
//@SuiteClasses({TC3_DataDrivenTest.class})
//@SuiteClasses({TC4_SignInTest.class})
//@SuiteClasses({TC5_ShoppingCartTest.class})
 // @SuiteClasses({TC6_GenericTest.class})

// Uncomment to Run All Tests below

//@SuiteClasses({TC1_SearchTest.class,TC2_SearchTest.class,TC3_DataDrivenTest.class,TC4_SignInTest.class,TC5_ShoppingCartTest.class,TC6_GenericTest.class})
public class RunJunitTestSuite {

}
