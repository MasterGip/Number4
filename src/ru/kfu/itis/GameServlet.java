package ru.kfu.itis;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mg on 12.02.15.
 */
public class GameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Game game = new Game();
        req.setAttribute("game", game);
        RequestDispatcher dispatcher = req.getRequestDispatcher("gamePage.jsp");
        if(dispatcher != null){
            dispatcher.forward(req, resp);
        }
    }


}
