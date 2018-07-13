
package boo.fifa.controller;

import boo.fifa.entity.Group;
import boo.fifa.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class GroupController {

	@Autowired
	private GroupService groupService;

	// create
	@Transactional
	@RequestMapping(value = "/group", method = RequestMethod.POST)
	public ResponseEntity<Group> addGroup(@RequestBody Group group) {
	    return null;
	}

	// read
	@Transactional
	@RequestMapping(value = "/group/{groupCh}", method = RequestMethod.GET)
	public ResponseEntity<Group> getGroup(@PathVariable("groupCh") char groupCh) {
		return new ResponseEntity<Group>(groupService.getGroup(groupCh), HttpStatus.OK);
	}

	// update
	@Transactional
	@RequestMapping(value = "/group", method = RequestMethod.PUT)
	public ResponseEntity<Group> updateGroup(@RequestBody Group group) {
		return null;
	}

	// delete
	@Transactional
	@RequestMapping(value = "/group/{groupCh}", method = RequestMethod.DELETE)
	public ResponseEntity<Group> deleteGroup(@PathVariable("groupCh") char groupCh) {
	    return null;
	}
}

