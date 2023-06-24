package com.example.benchmarkjackson;

import com.example.benchmarkjackson.entity.Entity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.WeakHashMap;

@WebServlet(name = "HashMapServlet", value = "/HashMapServlet")
public class HashMapServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Entity e = new Entity("1",10, true);
        HashMap map = new HashMap();
        map.put("1", e);
        response.getWriter().print(e == map.get("1"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
