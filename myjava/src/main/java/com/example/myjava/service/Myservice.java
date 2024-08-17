package com.example.myjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myjava.model.PasswordChange;
import com.example.myjava.repo.Mrepo;

@Service
public class Myservice {

	private final Mrepo myrepo;
	
	@Autowired
	public Myservice(Mrepo myrepo)
	{
		this.myrepo = myrepo;
	}
	
	public PasswordChange savedoc(PasswordChange pc)
	{
		return myrepo.save(pc);
	}
}
