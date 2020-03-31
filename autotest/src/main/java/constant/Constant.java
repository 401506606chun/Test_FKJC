package constant;

import java.util.List;
import java.util.Map;

import util.ReadToMap;

public class Constant {
	static ReadToMap map = new ReadToMap();
	//测试地址
    public static String loginUrl = "http://test-fintech.sinoiov.com/jrpt-fkjc-test";
    public static String loginFilePath ="/Users/jiubugaosuni/Downloads/Git/autotest/autotest/loginPage.txt";
    public static Map<String,List<String>> loginElement = map.ReadToMap(loginFilePath);
}
