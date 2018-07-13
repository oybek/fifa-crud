
package boo.fifa.controller;

import boo.fifa.entity.Match;
import boo.fifa.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Controller
public class MatchController {

	@Autowired
	private MatchService matchService;

	// create
	@Transactional
	@RequestMapping(value = "/match", method = RequestMethod.POST)
	public ResponseEntity<Match> addMatch(@RequestBody Match match) {
	    return null;
	}

	// read
	@Transactional
	@RequestMapping(value = "/match/{country1}/{country2}", method = RequestMethod.GET)
	public ResponseEntity<Match> getMatch(@PathVariable("country1") String country1, @PathVariable("country2") String country2) {
	    return null;
	}

	// update
	@Transactional
	@RequestMapping(value = "/match", method = RequestMethod.PUT)
	public ResponseEntity<Match> updateMatch(@RequestBody Match match) {
	    return null;
	}

	// delete
	@Transactional
	@RequestMapping(value = "/match/{country1}/{country2}", method = RequestMethod.DELETE)
	public ResponseEntity<Match> deleteMatch(@PathVariable("country1") String country1, @PathVariable("country2") String country2) {
	    return null;
	}
}

