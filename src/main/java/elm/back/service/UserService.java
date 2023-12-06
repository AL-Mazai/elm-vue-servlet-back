package elm.back.service;


import elm.back.po.User;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2023-12-06 17:20:45
 */
public interface UserService {

    public User getUserByIdByPass(String userId,String password);
    public int getUserById(String userId);
    public int saveUser(User user);

}
