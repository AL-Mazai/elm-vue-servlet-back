package elm.back.controller;


import elm.back.po.User;
import elm.back.service.UserService;
import elm.back.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletRequest;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2023-12-06 17:28:01
 */
public class UserController {
    public Object getUserByIdByPass(HttpServletRequest request) throws Exception{
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        UserService service = new UserServiceImpl();
        User user = service.getUserByIdByPass(userId, password);
        return user;
    }

    public Object getUserById(HttpServletRequest request) throws Exception{
        String userId = request.getParameter("userId");
        UserService service = new UserServiceImpl();
        int result = service.getUserById(userId);
        return result;
    }

    public Object saveUser(HttpServletRequest request) throws Exception{
        User user = new User();
        System.out.println(user.getUserName());

        user.setUserId(request.getParameter("userId"));
        user.setPassword(request.getParameter("password"));
        user.setUserName(request.getParameter("userName"));
        user.setUserSex(Integer.valueOf(request.getParameter("userSex")));
        UserService service = new UserServiceImpl();
        int result = service.saveUser(user);
        return result;
    }
}

