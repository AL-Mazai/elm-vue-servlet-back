package elm.back.po;

import lombok.Data;

import java.io.Serializable;

/**
 * (Food)实体类
 *
 * @author makejava
 * @since 2023-12-06 16:50:48
 */
@Data
public class Food implements Serializable {
    private static final long serialVersionUID = -38241562155594597L;
    /**
     * 食品编号
     */
    private Integer foodId;
    /**
     * 食品名称
     */
    private String foodName;
    /**
     * 食品介绍
     */
    private String foodExplain;
    /**
     * 食品图片
     */
    private String foodImg;
    /**
     * 食品价格
     */
    private Double foodPrice;
    /**
     * 所属商家编号
     */
    private Integer businessId;
    /**
     * 备注
     */
    private String remarks;



}

