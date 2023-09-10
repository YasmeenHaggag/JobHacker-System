

// TASK2 => http://localhost:8080/demo123_war_exploded/task2.jsp


package com.example.demo123;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //response.setContentType("text/html");
        String date= request.getParameter("date1");
        String dateREQ= request.getParameter("date2");
        LocalDate currentDate = LocalDate.parse(date);
        LocalDate datee2 = LocalDate.parse(dateREQ);
        int day=currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();;
        int year = currentDate.getYear();
        int dayREQ=datee2.getDayOfMonth();
        int monthREQ = datee2.getMonthValue();
        int yearREQ = datee2.getYear();
        PrintWriter out = response.getWriter();
        out.println("Days: "+Math.abs(dayREQ-day)+"\n");
        out.println("Months: "+Math.abs(monthREQ-month)+"\n");
        out.println("Years: "+Math.abs(yearREQ-year)+"\n");
    }
}
