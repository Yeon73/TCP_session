package com.tcpsession.tcpsession.service;

import com.tcpsession.tcpsession.repository.Community;
import com.tcpsession.tcpsession.repository.CommunityRepository;
import com.tcpsession.tcpsession.repository.dto.CommunityDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommunityService {

    private final CommunityRepository communityRepository;


    public Community getCommunityInfo(Long id) {
        return communityRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Long saveInfo(Community community) {

        return communityRepository.save(community).getId();
    }
}
