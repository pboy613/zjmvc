/**
 * 
 */
package zjmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zjmvc.service.UserService;

/**
 * @author ju   n
 *
 */
@Controller("/user")
public class UserController {

	@Autowired
	public UserService userService;

	@RequestMapping("/selectUser")
	public void selectUser() {

	}

	@RequestMapping("/getUser")
	public void insertUser() {

	}
}
