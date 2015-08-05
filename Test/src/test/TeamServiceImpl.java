package test;

import java.util.List;

public class TeamServiceImpl implements TeamService {

	private TeamDAO teamDAO;

	public void addTeam(Team team) {
		teamDAO.addTeam(team);		
	}

	public void updateTeam(Team team) {
		teamDAO.updateTeam(team);
	}

	public Team getTeam(int id) {
		return teamDAO.getTeam(id);
	}

	public void deleteTeam(int id) {
		teamDAO.deleteTeam(id);
	}

	public List

          getTeams() {
		return teamDAO.getTeams();
	}
	public static void main(String... strings)
	{
		Team team=new Team();
		team.setId(1);
		team.setName("india");
		team.setRating(1);
		Team team1=new Team();
		team1.setId(2);
		team1.setName("pak");
		team1.setRating(2);
		TeamServiceImpl tsi=new TeamServiceImpl();
		tsi.addTeam(team);
		System.out.println(tsi.getTeam(1));
	}
}