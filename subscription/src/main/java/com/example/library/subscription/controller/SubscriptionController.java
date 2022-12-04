package com.example.library.subscription.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.library.subscription.jpa.SubcriptionRepository;
import com.example.library.subscription.model.Subscription;
import com.example.library.subscription.service.SubscriptionService;

@RestController
@RequestMapping("/library")
public class SubscriptionController {

	@Autowired
	private SubscriptionService subscriptionService;

	@Autowired
	private SubcriptionRepository subcriptionRepository;

	@GetMapping("/subscription")
	public List<Subscription> getBookList() {
		return subscriptionService.findAll();
	}

	// get Book details
	@GetMapping("/getBook")
	public Subscription getBook() {

		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Subscription> response = restTemplate.getForEntity("http://localhost:2020/library/book", Subscription.class);
		System.out.println("calling from response: "+response.toString());
		Subscription book= response.getBody();
		//System.out.println("calling from status code: "+response.getStatusCode());
		//System.out.println("calling from response: "+book);
		return book;
	}

	// create subscription
	@PostMapping("/subscription")
	public void saveSubscriber(@RequestBody Subscription subscriber) {
		subcriptionRepository.save(subscriber);
	}
}
