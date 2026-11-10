package com.paras.restaurant.mappers;

import com.paras.restaurant.domain.dtos.OwnerRequestDto;
import com.paras.restaurant.domain.entities.OwnerRequest;
import com.paras.restaurant.domain.entities.OwnerRequestStatus;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-11-08T09:56:56+0530",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.2 (Oracle Corporation)"
)
@Component
public class OwnerRequestMapperImpl implements OwnerRequestMapper {

    @Override
    public OwnerRequestDto toDto(OwnerRequest request) {
        if ( request == null ) {
            return null;
        }

        String id = null;
        String username = null;
        String email = null;
        String message = null;
        OwnerRequestStatus status = null;
        LocalDateTime createdAt = null;
        String reviewedBy = null;
        LocalDateTime reviewedAt = null;
        String rejectionReason = null;

        id = request.getId();
        username = request.getUsername();
        email = request.getEmail();
        message = request.getMessage();
        status = request.getStatus();
        createdAt = request.getCreatedAt();
        reviewedBy = request.getReviewedBy();
        reviewedAt = request.getReviewedAt();
        rejectionReason = request.getRejectionReason();

        OwnerRequestDto ownerRequestDto = new OwnerRequestDto( id, username, email, message, status, createdAt, reviewedBy, reviewedAt, rejectionReason );

        return ownerRequestDto;
    }
}
