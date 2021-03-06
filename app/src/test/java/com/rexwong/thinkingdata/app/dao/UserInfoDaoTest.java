package com.rexwong.thinkingdata.app.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-dao.xml")
@Ignore
public class UserInfoDaoTest {

    @Resource
    private UserInfoDao userInfoDao;

    @Test
    public void findUserFromRoomTest() {
        try {
            userInfoDao.findUserFromRoom("0");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
