package com.wipro.usha.service;

import com.wipro.usha.dto.AuditDTO;

public interface AuditService {

	AuditDTO createAudit(AuditDTO auditDTO);

	AuditDTO getAuditById(Long id);

}
