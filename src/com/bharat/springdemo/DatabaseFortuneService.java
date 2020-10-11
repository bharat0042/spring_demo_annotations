package com.bharat.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	
	@Value("${foo.one}")
	private String fone;
	
	@Value("${foo.two}")
	private String ftwo;
	
	@Value("${foo.three}")
	private String fthree;
	
	private String[] fortune= new String[3];
	
	private Random random = new Random();
	
	ArrayList<String> list = new ArrayList<String>();
	
	public void fillStringArrayAndDoSomeOtherStuff() {
		fortune[0] = fone;
		fortune[1] = ftwo;
		fortune[2] = fthree;
		try {
			File theFile = new File("/home/bharat/eclipse-workspace/spring_demo_annotations/src/com/bharat/springdemo/fortune_container.txt");
			System.out.println(">> Reading fortunes from file: " + theFile);
			System.out.println(">> File exists: " + theFile.exists());
			BufferedReader br = new BufferedReader(new FileReader(theFile));
			String tempLine = "";
			while(tempLine != null) {
				tempLine = br.readLine();
				list.add(tempLine);
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println(">> DatabaseFortuneService.fillStringArrayAndDoSomeOtherStuff() exception caught");
		}
	}
	
	@Override
	public String getFortune() {
		System.out.println(">> DatabaseFortuneService: " + list.get(random.nextInt(5)));
		return fortune[random.nextInt(fortune.length)];
	}

}
