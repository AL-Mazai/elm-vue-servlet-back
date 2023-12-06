package elm.back.service;


import elm.back.po.Cart;

import java.util.List;

/**
 * (Cart)表服务接口
 *
 * @author makejava
 * @since 2023-12-06 17:19:52
 */
public interface CartService {

    public int saveCart(Cart cart);
    public int updateCart(Cart cart);
    public int removeCart(Cart cart);
    public List<Cart> listCart(Cart cart);
}
