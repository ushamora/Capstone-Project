package com.wipro.usha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.usha.entities.FeedBack;

@Repository
public interface FeedBackRepository extends JpaRepository<FeedBack, Long> {

}
