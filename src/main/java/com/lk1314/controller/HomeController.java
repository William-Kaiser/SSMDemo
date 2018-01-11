package com.lk1314.controller;

import com.lk1314.core.BaseController;
import com.lk1314.entity.User;
import com.lk1314.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * @author liankai
 */

@Controller
public class HomeController {

    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String loginForm(Model model){
        model.addAttribute("user", new User());
        return "/login";
    }

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(User user, RedirectAttributes redirectAttributes){
        try {
            //使用权限工具进行用户登录，登录成功后跳到shiro配置的successUrl中
            SecurityUtils.getSubject().login(new UsernamePasswordToken(user.getUserName(), user.getPassword()));
            return "redirect:/user/userInfo/1";
        } catch (AuthenticationException e) {
            redirectAttributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/login";
        }
    }

    @RequestMapping(value="/logout",method=RequestMethod.GET)
    public String logout(RedirectAttributes redirectAttributes ){
        //使用权限管理工具进行用户的退出，跳出登录，给出提示信息
        SecurityUtils.getSubject().logout();
        redirectAttributes.addFlashAttribute("message", "您已安全退出");
        return "redirect:/login";
    }

    @RequestMapping("/404")
    public String unauthorizedRole(){
        return "/404";
    }
}
