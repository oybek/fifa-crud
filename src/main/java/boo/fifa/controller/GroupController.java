
package boo.fifa.controller;

@Controller
public class GroupController {

	@Autowired
	private GroupService groupService;

	// create
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/group", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Group createGroup(@RequestBody Group group) {
		return groupService.createGroup(group);
	}

	// read
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/group/{groupCh}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Group getGroup(@PathVariable("groupCh") char groupCh) {
		return groupService.getGroup(groupCh);
	}

	// update
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/group", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Group updateGroup(@RequestBody Group group) {
		return groupService.updateGroup(group);
	}

	// delete
	@ResponseBody
	@Transactional
	@RequestMapping(value = "/group/{groupCh}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void deleteGroup(@PathVariable("groupCh") char groupCh) {
		groupService.deleteGroup(group);
	}
}

