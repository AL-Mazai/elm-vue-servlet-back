package elm.back.service.impl;

import elm.back.dao.UserDao;
import elm.back.dao.impl.UserDaoImpl;
import elm.back.po.User;
import elm.back.service.UserService;
import elm.back.utils.DBUtil;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2023-12-06 17:20:45
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUserByIdByPass(String userId, String password) {
        User user = null;
        UserDao dao = new UserDaoImpl();
        try {
            DBUtil.getConnection();
            user = dao.getUserByIdByPass(userId, password);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return user;
    }

    @Override
    public int getUserById(String userId) {
        int result = 0;
        UserDao dao = new UserDaoImpl();
        try {
            DBUtil.getConnection();
            result = dao.getUserById(userId);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return result;
    }

    @Override
    public int saveUser(User user) {
        int result = 0;
        UserDao dao = new UserDaoImpl();
        try {
            DBUtil.getConnection();
            result = dao.saveUser(user);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return result;
    }
}
