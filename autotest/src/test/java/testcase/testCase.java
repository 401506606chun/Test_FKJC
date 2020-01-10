package testcase;

import base.driverBase;

public class testCase {
    driverBase base = new driverBase();
    String urlTest = "http://test-fintech.sinoiov.com/jrpt-fkjc-online/index";

    public void testGotoUrl(String url) {
        base.driverInit();
        base.gotoUrl(url);
    }

    public static void main(String args[]) {
        testCase test = new testCase();
        test.testGotoUrl(test.urlTest);
    }

}
