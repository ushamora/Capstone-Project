package com.wipro.usha.service;

import com.wipro.usha.dto.FeedBackDTO;

public interface FeedBackService {

	FeedBackDTO submitFeedback(FeedBackDTO feedbackDTO);

	FeedBackDTO getFeedbackById(Long id);

	FeedBackDTO updateStatus(Long id, String status);

}
