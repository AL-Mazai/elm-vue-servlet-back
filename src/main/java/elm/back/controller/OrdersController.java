package elm.back.controller;


import elm.back.po.Orders;
import elm.back.service.OrdersService;
import elm.back.service.impl.OrdersServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (Orders)表控制层
 *
 * @author makejava
 * @since 2023-12-06 17:27:57
 */
public class OrdersController {
    public Object createOrders(HttpServletRequest request) throws Exception{
        String userId = request.getParameter("userId");
        Integer businessId = Integer.valueOf(request.getParameter("businessId"));
        Integer daId = Integer.valueOf(request.getParameter("daId"));
        Double orderTotal = Double.valueOf(request.getParameter("orderTotal"));

        OrdersService service = new OrdersServiceImpl();
        int orderId = service.createOrders(userId, businessId, daId, orderTotal);

        return orderId;
    }

    public Object getOrdersById(HttpServletRequest request) throws Exception{
        Integer orderId = Integer.valueOf(request.getParameter("orderId"));
        OrdersService service = new OrdersServiceImpl();
        Orders orders = service.getOrdersById(orderId);
        return orders;
    }

    public Object listOrdersByUserId(HttpServletRequest request) throws Exception{
        String userId = request.getParameter("userId");
        OrdersService service = new OrdersServiceImpl();
        List<Orders> list = service.listOrdersByUserId(userId);
        return list;
    }
}

