package com.example.library.subscription.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.subscription.jpa.SubcriptionRepository;
import com.example.library.subscription.model.Subscription;

@Service
public class SubscriptionService {

	@Autowired
	private SubcriptionRepository repository;
	
	//find all books
		public List<Subscription> findAll() {
			return repository.findAll();
		}
}
