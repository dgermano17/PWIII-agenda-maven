package com.agenda.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.agenda.model.Endereco;
import com.agenda.util.ConnectionFactory;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EnderecoDAO {

	private Connection connection;
	
	public void cadastrar(Endereco endr) {
		
		String SQL = "insert into endereco (logradouro, cep) values(?,?,?)";
		
		try {

			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);
			
			stmt.setString(2, endr.getLogradouro());
			stmt.setString(3, endr.getCep());
		
		}catch (SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Endereco> buscarEnd(){
		
		String SQL = "select * from endereco";
		
		try {

			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);
			
			List<Endereco> endereco = new ArrayList<Endereco>();
			
			ResultSet rs = stmt.executeQuery(); 
			
			while (rs.next()) {
				Endereco ender = new Endereco();
				ender.setIdEnd(rs.getLong("id"));
				ender.setLogradouro(rs.getString("lorgadouro"));
				ender.setCep(rs.getString("cep"));
			
				endereco.add(ender);
			}
			
			stmt.close();
			this.connection.close();
			return endereco;
		
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void removerEnd(Endereco endr) {
		
		String SQL = "delete from endereco where id=?";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement(SQL);
			stmt.setLong(1, endr.getIdEnd());
			stmt.execute();
			stmt.close();
		
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void aterarEnd(Endereco endr) {
		String SQL = "update endereco set logradouro=?, cep=?: where id=?";
		
		try {
		    	
		    this.connection = new ConnectionFactory().getConnection();
		    PreparedStatement stmt = this.connection.prepareStatement(SQL);
		    
		    stmt.setString(1, endr.getLogradouro());
		    stmt.setString(2, endr.getCep());
		    stmt.setLong(3, endr.getIdEnd());
		    stmt.execute();
		    stmt.close();
		
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
