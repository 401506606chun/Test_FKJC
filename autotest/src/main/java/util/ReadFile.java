package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public List<String> readFile(String filePath){
        List<String> targetList = new ArrayList<String>();
        String strLine = null;
        int lineCount = 1;
        try {
            File file = new File(filePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (null != (strLine = bufferedReader.readLine())) {
//                System.out.println("第" + lineCount + "行数据:" + strLine);
                lineCount++;
                targetList.add(strLine);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(targetList);
        return targetList;
        

    }
    public static void main(String[] args) {
    	ReadFile rf =  new ReadFile();
    	rf.readFile("/Users/jiubugaosuni/Downloads/Git/autotest/autotest/loginPage.txt");
    }
}
