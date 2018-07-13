
package boo.fifa.controller;

import boo.fifa.entity.Team;
import boo.fifa.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;

	// create
	@Transactional
	@RequestMapping(value = "/team", method = RequestMethod.POST)
	public ResponseEntity<Team> addTeam(@RequestBody Team team) {
	    return null;
	}

	// read
	@Transactional
	@RequestMapping(value = "/team/{country}", method = RequestMethod.GET)
	public ResponseEntity<Team> getTeam(@PathVariable("country") String country) {
	    return null;
	}

	// update
	@Transactional
	@RequestMapping(value = "/team", method = RequestMethod.PUT)
	public ResponseEntity<Team> updateTeam(@RequestBody Team team) {
	    return null;
	}

	// delete
	@Transactional
	@RequestMapping(value = "/team/{country}", method = RequestMethod.DELETE)
	public ResponseEntity<Team> deleteTeam(@PathVariable("country") String country) {
	    return null;
	}
}

