package cn.jingying.pojo;

import java.util.Date;

public class Admin {
    private Integer id;

    private String username;

    private String realname;

    private String password;

    private Short roleId;

    private Date createTime;

    public Admin(Integer id, String username, String realname, String password, Short roleId, Date createTime) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.password = password;
        this.roleId = roleId;
        this.createTime = createTime;
    }

    public Admin() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Short getRoleId() {
        return roleId;
    }

    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}