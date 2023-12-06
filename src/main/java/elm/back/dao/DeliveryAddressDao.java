package elm.back.dao;


import elm.back.po.DeliveryAddress;

import java.util.List;

/**
 * (Deliveryaddress)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-06 16:56:26
 */
public interface DeliveryAddressDao {
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) throws Exception;
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception;
    public DeliveryAddress getDeliveryAddressById(Integer daId) throws Exception;
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress) throws Exception;
    public int removeDeliveryAddress(Integer daId) throws Exception;

}

