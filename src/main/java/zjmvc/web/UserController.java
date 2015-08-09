/**
 * 
 */
package zjmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zjmvc.service.UserService;

/**
 * @author ju n
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserService userService;

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
		System.out.println("welcome to china11");
		return "permission/userList";
	}
}
