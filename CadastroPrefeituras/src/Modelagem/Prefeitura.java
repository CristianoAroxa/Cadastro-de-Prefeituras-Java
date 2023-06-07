/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelagem;

import Controle.Conn;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dsm-2
 */
public class Prefeitura {
    private int codigo;
    private String prefeitura;
    private String cidade;
    private String senha;
    private String email;
    
    Conn con = new Conn();
    
    public Prefeitura(){
        this(0,"","","","");
    }

    public Prefeitura(int codigo, String prefeitura, String cidade, String senha, String email) {
        this.codigo = codigo;
        this.prefeitura = prefeitura;
        this.cidade = cidade;
        this.senha = senha;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPrefeitura() {
        return prefeitura;
    }

    public void setPrefeitura(String prefeitura) {
        this.prefeitura = prefeitura;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public void cadastrarPrefeitura(){
        String sql = "Insert into prefeituras(codigo,prefeitura,cidade)values"+"("+getCodigo()+",'"+getPrefeitura()+"', '"+getCidade()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro salvo com sucesso!!");
    }
    public void cadastrarAdmin(){
        String sql = "Insert into admins(email,senha)values"+"('"+getEmail()+"', '"+getSenha()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null,"Registro salvo com sucesso!!");
    }    
    public ResultSet listarPrefeituras(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from prefeituras";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    public ResultSet logarPrefeitura(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from Prefeituras where Prefeitura='"+getPrefeitura()+"' and codigo="+getCodigo()+"";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    public ResultSet logarAdm(){
        ResultSet tabela;
        tabela = null;
        String sql = "Select * from admins where email='"+getEmail()+"' and senha='"+getSenha()+"'";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }   
    
    
            
    
}
