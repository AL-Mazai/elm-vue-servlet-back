package elm.back.service.impl;

import elm.back.dao.FoodDao;
import elm.back.dao.impl.FoodDaoImpl;
import elm.back.po.Food;
import elm.back.service.FoodService;
import elm.back.utils.DBUtil;
import java.util.ArrayList;
import java.util.List;

/**
 * (Food)表服务实现类
 *
 * @author makejava
 * @since 2023-12-06 17:20:31
 */
public class FoodServiceImpl implements FoodService {
    @Override
    public List<Food> listFoodByBusinessId(Integer businessId) {
        List<Food> list = new ArrayList<>();
        FoodDao dao = new FoodDaoImpl();
        try {
            DBUtil.getConnection();
            list = dao.listFoodByBusinessId(businessId);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            DBUtil.close();
        }
        return list;
    }
}
