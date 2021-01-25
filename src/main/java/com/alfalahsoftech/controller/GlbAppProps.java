package com.alfalahsoftech.controller;

import java.io.IOException;
import java.util.Properties;

public class GlbAppProps {
	public static void main(String[] args) {
		Properties p =new Properties();
		try {
			p.load(GlbAppProps.class.getClassLoader().getResourceAsStream("glbApp.properties"));
			System.out.println(p.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
