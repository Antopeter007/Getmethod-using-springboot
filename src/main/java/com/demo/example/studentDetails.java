package com.demo.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentDetails {
	@RequestMapping("/studentsDetails")
	public List<StudentsList> StudentsDetials() {
		ArrayList<StudentsList> stud = new ArrayList<>();
		StudentsList s = new StudentsList(1, "Anto Peter", 7092, "PAHSS");
		StudentsList s1 = new StudentsList(2, "Arun Smith", 6359, "PAHSS");
		stud.add(s);
		stud.add(s1);
		return stud;
	}

	@RequestMapping("/overallPercentage")
	public static int percentage() {
		int a = 10, b = 70, c = 90, d = 40, e;
		e = (a + b + c + d / 4) * 100;
		return e;

	}
}
