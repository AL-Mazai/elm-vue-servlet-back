package elm.back.controller;


import elm.back.po.Food;
import elm.back.service.FoodService;
import elm.back.service.impl.FoodServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * (Food)表控制层
 *
 * @author makejava
 * @since 2023-12-06 17:27:53
 */
public class FoodController {
    public Object listFoodByBusinessId(HttpServletRequest request) throws Exception{
        Integer businessId = Integer.valueOf(request.getParameter("businessId"));
        FoodService service = new FoodServiceImpl();
        List<Food> list = service.listFoodByBusinessId(businessId);
        return list;
    }
}

