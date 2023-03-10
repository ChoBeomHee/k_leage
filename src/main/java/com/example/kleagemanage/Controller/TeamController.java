package com.example.kleagemanage.Controller;
import com.example.kleagemanage.Service.TeamService;
import com.example.kleagemanage.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping("/")
    public String test(){
        return "정상";
    }

    @GetMapping("/user/")
    public List<Team> teamInfo() {
       return teamService.getTeams();
    }

    @GetMapping("/team/{teamname}")
    public Team eachTeam(@PathVariable String teamname){
        return teamService.geteachTeam(teamname);
    }

    @PutMapping("/update/{teamname}")
    public void updateteam(@PathVariable String teamname, @RequestBody Team team){
        System.out.println("업데이트 로그");
        teamService.updateRanking(teamname, team);
    }
}
