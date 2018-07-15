
package boo.fifa.dao;

import boo.fifa.entity.Match;
import boo.fifa.entity.TeamPair;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MatchDAO {

	@Autowired
	private TeamDAO teamDAO;

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
	    return this.sessionFactory.getCurrentSession();
	}

	public void createMatch(Match match) {
		getCurrentSession().save(match);
	}

	public Match getMatch(String country1, String country2) {
		return getCurrentSession().get(Match.class
				, new TeamPair(teamDAO.getTeam(country1), teamDAO.getTeam(country2)));
	}

	public void updateMatch(Match match) {
	    getCurrentSession().update(match);
	}

	public void deleteMatch(String country1, String country2) {
		Match match = getCurrentSession().load(Match.class
				, new TeamPair(teamDAO.getTeam(country1), teamDAO.getTeam(country2)));
		getCurrentSession().delete(match);
	}
}

