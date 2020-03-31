package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadToMap {
	
	public Map<String,List<String>> ReadToMap(String filePath) {
		Map<String,List<String>> map = new HashMap<String, List<String>>();
		List<String> elelist = new ArrayList<String>();
		try {
			//创建FileReader对象用来读取字符流
			FileReader fr = new FileReader(filePath);
			//缓冲指定文件的输入
			BufferedReader br = new BufferedReader(fr);
			
			String strLine;
			try {
				while(null!=(strLine=(br.readLine()))) {
					elelist.add(strLine);	
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				try {
					br.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();
			}
			for(int i = 0;i<elelist.size();i++) {
				String key = elelist.get(i).split(">")[0];
				List<String> list = new ArrayList<String>();
				list.add(elelist.get(i).split(">")[1]);
				list.add(elelist.get(i).split(">")[2]);
				map.put(key, list);
				
			}
			
			
//			elelist.add(0,strLine.split(">")[1]);
//			elelist.add(1,strLine.split(">")[2]);
//			
//			System.out.print(strLine);

//			m.put(strLine.split(">")[0],elelist);
			System.out.println(map.get("user"));
			System.out.println(map.get("password"));
			System.out.println(map.get("loginbutton"));
			
			return map;
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	public static void main(String[] args) {
		ReadToMap g = new ReadToMap();
		System.out.println(g.ReadToMap("/Users/jiubugaosuni/Downloads/Git/autotest/autotest/loginPage.txt").get("user"));
	}
	
}
