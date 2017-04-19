package userTest;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSON;
import com.lemon.demo.pojo.User;
import com.lemon.demo.service.IUserService;

//@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
//@WebAppConfiguration
//@ContextConfiguration(locations = { "classpath:spring-mybatis.xml", "classpath:spring-mvc.xml" })
public class TestMybatis {
//	private static Logger logger = Logger.getLogger(TestMybatis.class);
//
//	// private ApplicationContext ac = null;
//	@Resource(name = "userService")
//	private IUserService userService = null;
//
//	// @Before
//	// public void before() {
//	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//	// userService = (IUserService) ac.getBean("userService");
//	// }
//
//	@Test
//	public void test1() {
//		User user = userService.getUserById(1);
//		// System.out.println(user.getUserName());
//		// logger.info("值："+user.getUserName());
//		logger.info(JSON.toJSONString(user));
//	}
//
//	@Test
//	public void test2() {
//		User user = new User();
//		user.setAge(22);
//		user.setUserName("lemon");
//		user.setPassword("Qq111111");
//		userService.addUser(user);
//
//		User user2 = userService.getUserById(2);
//		logger.info(JSON.toJSONString(user2));
//	}
}