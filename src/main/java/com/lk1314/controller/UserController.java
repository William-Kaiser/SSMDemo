package com.lk1314.controller;

import com.lk1314.core.BaseController;
import com.lk1314.entity.User;
import com.lk1314.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author liankai
 */
@Controller
@RequestMapping("/ssm/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/userInfo/{id}", method= RequestMethod.GET)
    public String getUserInfo(@PathVariable("id") String id, Model model) {
        User user =  new User();
        List<User> userList =  userService.findList(user);
        model.addAttribute("user",userList.get(0));
        return "user";
    }

}
