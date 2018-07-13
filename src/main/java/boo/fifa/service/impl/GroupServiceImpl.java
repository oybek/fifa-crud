
package boo.fifa.service.impl;

import java.util.List;
import java.util.ArrayList;

import boo.fifa.entity.Group;

import boo.fifa.service.GroupService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("groupService")
@Transactional
public class GroupServiceImpl implements GroupService {

	private static final List<Group> groups;

	static {
		groups = populateGroups();
	}

	public void addGroup(Group group) {
		groups.add(group);
	}

	public Group getGroup(char ch) {
		for (Group group : groups) {
			if (group.getCh() == ch) {
				return group;
			}
		}
		return null;
	}

	public void updateGroup(Group group) {
	}

	public void deleteGroup(char ch) {
	}

	private static List<Group> populateGroups() {
		List<Group> groups = new ArrayList<Group>();
		for (char c = 'A'; c <= 'H'; ++c)
			groups.add(new Group(c));
		return groups;
	}
}

