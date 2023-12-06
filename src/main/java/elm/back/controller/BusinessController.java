package elm.back.controller;

import elm.back.po.Business;
import elm.back.service.BusinessService;
import elm.back.service.impl.BusinessServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

/**
 * (Business)表控制层
 *
 * @author makejava
 * @since 2023-12-06 17:27:40
 */
public class BusinessController {
    public Object listBusinessByOrderTypeId(HttpServletRequest request) throws Exception{
        Integer orderTypeId = Integer.valueOf(request.getParameter("orderTypeId"));
        BusinessService service = new BusinessServiceImpl();
        List<Business> list= service.listBusinessByOrderTypeId(orderTypeId);
        return list;
    }

    public Object getBusinessById(HttpServletRequest request) throws Exception{
        System.out.println(request.getParameter("businessId"));
        Integer businessId = Integer.valueOf(request.getParameter("businessId"));
        BusinessService service = new BusinessServiceImpl();
        Business business = service.getBusinessById(businessId);
        return business;
    }

}

