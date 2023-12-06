package elm.back.po;

import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2023-12-06 16:52:25
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 215774452219897885L;
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户性别（1：男； 0：女）
     */
    private Integer userSex;
    /**
     * 用户头像
     */
    private String userImg;
    /**
     * 删除标记（1：正常； 0：删除）
     */
    private Integer delTag;


}

