package elm.back.dao;

import elm.back.po.Food;

import java.util.List;

/**
 * (Food)表数据库访问层
 *
 * @author makejava
 * @since 2023-12-06 16:56:31
 */
public interface FoodDao {
    public List<Food> listFoodByBusinessId(Integer businessId) throws Exception;

}

