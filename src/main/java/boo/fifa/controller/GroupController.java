
package boo.fifa.controller;

import boo.fifa.entity.Group;
import boo.fifa.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fifa")
public class GroupController {

	@Autowired
	private GroupService groupService;

	// create
	@Transactional
	@RequestMapping(value = "/group", method = RequestMethod.POST)
	public ResponseEntity<String> addGroup(@RequestBody Group group) {
	    return new ResponseEntity<String>("hello", HttpStatus.OK);
	}

	// read
	@Transactional
	@RequestMapping(value = "/group/{groupCh}", method = RequestMethod.GET)
	public ResponseEntity<String> getGroup(@PathVariable("groupCh") char groupCh) {
		return new ResponseEntity<String>("hello", HttpStatus.OK);
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

