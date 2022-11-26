package com.example.benchmarkjackson.entity;

import com.example.benchmarkjackson.data.DataList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TriggerServlet", value = "/TriggerServlet")
public class TriggerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DataList.entityList.get(0);
    }
}
