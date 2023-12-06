package elm.back.service;


import elm.back.po.DeliveryAddress;

import java.util.List;

/**
 * (Deliveryaddress)表服务接口
 *
 * @author makejava
 * @since 2023-12-06 17:20:27
 */
public interface DeliveryAddressService {

    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId);
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress);
    public DeliveryAddress getDeliveryAddressById(Integer daId);
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress);
    public int removeDeliveryAddress(Integer daId);

}
