package com.doj.doj.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.doj.doj.model.dto.user.UserQueryDTO;
import com.doj.doj.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.doj.doj.model.vo.UserLoginVO;
import com.doj.doj.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author ASUS
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-08-22 00:53:19
*/
public interface UserService extends IService<User> {

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    UserLoginVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    UserLoginVO getLoginUserVO(User user);

    User getLoginUser(HttpServletRequest request);

    long userRegister(String userAccount, String userPassword, String checkPassword);

    boolean userLogout(HttpServletRequest request);

    UserVO getUserVO(User user);

    List<UserVO> getUserVO(List<User> userList);

    Wrapper<User> getQueryWrapper(UserQueryDTO userQueryRequest);
}
