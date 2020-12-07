package com.houx.service;

import com.houx.pojo.Role;

import java.util.List;

/**
 * @Author: HouX
 * @Date: 2020/12/7
 * @Description:
 */
public interface RoleService {
    public Role getRole(Long id);

    public int deleteRole(Long id);

    public Role insertRole(Role role);

    public int updateRole(Role role);

    public List<Role> findRoles(String roleName, String note);

    public int insertRoles(List<Role> roleList);

}
