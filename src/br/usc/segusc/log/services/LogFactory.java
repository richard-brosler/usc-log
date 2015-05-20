package br.usc.segusc.log.services;

import br.usc.segusc.log.entity.LogLevel;
import br.usc.segusc.log.impl.Log;

/**
 * Factory de Log para logar informa��es do sistema
 * @author Bruno Rocha Roma
 * @autor Marcelo Cabello Peres
 * @autor Richard Brosler
 * @version 1.0.0, Mai 09, 2015
 * @since 1.0.0
 * @see ILogService
 * @see LogLevel
 * @see Log
 * 
 */

public class LogFactory {
	private Log log;
	private static LogFactory logfat; 
	/**
	 * Constructor privado
	 */
	private LogFactory() {
		log = new Log();
	}
	/**
	 * M�todo para obter uma inst�ncia do Log
	 * @return LogFactory - retorna a inst�ncia para logar o sistema
	 * 
	 */
	public static LogFactory getInstance(){
		if (logfat==null){
			logfat = new LogFactory();
		}
		return logfat;
	}
	/**
	 * M�todo para obter uma inst�ncia do log por interface
	 * @return ILogService - Retorna a inst�ncia pela interface ILogService
	 */
	public static ILogService getLogServiceImpl(){
		return getInstance().log;
	}
}
