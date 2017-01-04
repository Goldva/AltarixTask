package servlets;

import dao.Factory;
import dao.MessageDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

public class MainMenuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Factory factory = Factory.getInstance();
        MessageDAO messageDAO = factory.getMessageDAO();
        try {
            Collection messages = messageDAO.getAllMessages();
            req.setAttribute("messages", messages);
            req.getRequestDispatcher("/mainMenu.jsp").forward(req, resp);
//            getServletContext().getRequestDispatcher("/mainMenu.jsp").forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
