package com.github.peng.spring.boot.security.demo.utils;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.peng.spring.boot.security.demo.pojo.ResponseData;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by fp295 on 2018/3/24.
 */
public class JsonUtil {


    public static void writeJson(HttpServletResponse response, ResponseData responseData) {
        PrintWriter writer;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        response.setStatus(200);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        try {
            writer = response.getWriter();
            writer.write(objectMapper.writeValueAsString(responseData));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
