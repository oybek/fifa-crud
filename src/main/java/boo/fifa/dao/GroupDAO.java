
package boo.fifa.dao;

import boo.fifa.entity.Group;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GroupDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
	    return this.sessionFactory.getCurrentSession();
	}

	public void createGroup(Group group) {
	}

	public Group getGroup(char ch) {
		return null;
	}

	public void updateGroup(Group group) {
	}

	public void deleteGroup(char ch) {
	}
}

