package com.test.errormanagement.core.mapper;

import com.test.errormanagement.core.bean.UserBean;
import com.test.errormanagement.core.entity.User;

public interface UserMapper {
    default UserBean toBean(User user) {
        UserBean bean = new UserBean();
        bean.setId(user.getId());
        bean.setUsername(user.getUsername());
        return bean;
    }

    default User toEntity(UserBean bean) {
        User user = new User();
        user.setId(bean.getId());
        user.setUsername(bean.getUsername());
        return user;
    }
}
