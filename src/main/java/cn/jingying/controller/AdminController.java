package cn.jingying.controller;

import cn.jingying.common.Const;
import cn.jingying.common.ServerResponse;
import cn.jingying.pojo.Admin;
import cn.jingying.service.IAdminService;
import cn.jingying.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by DonaldY on 2018/5/12.
 */

@Controller
@RequestMapping("/admin/")
public class AdminController {
    
    @Autowired
    private IAdminService iAdminService;
    
    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<Admin> login(String username, String password, HttpSession session){
        ServerResponse<Admin> response = this.iAdminService.login(username,password);
        if(response.isSuccess()){
            Admin admin = response.getData();
            session.setAttribute(Const.CURRENT_USER, admin);
            return response;
        }
        return response;
    }
}
