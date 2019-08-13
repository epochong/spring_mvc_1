package com.ming.controller;

import com.ming.vo.UserInfo;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 适配第二种规则
 */
public class DemoHandler2 implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request,
                              HttpServletResponse response) throws ServletException, IOException {

        List<UserInfo> userInfoList = new ArrayList<UserInfo>();

        UserInfo userInfo1 = new UserInfo();
        userInfo1.setUserid(1);
        userInfo1.setUsername("arvin");

        UserInfo userInfo2 = new UserInfo();
        userInfo2.setUserid(2);
        userInfo2.setUsername("arvin2");

        UserInfo userInfo3 = new UserInfo();
        userInfo3.setUserid(3);
        userInfo3.setUsername("arvin3");

        userInfoList.add(userInfo1);
        userInfoList.add(userInfo2);
        userInfoList.add(userInfo3);

        request.setAttribute("userInfoList",userInfoList);

        //how to do it ?
        request.getRequestDispatcher("/jsp/showList.jsp").forward(request,response);

    }
}
