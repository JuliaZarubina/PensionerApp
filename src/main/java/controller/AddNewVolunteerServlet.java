package controller;

import com.google.gson.Gson;
import model.Volunteer;
import service.VolunteerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.net.URLEncoder;

public class AddNewVolunteerServlet extends HttpServlet {
        private final VolunteerService volunteerService;

    public AddNewVolunteerServlet(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
            String name = request.getParameter("firstname");
            String lastName = request.getParameter("lastname");
            String age = request.getParameter("age");
            String phone = request.getParameter("phone");
            String id = request.getParameter("id");
            long chatId = 0;


            Volunteer volunteer = new Volunteer(name, lastName, age, phone, true, chatId);
            volunteerService.addVolunteer(volunteer);
        //    JOptionPane.showMessageDialog(null, getMessage(), «Поздравляем, вы-волонтер», JOptionPane.OK_OPTION);

            Gson gson = new Gson();

            String json = gson.toJson(volunteer);
            response.setContentType("text/html;charset=utf-8");
         //   response.setCharacterEncoding("UTF-8");
            response.getWriter().println(json);
            response.sendRedirect("https://t.me/pens000_bot?start");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
    }
}

