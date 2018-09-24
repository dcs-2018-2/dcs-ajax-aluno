package br.pro.ramon.dcs.ajax.aluno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aluno")
public class AlunoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        double p1 = Double.parseDouble(request.getParameter("p1"));
        double p2 = Double.parseDouble(request.getParameter("p2"));

        Aluno aluno = new Aluno(nome, p1, p2);

        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.print("A média do aluno " + aluno.getNome() + " é " + aluno.getMedia() + ".");
    }

}
