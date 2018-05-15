package cn.jingying.service;

import cn.jingying.common.ServerResponse;
import cn.jingying.pojo.Admin;

/**
 * Created by DonaldY on 2018/5/15.
 */
public interface IAdminService {
    ServerResponse<Admin> login(String username, String password);
}
