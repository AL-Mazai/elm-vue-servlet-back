package elm.back.dao;

import elm.back.po.Business;
import elm.back.po.User;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-06 16:56:45
 */
public interface UserDao {
    public User getUserByIdByPass(String userId,String password) throws Exception;
    public int getUserById(String userId) throws Exception;
    public int saveUser(User user) throws Exception;
}

