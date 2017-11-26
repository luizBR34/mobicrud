<%-- 
    Document   : enviar
    Created on : 21/10/2017, 19:24:07
    Author     : Fernando
--%>

<%@page import="mobiCRUD.WS.CRUDImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <jsp:useBean id="beanCliente" class="mobiCRUD.Beans.Cliente" scope="session"/>

    <%
    
            String param_Nome = request.getParameter("nome");
            String param_Estado = request.getParameter("estado");
            String param_Cidade = request.getParameter("cidade");
            String param_Endereco = request.getParameter("endereco");
            String param_DDD = request.getParameter("ddd");
            String param_Tel = request.getParameter("tel");
            String param_Email = request.getParameter("email");
            String param_Senha = request.getParameter("senha");
            String param_Tipo_OP = request.getParameter("OPERACAO");
            

            mobiCRUD.WS.CRUDImpl_Service service = new mobiCRUD.WS.CRUDImpl_Service();
            CRUDImpl ws = service.getCRUDImplPort();

            int resultado_OP = 0;

                switch (Integer.valueOf(param_Tipo_OP).intValue()) {

                    case 0: resultado_OP = ws.adicionaUsuarios(param_Email, param_Nome, param_Estado, param_Cidade, param_Endereco, param_DDD, param_Tel, param_Senha); break;
                    case 2: resultado_OP = ws.editaUsuarios(param_Email, param_Nome, param_Estado, param_Cidade, param_Endereco, param_DDD, param_Tel, param_Senha); break;
                    case 3: resultado_OP = ws.removeUsuarios(param_Email); break;
                }

            out.print(resultado_OP);

            beanCliente.resetarFormulario();
    %>
    