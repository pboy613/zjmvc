/**
 * 
 */
package zjmvc.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zjmvc.entity.User;
import zjmvc.service.UserService;

/**
 * @author jun
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource()
	private UserService userService;

	@RequestMapping("/selectUser")
	public void selectUser() {
		System.out.println("selectUser");
	}

	@RequestMapping("/getUser")
	public void insertUser() {
		System.out.println("getUser");
	}

	@RequestMapping("/login")
	public String login() {
		List<User> users = userService.selectList("zjmvc.service.userdao.get", 1l);
		System.out.println("welcome to china11:" + users.size());
		return "permission/userList";
	}
}
