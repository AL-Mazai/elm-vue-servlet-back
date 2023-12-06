package elm.back.service.impl;

import elm.back.dao.DeliveryAddressDao;
import elm.back.dao.impl.DeliveryAddressDaoImpl;
import elm.back.po.DeliveryAddress;
import elm.back.service.DeliveryAddressService;
import elm.back.utils.DBUtil;
import java.util.ArrayList;
import java.util.List;

/**
 * (Deliveryaddress)表服务实现类
 *
 * @author makejava
 * @since 2023-12-06 17:20:27
 */
public class DeliveryAddressServiceImpl implements DeliveryAddressService {
    @Override
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) {
        List<DeliveryAddress> list = new ArrayList<>();
        DeliveryAddressDao dao = new DeliveryAddressDaoImpl();
        try {
            DBUtil.getConnection();
            list = dao.listDeliveryAddressByUserId(userId);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return list;
    }

    @Override
    public int saveDeliveryAddress(DeliveryAddress deliveryAddress) {
        int result = 0;
        DeliveryAddressDao dao = new DeliveryAddressDaoImpl();
        try {
            DBUtil.getConnection();
            result = dao.saveDeliveryAddress(deliveryAddress);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return result;
    }

    @Override
    public DeliveryAddress getDeliveryAddressById(Integer daId) {
        DeliveryAddress deliveryAddress = null;
        DeliveryAddressDao dao = new DeliveryAddressDaoImpl();
        try {
            DBUtil.getConnection();
            deliveryAddress = dao.getDeliveryAddressById(daId);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return deliveryAddress;
    }

    @Override
    public int updateDeliveryAddress(DeliveryAddress deliveryAddress) {
        int result = 0;
        DeliveryAddressDao dao = new DeliveryAddressDaoImpl();
        try {
            DBUtil.getConnection();
            result = dao.updateDeliveryAddress(deliveryAddress);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return result;
    }

    @Override
    public int removeDeliveryAddress(Integer daId) {
        int result = 0;
        DeliveryAddressDao dao = new DeliveryAddressDaoImpl();
        try {
            DBUtil.getConnection();
            result = dao.removeDeliveryAddress(daId);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return result;
    }
}
