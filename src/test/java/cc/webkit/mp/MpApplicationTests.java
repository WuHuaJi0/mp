package cc.webkit.mp;

import cc.webkit.mp.entity.User;
import cc.webkit.mp.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MpApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println("----select all---");
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
