/* 
    ARQUIVO RESPONSÁVEL POR REALIZAR OPERAÇÕES AJAX DE CONSUMO DO WEB SERVICE.
 */

    function adicionaResposta(resposta, operacao) {
        
        //Operação realizada com sucesso!
        if (resposta > 0) {
            
            var crudOP = (operacao == 0) ? "adicionado" : (operacao == 2) ? "editado" : "removido";

            $("#mensagem").html("<STRONG>O usuário foi " + crudOP + " com sucesso!</STRONG>");
            $("#caixaDialogo").modal();

        } else {
            
            $("#caixaDialogoConteudo").css("backgroundColor", "#f44336");
            $("#mensagem").html("<STRONG>Ocorreu um erro na operação!</STRONG>");
            $("#caixaDialogo").modal();    
        }

    }



    //AQUI CRIA-SE O OBJETO XHR
    function createXHR(){

            //Verifica se a implementação nativa de um objeto XHR é suportada.
            if (typeof XMLHttpRequest != "undefined") {

                    return new XMLHttpRequest();

            //Apenas para navegadores Internet explorer abaixo da versão 7.
            } else if (typeof ActiveXObject != "undefined") {

                    if (typeof arguments.callee.activeXString != "string") {

                            var versions = ["MSXML2.XMLHttp.6.0", "MSXML2.XMLHttp.3.0", "MSXML2.XMLHttp"],
                            i, len;

                            for (i=0, len=versions.length; i < len; i++) {

                                    try {
                                            new ActiveXObject(versions[i]);
                                            arguments.callee.activeXString = versions[i];
                                            break;
                                    } catch (ex) {
                                            //Pula
                                    }
                            }

                    }

                    return new ActiveXObject(arguments.callee.activeXString);

            } else {

                    alert("Nenhum objeto XHR disponivel!");
            }
    }
    
    
    
    
    //Função para formatar a URL corretamente para passar parâmetros numa solicitação GET.
    function addURLParam(url, name, value) {

            url += (url.indexOf("?") == -1 ? "?" : "&");
            url += encodeURIComponent(name) + "=" + encodeURIComponent(value);
            return url;
    }
    
    
    
    //FUNÇÃO QUE ENVIA UM HTTP REQUEST PRA PAGINA ENVIAR.JSP POR AJAX 
    //PARA REALIZAR A OPERAÇÃO VIA WEB SERVICE.
    //0 = ADICIONAR
    //2 = EDITAR
    //3 = REMOVER
    function consomeWS(operacao) {
 
        var xhr = createXHR();
        
        xhr.onreadystatechange = function() {

                // O código 4 indica que a resposta (HTTP RESPONSE) foi recebido e esta disponível.
                if (xhr.readyState == 4) {

                        if ((xhr.status >= 200 && xhr.status < 300) || xhr.status == 304) {

                                adicionaResposta(xhr.responseText, operacao);

                        } else {

                                adicionaResposta(xhr.responseText, operacao);
                        }

                }
        };


        var url = "https://mobicrud.herokuapp.com/enviar.jsp";
        
        var nome = document.getElementById("j_idt30:cadastro_Nome");
        var estado = document.getElementById("j_idt30:cadastro_Estado");
        var cidade = document.getElementById("j_idt30:cadastro_Cidade");
        var endereco = document.getElementById("j_idt30:cadastro_Endereco");
        var ddd = document.getElementById("j_idt30:cadastro_DDD");
        var tel = document.getElementById("j_idt30:cadastro_Telefone");
        var email = document.getElementById("j_idt30:cadastro_Email");
        var senha = document.getElementById("j_idt30:cadastro_Senha");
        

        //Adiciona os argumentos.
        url = addURLParam(url, "nome", nome.value);
        url = addURLParam(url, "estado", estado.value);
        url = addURLParam(url, "cidade", cidade.value);
        url = addURLParam(url, "endereco", endereco.value);
        url = addURLParam(url, "ddd", ddd.value);
        url = addURLParam(url, "tel", tel.value);
        url = addURLParam(url, "email", email.value);
        url = addURLParam(url, "senha", senha.value);
        url = addURLParam(url, "OPERACAO", operacao.toString());
        
        xhr.open("get", url, true);
        xhr.send(null); 
    }
    
    
    
 
 