package elm.back.dao;

import elm.back.po.Business;

import java.util.List;

/**
 * (Business)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-06 16:54:36
 */
public interface BusinessDao {
    public List<Business> listBusinessByOrderTypeId(Integer orderTypeId) throws Exception;
    public Business getBusinessById(Integer businessId) throws Exception;

}

