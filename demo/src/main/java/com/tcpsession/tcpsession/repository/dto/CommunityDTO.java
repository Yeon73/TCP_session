package com.tcpsession.tcpsession.repository.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommunityDTO {
    private String title;
    private String content;
}
