package elm.back.dao;

import elm.back.po.Cart;

import java.util.List;

/**
 * (Cart)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-06 16:55:27
 */
public interface CartDao {
    public int saveCart(Cart cart) throws Exception;
    public int updateCart(Cart cart) throws Exception;
    public int removeCart(Cart cart) throws Exception;
    public List<Cart> listCart(Cart cart) throws Exception;

}

