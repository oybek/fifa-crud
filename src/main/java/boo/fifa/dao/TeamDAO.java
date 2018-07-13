
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
	}

	public Team getTeam(String country) {
		return null;
	}

	public void updateTeam(Team team) {
	}

	public void deleteTeam(String country) {
	}
}

