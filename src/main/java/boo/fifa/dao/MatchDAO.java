
package boo.fifa.dao;

import boo.fifa.entity.Match;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MatchDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
	    return this.sessionFactory.getCurrentSession();
	}

	public void createMatch(Match match) {
	}

	public Match getMatch(String country1, String country2) {
		return null;
	}

	public void updateMatch(Match match) {
	}

	public void deleteMatch(String country1, String country2) {
	}
}

