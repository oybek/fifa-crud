
package boo.fifa.controller;

@Controller
public class TeamController {

	@Autowired
	private TeamService teamService;

	// create
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/team", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Team createTeam(@RequestBody Team team) {
		return teamService.createTeam(team);
	}

	// read
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/team/{country}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Team getTeam(@PathVariable("country") String country) {
		return teamService.getTeam(country);
	}

	// update
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/team", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Team updateTeam(@RequestBody Team team) {
		return teamService.updateTeam(team);
	}

	// delete
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/team/{country}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void deleteTeam(@PathVariable("country") String country) {
		return teamService.deleteTeam(country);
	}
}

