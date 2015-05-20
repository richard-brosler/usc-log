package br.usc.segusc.log.impl;

import br.usc.segusc.log.entity.LogLevel;
import br.usc.segusc.log.services.ILogService;

/**
 * Log para logar informações do sistema
 * @author Bruno Rocha Roma
 * @autor Marcelo Cabello Peres
 * @autor Richard Brosler
 * @version 1.0.0, Mai 09, 2015
 * @since 1.0.0
 * @see ILogService
 * @see LogLevel
 */


public class Log implements ILogService{
	@Override
	public void logger(LogLevel nivelLog, String mensagem) {
		String tipo;
		switch (nivelLog) {
			case WARNING: tipo = "Aviso: "; break;
			case ERROR: tipo = "Erro: "; break;
			default : tipo = "Tnformativo: ";
		}
		System.out.println(tipo + mensagem);
	}
}
