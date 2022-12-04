package com.example.library.subscription.jpa;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.library.subscription.model.Subscription;

@Repository
public interface SubcriptionRepository extends JpaRepositoryImplementation<Subscription, Integer> {

}
