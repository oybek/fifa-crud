
package boo.fifa.dao;

import boo.fifa.entity.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TeamDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
	    return this.sessionFactory.getCurrentSession();
	}

	public void createTeam(Team team) {
		getCurrentSession().save(team);
	}

	public Team getTeam(String country) {
		return getCurrentSession().get(Team.class, country);
	}

	public void updateTeam(Team team) {
	    getCurrentSession().update(team);
	}

	public void deleteTeam(String country) {
		Team team = getCurrentSession().load(Team.class, country);
		getCurrentSession().delete(team);
	}
}

