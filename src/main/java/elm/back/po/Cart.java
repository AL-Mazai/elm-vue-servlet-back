package elm.back.po;

import lombok.Data;

import java.io.Serializable;

/**
 * (Cart)实体类
 *
 * @author makejava
 * @since 2023-12-06 16:49:32
 */
@Data
public class Cart implements Serializable {
    private static final long serialVersionUID = -34144019638848257L;
    /**
     * 无意义编号
     */
    private Integer cartId;
    /**
     * 食品编号
     */
    private Integer foodId;
    /**
     * 所属商家编号
     */
    private Integer businessId;
    /**
     * 所属用户编号
     */
    private String userId;
    /**
     * 同一类型食品的购买数量
     */
    private Integer quantity;

    //多对一：所属食品
    private Food food;
    //多对一：所属商家
    private Business business;
}

