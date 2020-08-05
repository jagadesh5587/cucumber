package com.pojo;

import java.util.HashSet;
import java.util.Set;

public class Employee {                      
	public static void main(String[] args) {
		Pojo p = new Pojo();
		p.setEmpAge(36);
		System.out.println(p.getEmpAge());
		p.setEmpName("gopal");
		System.out.println(p.getEmpName());
		Pojo p1 = new Pojo();
		p1.setEmpName("lakshmi");
		System.out.println(p1.getEmpName());
		p1.setEmpAge(30);
		System.out.println(p1.getEmpAge());
		Set<Pojo> setEntry = new HashSet<Pojo>();
		for (Pojo pojo : setEntry) {
			System.out.println(pojo);
		}
	}
}
