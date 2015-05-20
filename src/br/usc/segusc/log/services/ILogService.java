package br.usc.segusc.log.services;

import br.usc.segusc.log.entity.LogLevel;

/**
 * Interface de Log para o sistema de segurança
 * @author Bruno Rocha Roma
 * @autor Marcelo Cabello Peres
 * @autor Richard Brosler
 * @version 1.0.0, Mai 09, 2015
 * @since 1.0.0
 * 
 */

public interface ILogService {
	/**
	 * Método logger - Gera o log do sistema 
	 * @param nivelLog LogLevel - Recebe o parâmetro do tipo LogLevel para indicar o tipo de mensagem
	 * @param mensagem String - Recebe a mensagem a ser logada
	 * @see LogLevel 
	 */
	public void logger(LogLevel nivelLog, String mensagem);
}
