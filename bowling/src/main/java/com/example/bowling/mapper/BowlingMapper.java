package com.example.bowling.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.bowling.vo.Game;
import com.example.bowling.vo.GamePlayer;
import com.example.bowling.vo.GameResult;
import com.example.bowling.vo.Referee;
import com.example.bowling.vo.Team;
import com.example.bowling.vo.TeamPlayerName;

@Mapper
public interface BowlingMapper {
	// addReport 팀 목록을 셀렉트박스에 불러오는 mapper
	public List<Team> selectTeam();
	// addReport 팀에 속한 선수 명단을 불러오는 mapper
	public List<TeamPlayerName> selectTeamPlayer(Team team);
	// addReport 홈팀을 제외한 팀 목록을 셀렉트박스에 불러오는 mapper
	public List<Team> selectAwayTeam(Team team);
	// addReport 게임테이블에 경기를 기록하는 mapper
	public int insertGame(Game game);
	// addReport 홈팀의 구장을 가져오기위한 mapper
	public Team selectStadium(Team team);
	// addReport 선수의 회차마다의 기록을 저장하기 위한 mapper
	public int insertGamePlayer(GamePlayer gamePlayer);
	// addReport addReport game_player insert 후에 index값 받아오는 mapper
	public Game maxGameNo(Game game);
	// addReport game_result 테이블에 경기 결과를 계산하는 mapper
	public GameResult selectGameResult (GamePlayer gamePlayer);
	// addReport game_result 테이블에 경기 결과를 저장하는 mapper
	public int insertGameResult (GameResult gameResult);
	// addReport 심판의 목록을 가져오기위한 mapper
	public List<Referee> selectReferee();
	// addReport 게임이 시작하면 심판의 목록을 입력하기 위한 mapper
	public int insertReferee(Referee referee);

	
}