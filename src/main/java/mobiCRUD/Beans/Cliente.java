/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobiCRUD.Beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.AjaxBehaviorListener;
import mobiCRUD.WS.CRUDImpl;
import mobiCRUD.WS.StringArray;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Fernando
 */
@ManagedBean(name="cliente")
@SessionScoped
public class Cliente implements Serializable, AjaxBehaviorListener {

    
        private String nome;
        
        private String estado;
        private final String[] estados_Nomes = new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", 
                                                "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", 
                                                "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", 
                                                "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" };
        
        private String cidade;
                
        private String endereco;
        private String tel_DDD;
        private String telefone;
        private String email;
        private String senha;
        private String repetir_Senha;
        
        private  ArrayList<String> combo_email;
        
        private CRUDImpl ws; //Web Service do MobiSCD
        
        
    public Cliente() {
        
        mobiCRUD.WS.CRUDImpl_Service service = new mobiCRUD.WS.CRUDImpl_Service();
        ws = service.getCRUDImplPort();

        combo_email = new ArrayList<String>();
    }
    
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String[] getEstados_Nomes() {
        return estados_Nomes;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTel_DDD() {
        return tel_DDD;
    }

    public void setTel_DDD(String tel_DDD) {
        this.tel_DDD = tel_DDD;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRepetir_Senha() {
        return repetir_Senha;
    }

    public void setRepetir_Senha(String repetir_Senha) {
        this.repetir_Senha = repetir_Senha;
    }

    public ArrayList<String> getLista_Usuarios() {
        return combo_email;
    }

    public void setLista_Usuarios(ArrayList<String> combo_email) {
        this.combo_email = combo_email;
    }



    

    
    
    
    
    //Método usado para verificar se os dados fornecidos do usuário são legítmos.
    public void validar(FacesContext context, UIComponent component, Object value) {

        String valor = (String) value;

            //Aqui é identificado o componente que gerou o evento.
            //O componente que gerou o evento de validação foi o input text do e-mail.
            if (component.getId().equals("cadastro_Email")) {
  
                //Endereço de e-mail inválido. Todo e-mail deve conter os símbolos de @ e .
                if (!(valor.contains("@")) || !(valor.contains("."))) {
                    
                FacesMessage msg = new FacesMessage("Endereço de e-mail inválido!");
                context.addMessage(component.getClientId(context), msg);   
                
                } else { }

            } 
            
            


            if (component.getId().equals("cadastro_Senha")) {
                
                //A senha deve ter no mínimo 5 caracteres
                if (valor.length() < 5) {
                    
                FacesMessage msg = new FacesMessage("A senha deve ter no mínimo 5 caracteres.");
                context.addMessage(component.getClientId(context), msg);   
                
                } else { }
            }
            

            if (component.getId().equals("cadastro_Senha02")) {

                //A senha deve ter no mínimo 5 caracteres
                if (valor.length() < 5) {
                    
                FacesMessage msg = new FacesMessage("A senha deve ter no mínimo 5 caracteres.");
                context.addMessage(component.getClientId(context), msg);   

                } else { }

            }
    }
    
    

    
    //O botão GRVAR foi pressioando
    public void realizaOperacao(ActionEvent event) {
        
        //Botão Gravar Cadastro da tela de Adicionar foi pressionado
        if (event.getComponent().getId().equals("gravar_Cadastro")) {
            
            
            int resultadoAdicao = ws.adicionaUsuarios(email, nome, estado, cidade, endereco, tel_DDD, telefone, senha);
            
                //Dados adicionados com sucesso. Abre Pop-Up de sucesso
                if (resultadoAdicao > 0) {
                    

                    
                } else {
                    
                    
                    
                    
                }
            

        //O botão RESETAR foi clicado.        
        } else if (event.getComponent().getId().equals("resetar")) {
            
            resetarFormulario();

            
        //RESETA O FORMULARIO
        } else if (event.getComponent().getId().equals("menu_Adicionar")) {
            
            resetarFormulario();
            

        //RESETA OS CAMPOS DO FORMULARIO E POPULA O COMBO.
        } else if (event.getComponent().getId().equals("menu_Buscar") || event.getComponent().getId().equals("menu_Editar") || event.getComponent().getId().equals("menu_Remover")) {
            
            resetarFormulario();
            combo_email.clear();
            
            ArrayList arrayUsuarios = new ArrayList(ws.buscaUsuarios());

            int quantUsuarios = arrayUsuarios.size();
            
                for (int i = 0; i < quantUsuarios; i++) {
   
                    combo_email.add(((StringArray) arrayUsuarios.get(i)).getItem().get(0)); //0 = CLIENTE_ID = E-MAIL
                }

                
        } else {
            
            
  
        }
        

    }
    
    
    
    @Override
    public void processAjaxBehavior(AjaxBehaviorEvent abe) throws AbortProcessingException {

        if (abe.getComponent().getId().equals("remove_Cadastro")) {
            
            combo_email.remove(email);
        }
        
        resetarFormulario();
    }
    
    
    
    //Um item do combo box foi selecionado
    public void processarItemSelecionado(ValueChangeEvent event) {
        

        ArrayList arrayUsuarios = new ArrayList(ws.buscaUsuarios());
        
            for (int i = 0; i < arrayUsuarios.size(); i++) {
                
                if (((String) event.getNewValue()).equals(((StringArray) arrayUsuarios.get(i)).getItem().get(0))) {

                    nome = ((StringArray) arrayUsuarios.get(i)).getItem().get(1);
                    estado = ((StringArray) arrayUsuarios.get(i)).getItem().get(2);
                    cidade = ((StringArray) arrayUsuarios.get(i)).getItem().get(3);
                    endereco = ((StringArray) arrayUsuarios.get(i)).getItem().get(4);
                    tel_DDD = ((StringArray) arrayUsuarios.get(i)).getItem().get(5);
                    telefone = ((StringArray) arrayUsuarios.get(i)).getItem().get(6);
                    email = ((StringArray) arrayUsuarios.get(i)).getItem().get(0);
                    senha = ((StringArray) arrayUsuarios.get(i)).getItem().get(7);
                    repetir_Senha = ((StringArray) arrayUsuarios.get(i)).getItem().get(7);
                }
            } 
   
    }
    
    
    

    
    public void resetarFormulario() {
        
        nome = "";
        estado = estados_Nomes[0];
        cidade = "";
        endereco = "";
        tel_DDD = "";
        telefone = "";
        email = "";
        senha = "";
        repetir_Senha = "";
 
    }

}
