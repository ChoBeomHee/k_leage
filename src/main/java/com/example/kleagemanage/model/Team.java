package com.example.kleagemanage.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
    private int id;

    @Column
    private String teamname;

    @Column
    private int point;

    @Column
    private int ranking;

    @Column
    private int gamenumber;

    @Column
    private int win;

    @Column
    private int loss;

    @Column
    private int draw;

    @Column
    private int countpoint;

    @Column
    private int differenceingain;
}
