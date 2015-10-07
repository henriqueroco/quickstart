/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.cdi.alternative;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * Servlet implementation class Demo
 * </p>
 *
 * @author Nevin Zhu
 *
 */
@WebServlet("/")
public class Demo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /*
����� * Atributo ser� injetado durante a execu��o. Se beans.xml tem alternativa definido, ent�o essa classe ser� injetado.
����� * Caso contr�rio, o padr�o � injetado.
����� * /
    @Inject
    private Tax tax;

    /**
     * servlet manipula a solicita��o de entrada
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            request.setAttribute("type", tax.getRate());
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/result.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
