package elm.back.service.impl;

import elm.back.dao.BusinessDao;
import elm.back.dao.impl.BusinessDaoImpl;
import elm.back.po.Business;
import elm.back.service.BusinessService;
import elm.back.utils.DBUtil;
import java.util.ArrayList;
import java.util.List;

/**
 * (Business)表服务实现类
 *
 * @author makejava
 * @since 2023-12-06 17:20:20
 */
public class BusinessServiceImpl implements BusinessService {
    @Override
    public List<Business> listBusinessByOrderTypeId(Integer orderTypeId) {
        List<Business> list = new ArrayList<>();
        BusinessDao dao = new BusinessDaoImpl();
        try {
            DBUtil.getConnection();
            list = dao.listBusinessByOrderTypeId(orderTypeId);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return list;
    }

    @Override
    public Business getBusinessById(Integer businessId) {
        Business business = null;
        BusinessDao dao = new BusinessDaoImpl();
        try {
            DBUtil.getConnection();
            business = dao.getBusinessById(businessId);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return business;
    }
}
