package org.example.PostFormHandler;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.example.handler.GetHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PostFormHandler extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(HttpServletResponse.SC_OK);
        final Logger logger = LogManager.getLogger(GetHandler.class);
        logger.info(" do post with content type application/x-www-form-urlencoded ");
        logger.warn("Warning : You chose a number > 100 ");
        logger.debug("Debug : You chose a number > 100 ");
        logger.error("Error : You chose a number > 100 ");
        logger.fatal("Fatal : You chose a number > 100 ");
    }
}
