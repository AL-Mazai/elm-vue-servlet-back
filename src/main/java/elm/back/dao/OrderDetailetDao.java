package elm.back.dao;

import elm.back.po.OrderDetailet;

import java.util.List;

/**
 * (Orderdetailet)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-06 16:56:36
 */
public interface OrderDetailetDao {

    public int saveOrderDetailetBatch(List<OrderDetailet> list) throws Exception;
    public List<OrderDetailet> listOrderDetailetByOrderId(Integer orderId) throws Exception;
}

