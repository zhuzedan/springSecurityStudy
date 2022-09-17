package com.zzd.securityDemo;

import com.zzd.securityDemo.dao.UserMapper;
import com.zzd.securityDemo.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@SpringBootTest
class SecurityDemoApplicationTests {

	@Autowired
	UserMapper userMapper;
	@Test
	void contextLoads() {
		List<User> users = userMapper.selectList(null);
		System.out.println(users.get(0));
	}
	@Autowired
	PasswordEncoder passwordEncoder;
	@Test
	public void passwordEncoder() {
		String ydlclass1 = passwordEncoder.encode("ydlclass");
		String ydlclass2 = passwordEncoder.encode("ydlclass");
		System.out.println(ydlclass1);
		System.out.println(ydlclass2);

		boolean flag1 = passwordEncoder.matches("ydlclass", ydlclass1);
		System.out.println(flag1);
		boolean flag2 = passwordEncoder.matches("ydlclass", ydlclass2);
		System.out.println(flag2);

	}

}
