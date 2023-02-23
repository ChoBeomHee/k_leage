package com.example.kleagemanage.Service;

import com.example.kleagemanage.Repository.TeamRepository;
import com.example.kleagemanage.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;
    @Transactional
    public String updateRanking(String teamname, Team updateteam){
        System.out.println("서비스 업데이트 로그");
        Team team = teamRepository.findByTeamname(teamname).orElseThrow(()->{
            return new IllegalArgumentException("실패!");
        });
        System.out.println("서비스 업데이트 로그2");

        team.setRanking(updateteam.getRanking());
        team.setWin(updateteam.getWin());
        team.setLoss(updateteam.getLoss());
        team.setPoint(updateteam.getPoint());
        team.setGamenumber(updateteam.getGamenumber());
        team.setCountpoint(updateteam.getCountpoint());
        team.setDifferenceingain(updateteam.getDifferenceingain());
        team.setDraw(updateteam.getDraw());

        return "성공";
    }

    @Transactional
    public Team geteachTeam(String teamname){
        Team team = teamRepository.findByTeamname(teamname).get();

        return team;
    }
    @Transactional
    public List<Team> getTeams() {
        List<Team> teams = teamRepository.findAll();
        System.out.println("Getlog");
        Collections.sort(teams, new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                return o1.getRanking() - o2.getRanking();
            }
        });
        return teams;
    }
}
