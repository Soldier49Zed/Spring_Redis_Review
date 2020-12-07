package com.houx.main;

import com.houx.config.RootConfig;
import com.houx.pojo.Role;
import com.houx.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: HouX
 * @Date: 2020/12/7
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        //使用注解SpringIOC容器
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RootConfig.class);
        //获取角色服务类
        RoleService roleService = ctx.getBean(RoleService.class);
        Role role = new Role();
        role.setRoleName("role_name_1");
        role.setNote("role_note_1");
        //插入角色
        roleService.insertRole(role);
        //获取角色
        Role getRole = roleService.getRole(role.getId());
        getRole.setNote("role_note_1_update");
        //更新角色
        roleService.updateRole(getRole);
    }
}
