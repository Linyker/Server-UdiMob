package br.com.udimob.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.udimob.dto.Imovel;

public class ImovelDAO extends ConnectionFactory {

	public ArrayList<Imovel> buscarTodos() {

		Connection conn = null;
		ResultSet resultSet = null;
		PreparedStatement stmt = null;
		conn = getConnection();
		ArrayList<Imovel> listaImoveis = null;

		try {
			stmt = conn.prepareStatement("select GROUP_CONCAT(img.nome_imagem) as imagens, imovel.*,u.nome,u.telefone,u.email from imagens img,imovel,usuarios u"
					+ " where imovel.id_usuario = u.id_usuario"
					+ " and img.imovel_id = imovel.id_imovel"
					+ " group by imovel.id_imovel");
			
			resultSet = stmt.executeQuery();
			listaImoveis = new ArrayList<Imovel>();

			while (resultSet.next()) {
				Imovel imovel = new Imovel();
				
				imovel.setBairro(resultSet.getString("bairro"));
				imovel.setDescricaoImovel(resultSet.getString("descricao_imovel"));
				imovel.setIdImovel(resultSet.getInt("id_imovel"));
				imovel.setLogradouro(resultSet.getString("logradouro"));
				imovel.setNumero(resultSet.getInt("numero"));
				imovel.setPreco(resultSet.getDouble("preco"));
				imovel.setTipoImovel(resultSet.getInt("id_tipo_imovel"));
				imovel.setUsuario(resultSet.getString("nome"));
				imovel.setTelefone(resultSet.getString("telefone"));
				imovel.setEmail(resultSet.getString("email"));
				imovel.setImagem(resultSet.getString("imagens"));
				
				listaImoveis.add(imovel);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			listaImoveis = null;
		} finally {
			closeConnection(conn, stmt, resultSet);
		}
		return listaImoveis;
	}
}