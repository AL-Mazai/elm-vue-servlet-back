package elm.back.service.impl;

import elm.back.dao.CartDao;
import elm.back.dao.impl.CartDaoImpl;
import elm.back.po.Cart;
import elm.back.service.CartService;
import elm.back.utils.DBUtil;
import java.util.ArrayList;
import java.util.List;

/**
 * (Cart)表服务实现类
 *
 * @author makejava
 * @since 2023-12-06 17:19:53
 */
public class CartServiceImpl implements CartService {
    @Override
    public int saveCart(Cart cart) {
        int result = 0;
        CartDao dao = new CartDaoImpl();
        try {
            DBUtil.getConnection();
            result = dao.saveCart(cart);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return result;
    }

    @Override
    public int updateCart(Cart cart) {
        int result = 0;
        CartDao dao = new CartDaoImpl();
        try {
            DBUtil.getConnection();
            result = dao.updateCart(cart);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return result;
    }

    @Override
    public int removeCart(Cart cart) {
        int result = 0;
        CartDao dao = new CartDaoImpl();
        try {
            DBUtil.getConnection();
            result = dao.removeCart(cart);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return result;
    }

    @Override
    public List<Cart> listCart(Cart cart){
        List<Cart> list = new ArrayList();
        CartDao dao = new CartDaoImpl();
        try {
            DBUtil.getConnection();
            list = dao.listCart(cart);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return list;
    }
}
