package elm.back.po;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2023-12-06 16:51:32
 */
@Data
public class Orders implements Serializable {
    private static final long serialVersionUID = -78090305619871665L;
    /**
     * 订单编号
     */
    private Integer orderId;
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 商家编号
     */
    private Integer businessId;
    /**
     * 订购日期
     */
    private Date orderDate;
    /**
     * 订单总价
     */
    private Double orderTotal;
    /**
     * 送货地址编号
     */
    private Integer daId;
    /**
     * 订单状态（0：未支付； 1：已支付）
     */
    private Integer orderState;


    //多对一：所属商家
    private Business business;
    //一对多：订单明细
    private List<OrderDetailet> list;
}

