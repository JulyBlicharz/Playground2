package jdbc;

import java.sql.*;

public class Programa {

    public static void main(String[] args) throws SQLException {

        Conexao minhaConexao = new Conexao();

        //Conectar com o Database
        // Database: jdbc: tipoDeBanco: //urlBanxo: porta/database
        // Usuário: alunoX (seu número)
        //  Senha: target123


        String usuario = "admin";
        String senha = "Imers40JavaAdmin";
        String url = "jdbc:postgresql://165.227.108.225:5432/db_aluno3";
        minhaConexao.conectar(url, usuario, senha);


        String sql = "insert into vacina(nome) values ('Covid')";
        minhaConexao.inserir(sql);

        //conectar
//        Connection connection  = DriverManager.getConnection(url, usuario, senha);
//        System.out.printf("É somente leitura? %s\n", connection.isReadOnly());

        // inserir dados numa tabela
//        Statement statement = connection.createStatement();
//        statement.execute("insert into vacina(nome) values ('Covid')");
//        statement.close();

        //consultar os dados inseridos
//        Statement statementConsulta = connection.createStatement();
//        ResultSet rs = statementConsulta.executeQuery("select id,nome from vacina");
//        // rs.next(); //linhs dentro do banco

        //Consultar os dados inseridos
        ResultSet rs = minhaConexao.consultar("select id,nome from vacina");

        while(rs.next()) {
            //System.out.println(rs.getString("nome")); // rs.getString(1) posicao
            //System.out.println(rs.getInt("id"));
            System.out.printf("%d - %s\n", rs.getInt("id"), rs.getString("nome"));
        }

        minhaConexao.desconectar();

    }
}
