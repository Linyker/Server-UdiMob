package br.com.udimob.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Imovel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idImovel;
	
	private Integer tipoImovel;
	
	private String usuario;
	
	private String email;
	
	private String telefone;
	
	private String logradouro;
	
	private Integer numero;
	
	private String bairro;
	
	private String descricaoImovel;
	
	private Double preco;
	
	private String imagem_url;
	
	public String getImagem(){
		return imagem_url;
	}
	
	public void setImagem(String imagem_url){
		this.imagem_url = imagem_url;
	}

	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	public Integer getIdImovel() {
		return idImovel;
	}

	public void setIdImovel(Integer idImovel) {
		this.idImovel = idImovel;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public Integer getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(Integer tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getDescricaoImovel() {
		return descricaoImovel;
	}

	public void setDescricaoImovel(String descricaoImovel) {
		this.descricaoImovel = descricaoImovel;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
