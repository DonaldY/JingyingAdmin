package cn.jingying.service.impl;

import cn.jingying.common.ServerResponse;
import cn.jingying.dao.AdminMapper;
import cn.jingying.pojo.Admin;
import cn.jingying.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DonaldY on 2018/5/12.
 */
@Service("iAdminService")
public class AdminServiceImpl implements IAdminService{

    @Autowired
    private AdminMapper adminMapper;
    
    public ServerResponse<Admin> login(String username, String password) {
        int resultCount = this.adminMapper.checkUsername(username);
        if(resultCount == 0 ){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
        Admin admin  = this.adminMapper.selectLogin(username, password);
        if(null == admin){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        admin.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",admin);
    }
}
