package elm.back.po;

import lombok.Data;

import java.io.Serializable;

/**
 * (Deliveryaddress)实体类
 *
 * @author makejava
 * @since 2023-12-06 16:50:20
 */
@Data
public class DeliveryAddress implements Serializable {
    private static final long serialVersionUID = -39921287716108364L;
    /**
     * 送货地址编号
     */
    private Integer daId;
    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系人性别
     */
    private Integer contactSex;
    /**
     * 联系人电话
     */
    private String contactTel;
    /**
     * 送货地址
     */
    private String address;
    /**
     * 所属用户编号
     */
    private String userId;
}

