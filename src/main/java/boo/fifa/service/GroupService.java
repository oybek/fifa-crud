
package boo.fifa.service;

import boo.fifa.entity.Group;

public interface GroupService {

	public void addGroup(Group group);
	public Group getGroup(char ch);
	public void updateGroup(Group group);
	public void deleteGroup(char ch);
}

