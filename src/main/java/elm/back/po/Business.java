package elm.back.po;

import lombok.Data;

import java.io.Serializable;

/**
 * (Business)实体类
 *
 * @author makejava
 * @since 2023-12-06 16:48:27
 */
@Data
public class Business implements Serializable {
    private static final long serialVersionUID = 181214742881059117L;
    /**
     * 商家编号
     */
    private Integer businessId;
    /**
     * 商家名称
     */
    private String businessName;
    /**
     * 商家地址
     */
    private String businessAddress;
    /**
     * 商家介绍
     */
    private String businessExplain;
    /**
     * 商家图片（base64）
     */
    private String businessImg;
    /**
     * 点餐分类
     */
    private Integer orderTypeId;
    /**
     * 起送费
     */
    private Double starPrice;
    /**
     * 配送费
     */
    private Double deliveryPrice;
    /**
     * 备注
     */
    private String remarks;
}

