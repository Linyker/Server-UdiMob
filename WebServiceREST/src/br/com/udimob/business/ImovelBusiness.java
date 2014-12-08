package br.com.udimob.business;

import java.util.ArrayList;

import br.com.udimob.dao.ImovelDAO;
import br.com.udimob.dto.Imovel;


public class ImovelBusiness {

	public ArrayList<Imovel> buscarTodos() {
		ImovelDAO imovelDAO = new ImovelDAO();
		return imovelDAO.buscarTodos();
	}
}
