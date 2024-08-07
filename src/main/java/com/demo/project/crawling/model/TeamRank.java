package com.demo.project.crawling.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class TeamRank {
    private int rank;
    @Id
    private String teamName;
    private int games;
    private int wins;
    private int losses;
    private int draws;
    private double winRate;
    private double winningMargin;
    private String continuity;
}