package funcoes;

import java.util.Calendar;
import java.util.Date;

public class Calendario {

	/*public static void main(String[] args) {
		Date d = new Date("October 2, 2023");
		
		System.out.println(contagemDiasUteis(d));
		System.out.println(contagemDomingos(d));
	}*/
	
	/**
	 * Faz a contagem de dias uteis desde uma data escolhida ate a data atual.
	 * @param dataInicio - data escolhida para iniciar contagem
	 * @return - a quantidade de dias uteis (sem diferenciar feriados)
	 */
	public static int contagemDiasUteis (Date dataInicio) {
	    //Numero de dias que se passaram, sem contar com a data inicio e data fim
	    //Observação: Contando que a data inicio e data fim sejam dias uteis
	    int dias = (int) (new Date().getTime() - dataInicio.getTime()) / 86400000;
	    int diasUteis = 0;
	    Calendar cal  = Calendar.getInstance();
	    cal.setTime(dataInicio);
	    for (int i = 1; i<= dias ; i++){
	        //Acrescenta mais um dia na data para poder verificar se é dia util
	        cal.add(Calendar.DATE, 1);
	        //Verifica se não é dia util
	        if (cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
	            diasUteis +=1;
	        }
	    }
	    
	    return diasUteis;
	}
	
	/**
	 * Faz a contagem dos domingos desde uma data escolhida ate a data atual.
	 * @param dataInicio - data escolhida para iniciar contagem
	 * @return - a quantidade de domingos
	 */
	public static int contagemDomingos (Date dataInicio) {
	    int dias = (int) (new Date().getTime() - dataInicio.getTime()) / 86400000;
	    int domingos = 0;
	    Calendar cal  = Calendar.getInstance();
	    cal.setTime(dataInicio);
	    for (int i = 1; i<= dias ; i++){
	        cal.add(Calendar.DATE, 1);
	        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
	            domingos +=1;
	        }
	    }
	    
	    return domingos;
	}

}

