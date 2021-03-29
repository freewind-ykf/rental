package com.car.rental.service.impl;

import com.car.rental.entity.UserInfo;
import com.car.rental.service.UserInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserInfoServiceImplTest {

    @Resource
    private UserInfoService userInfoService;

    @Test
    public void getUserInfoById() {
        UserInfo userInfo = userInfoService.getUserInfoById(1L);
        Assert.assertNotNull(userInfo);
    }

}