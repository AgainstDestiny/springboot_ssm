package cn.itaxu.service;


import cn.itaxu.domain.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

/**
 * @Description: cn.itaxu.service
 * @author: Axu
 * @date:2022/11/13 22:54
 */
@SpringBootTest
public class BookServiceTest {

    @Autowired
    private BrandService brandService;

    @Test
    void testSave(){
        Brand brand = new Brand(1,"快手","快手科技有限公司",56,"精彩直播",1);
        boolean flag = brandService.save(brand);
        System.out.println(flag);
    }

    @Test
    void testDeleteById(){
        boolean flag = brandService.deleteById(60);
        System.out.println(flag);
    }

    @Test
    void testDeleteByIds(){
        int[] ids = {64,66};
        boolean flag = brandService.deleteMultiply(ids);
        System.out.println(flag);
    }

    @Test
    void testUpdate(){
        Brand brand = new Brand(61,"快手","快手科技有限公司",21,"记录美好生活",0);
        boolean flag = brandService.update(brand);
        System.out.println(flag);
    }

    @Test
    void testGetById(){
        Brand brand = brandService.getById(3);
        System.out.println(brand);
    }

    @Test
   void testGetAll(){
        List<Brand> brands = brandService.getAll();
        System.out.println(brands);
    }

}
