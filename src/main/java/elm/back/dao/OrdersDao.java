package elm.back.dao;

import elm.back.po.Orders;

import java.util.List;

/**
 * (Orders)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-06 16:56:41
 */
public interface OrdersDao {
    public int saveOrders(Orders orders) throws Exception;
    public Orders getOrdersById(Integer orderId) throws Exception;
    public List<Orders> listOrdersByUserId(String userId) throws Exception;

}

