package website;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wx.website.dao.BaseUserMapper;
import com.wx.website.model.User;
import com.wx.website.serviceimpl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class TestMybaits {
	
	/*@Autowired
	private UserServiceImpl userServiceImpl;
	 
	@Test
	public void test(){
		
		User user = userServiceImpl.selectByPrimaryKey(1);
		assertEquals(user, null);
		System.out.println(user);
	}*/
	
	@Autowired
	BaseUserMapper baseUserMapper;
	
	@Autowired
	User user;
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Test
	public void test(){
		User user = baseUserMapper.selectByPrimaryKey(1);
		System.out.println(user);
		
		/*user = userServiceImpl.addUser(3,"xixi" , "123", "shanghai", "3");
		int result = baseUserMapper.insert(user);
		System.out.println(result);*/
		
		baseUserMapper.deleteByPrimaryKey(3);
	}
	
}
