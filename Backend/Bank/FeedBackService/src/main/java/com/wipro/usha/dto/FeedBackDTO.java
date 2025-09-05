package com.wipro.usha.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FeedBackDTO {
    private Long id;
    private Long customerId; // who is giving feedback/complaint
    private String type;     // COMPLAINT or FEEDBACK
    private String message;  
    private LocalDateTime submittedAt;
    private String status;   // e.g. OPEN, RESOLVED
}
