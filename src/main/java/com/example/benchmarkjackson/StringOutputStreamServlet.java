package com.example.benchmarkjackson;

import com.example.benchmarkjackson.data.DataList;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/StringOutputStreamServlet")
public class StringOutputStreamServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Pragma", "no-cache");
        ObjectMapper objectMapper = new ObjectMapper();
        response.setContentType("application/json");
        String result = objectMapper.writeValueAsString(DataList.entityList);
        response.getOutputStream().print(result);
    }

}
