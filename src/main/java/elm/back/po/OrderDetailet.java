package elm.back.po;

import lombok.Data;

import java.io.Serializable;

/**
 * (Orderdetailet)实体类
 *
 * @author makejava
 * @since 2023-12-06 16:51:09
 */
@Data
public class OrderDetailet implements Serializable {
    private static final long serialVersionUID = -41098458252876013L;
    /**
     * 订单明细编号
     */
    private Integer odId;
    /**
     * 所属订单编号
     */
    private Integer orderId;
    /**
     * 食品编号
     */
    private Integer foodId;
    /**
     * 数量
     */
    private Integer quantity;

    //多对一：所属食品
    private Food food;
}

