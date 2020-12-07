package com.houx.dao;

import com.houx.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: HouX
 * @Date: 2020/12/7
 * @Description:
 */
@Repository
public interface RoleDao {
    public Role getRole(Long id);

    public int deleteRole(Long id);

    public int insertRole(Role role);

    public int updateRole(Role role);

    public List<Role> findRoles(String roleName,String note);

}
