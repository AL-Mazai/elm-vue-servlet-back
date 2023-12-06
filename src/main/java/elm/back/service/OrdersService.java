package elm.back.service;

import elm.back.po.Orders;

import java.util.List;

/**
 * (Orders)表服务接口
 *
 * @author makejava
 * @since 2023-12-06 17:20:41
 */
public interface OrdersService {

    public int createOrders(String userId,Integer businessId,Integer daId,Double orderTotal);
    public Orders getOrdersById(Integer orderId);
    public List<Orders> listOrdersByUserId(String userId);
}
