/*
 * Copyright 2008 JRimum Project
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by
 * applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * Created at: 30/03/2008 - 18:58:07
 * 
 * ================================================================================
 * 
 * Direitos autorais 2008 JRimum Project
 * 
 * Licenciado sob a Licença Apache, Versão 2.0 ("LICENÇA"); você não pode usar
 * esse arquivo exceto em conformidade com a esta LICENÇA. Você pode obter uma
 * cópia desta LICENÇA em http://www.apache.org/licenses/LICENSE-2.0 A menos que
 * haja exigência legal ou acordo por escrito, a distribuição de software sob
 * esta LICENÇA se dará “COMO ESTÁ”, SEM GARANTIAS OU CONDIÇÕES DE QUALQUER
 * TIPO, sejam expressas ou tácitas. Veja a LICENÇA para a redação específica a
 * reger permissões e limitações sob esta LICENÇA.
 * 
 * Criado em: 30/03/2008 - 18:58:07
 * 
 */


package br.com.nordestefomento.jrimum.domkee.entity;

import java.io.Serializable;

public class NumeroDaConta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7807160258460502276L;

	private Integer codigoDaConta  = 0;

	private String digitoDaConta = "";
	
	public NumeroDaConta() {}
	
	public NumeroDaConta(Integer codigoDaConta) {
		
		this.codigoDaConta = codigoDaConta;
	}
	
	public NumeroDaConta(Integer codigoDaConta, String digitoDaConta) {
		
		this.codigoDaConta = codigoDaConta;
		this.digitoDaConta = digitoDaConta;
	}

	public Integer getCodigoDaConta() {
		return codigoDaConta;
	}

	public void setCodigoDaConta(Integer codigoDaConta) {
		this.codigoDaConta = codigoDaConta;
	}

	public String getDigitoDaConta() {
		return digitoDaConta;
	}

	public void setDigitoDaConta(String digitoDaConta) {
		this.digitoDaConta = digitoDaConta;
	}
	
	public void setDigitoDaConta(Integer digitoDaConta) {
		setDigitoDaConta(digitoDaConta.toString());
	}	
}
