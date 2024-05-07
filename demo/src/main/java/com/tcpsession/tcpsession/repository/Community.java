package com.tcpsession.tcpsession.repository;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name="community")
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "community_id")
    private Long id;

    private String title;
    private String content;
}
