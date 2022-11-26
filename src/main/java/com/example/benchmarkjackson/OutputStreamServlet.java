package com.example.benchmarkjackson;

import com.example.benchmarkjackson.data.DataList;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/OutputStreamServlet")
public class OutputStreamServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Pragma", "no-cache");
        ObjectMapper objectMapper = new ObjectMapper();
        response.setContentType("application/json");
        OutputStream out = response.getOutputStream();
        objectMapper.writeValue(out, DataList.entityList);
    }

}
