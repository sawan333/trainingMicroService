package com.example.library.subscription.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="subscription")
public class Subscription {

	@Id
	@GeneratedValue
	private Integer book_id;
	private String subscriber_name;
	private String date_subscribed;
	private String date_returned;
	
	public Subscription() {
		
	}

	public Integer getBook_id() {
		return book_id;
	}

	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

	public String getSubscriber_name() {
		return subscriber_name;
	}

	public void setSubscriber_name(String subscriber_name) {
		this.subscriber_name = subscriber_name;
	}

	public String getDate_subscribed() {
		return date_subscribed;
	}

	public void setDate_subscribed(String date_subscribed) {
		this.date_subscribed = date_subscribed;
	}

	public String getDate_returned() {
		return date_returned;
	}

	public void setDate_returned(String date_returned) {
		this.date_returned = date_returned;
	}
		
}
