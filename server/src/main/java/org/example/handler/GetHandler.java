package org.example.handler;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetHandler extends HttpServlet {
    final Logger logger = LogManager.getLogger(GetHandler.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logger.info("REQUEST GET: " + request.getRequestURI());
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("{ \"status\": \"ok\"}");
        logger.info("RESPONSE GET: " + request.getRequestURI());
    }
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(HttpServletResponse.SC_OK);
//
//        final Logger logger = LogManager.getLogger(GetHandler.class);
//        logger.info(" do get ");
//
//        resp.setContentType("application/json; charset=UTF-8");
//        PrintWriter out = resp.getWriter();
//        JSONObject jo = new JSONObject();
//        jo.put("name", "jon doe");
//        jo.put("age", "22");
//        jo.put("city", "chicago");
//        out.write(String.valueOf(jo));
// }

}