
package boo.fifa.controller;

@Controller
public class MatchController {

	@Autowired
	private MatchService matchService;

	// create
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/match", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Match createMatch(@RequestBody Match match) {
		return matchService.createMatch(match);
	}

	// read
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/match/{country1}/{country2}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Match getMatch(@PathVariable("country1") String country1, @PathVariable("country2") String country2) {
		return matchService.getMatch(country1, country2);
	}

	// update
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/match", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Match updateMatch(@RequestBody Match match) {
		return matchService.updateMatch(match);
	}

	// delete
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/match/{country1}/{country2}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void deleteMatch(@PathVariable("country1") String country1, @PathVariable("country2") String country2) {
		matchService.deleteMatch(country1, country2);
	}
}

