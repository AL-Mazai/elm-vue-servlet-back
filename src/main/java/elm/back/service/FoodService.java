package elm.back.service;


import elm.back.po.Food;

import java.util.List;

/**
 * (Food)表服务接口
 *
 * @author makejava
 * @since 2023-12-06 17:20:31
 */
public interface FoodService {
    public List<Food> listFoodByBusinessId(Integer businessId);

}
