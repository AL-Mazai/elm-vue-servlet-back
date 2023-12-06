package elm.back.service;


import elm.back.po.Business;

import java.util.List;

/**
 * (Business)表服务接口
 *
 * @author makejava
 * @since 2023-12-06 17:20:20
 */
public interface BusinessService {

    public List<Business> listBusinessByOrderTypeId(Integer orderTypeId);
    public Business getBusinessById(Integer businessId);

}
