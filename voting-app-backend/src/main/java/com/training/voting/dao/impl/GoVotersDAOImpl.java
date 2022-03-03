package com.training.voting.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.training.voting.dao.GoVotersDAO;
import com.training.voting.model.GoVoters;

@Repository(value = "goVotersDAO")
@Transactional
public class GoVotersDAOImpl implements GoVotersDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public GoVoters saveVoter(GoVoters voters) {
		sessionFactory.getCurrentSession().save(voters);
		return voters;
	}

}
