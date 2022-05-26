package org.example.PostHandler;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.example.handler.GetHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PostJsonHandler extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_OK);
        final Logger logger = LogManager.getLogger(GetHandler.class);
        logger.info(" do post with content type application/x-www-form-urlencoded ");

    }
}
