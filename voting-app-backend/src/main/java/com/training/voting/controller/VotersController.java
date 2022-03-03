package com.training.voting.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.voting.dao.GoVotersDAO;
import com.training.voting.model.GoVoters;

public class VotersController {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.training.voting");
		context.refresh();
		GoVotersDAO dao = (GoVotersDAO) context.getBean("goVotersDAO");

		GoVoters voters = new GoVoters("Amit", 21, "Mr Ram", "Male", 1234567890123456L, "amit@abc.com", 8790896511L);

		dao.saveVoter(voters);
		System.out.println("Inserted Successfully!");

	}

}
