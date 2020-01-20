package com.rxsoft.service;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.rxsoft.bean.Product;
import com.rxsoft.bean.User;
import com.rxsoft.dao.ProductMapper;
import com.rxsoft.dao.UserMapper;
import com.rxsoft.utils.DateConvertUtil;
import com.rxsoft.utils.Md5Code;
/**
 * 用户相关服务
 * @author lijunqiang
 *
 */
@Service
public class UserService {
	@Autowired
	UserMapper mapper;
	/**
	 * 登录
	 * @param user_id
	 * @param user_name
	 * @return
	 * @throws Exception 
	 */
	public User login(String userid,String password) {
		User user = mapper.login(userid,password);
		return user;
	}
}
