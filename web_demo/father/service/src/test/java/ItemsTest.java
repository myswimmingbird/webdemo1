import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext-service.xml"})

public class ItemsTest {
    @Autowired
    ItemsService service;

    @Autowired
    ItemsDao dao;

    @Test
    public void test1() {
        Items byId = service.findById(1);
        System.out.println(byId);
    }
}
