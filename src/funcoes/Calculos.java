package funcoes;

public class Calculos {
	
/**
 * Efetua as deducoes no salario base para retornar o salario liquido. 
 * @param salario_base - valor base para calculo dos impostos
 * @param inss - valor do imposto inss
 * @param irrf - valor do imposto irrf
 * @return - salario liquido, ou seja, o pagamento final
 */
	public static float calculo_pagamento(float salario_base, float inss, float irrf) {

		float salario_liquido = salario_base - (inss + irrf);
		
		return salario_liquido;
	}

	/**
	* A partir da quantidade de horas extras trabalhadas, tem-se a porcentagem extra aplicada no salario. 	
	* @param horas_ext - quantidade de horas extras trabalhadas
	* @return - a porcentagem extra a ser aplicada no salario.
	*/
	public static float porcentagem_extra (float horas_ext){ //sem trabalho no fds - regra de negócio
		float  porc_extra;
		if (horas_ext < 25)
			porc_extra = 0.5f;
		else if (horas_ext >= 25 && horas_ext <= 40)
			porc_extra = 0.7f;
		else
			porc_extra = 0.85f;
			
		return porc_extra;
	}

	/**
	* Calcula o salario bruto considerando o valor a se receber por hora de trabalho, 
	* porcentagem de reconhecimento, horas trabalhadas e a porcentagem a mais por hora extra. 	 
	* @param valor_hr - valor recebido por cada hora de trabalho mais a porcentagem de reconhecimento
	* @param porc_rec - porcentagem que varia de acordo com a senioridade do funcionario
	* @param horas_trab - quantidade de horas trabalhadas
	* @param horas_ext - quantidade de horas extras trabalhadas
	* @return - salario bruto que servira de base para calculo dos impostos
	*/
	public static float salario_bruto (float valor_hr, float porc_rec, float horas_trab, float horas_ext){
		float porc_extra = porcentagem_extra(horas_ext);
		valor_hr = valor_hr*(1+porc_rec);
		float salario_bruto = valor_hr*horas_trab;
		float valor_hora_ext = (valor_hr*horas_ext) + ((valor_hr*horas_ext)*porc_extra);
		salario_bruto += valor_hora_ext;
		
		return salario_bruto;
	}

	/**
	* Calcula o valor do inss a ser deduzido do salario levando em consideracao os valores intituidos por lei. 	
	* @param salario_base - salario bruto calculado a partir das horas de trabalho
	* @return - valor do inss
	*/
	public static float inss (float salario_base){
		float aliquota_inss, valor_inss;
		if (salario_base <= 1320)
			aliquota_inss = 0.075f;
		else if (salario_base >= 2571.30 && salario_base <= 3856.94)
			aliquota_inss = 0.12f;
		else //(salario_base >= 3856.95 && salario_base <= 7507.49)
			aliquota_inss = 0.14f;

		valor_inss = salario_base*aliquota_inss;
		return valor_inss;
	}

	/**
	* Calcula o valor do irrf a ser deduzido do salario levando em consideracao os valores intituidos por lei. 	
	* @param salario_sem_inss - calculo feito do salario bruto com a deducao do inss
	* @param dep - a quantidade de dependentes que o funcionario possui
	* @return - valor do irrf
	*/
	public static float irrf (float salario_sem_inss, int dep){
		float aliquota_irrf, deducao;
		float valor_dep = 189.59f*dep;
		float base_calculo = salario_sem_inss - valor_dep;

		if (base_calculo <= 2112){
			aliquota_irrf = 0;
			deducao = 0;
	}
		else if (base_calculo >= 2112.01 && base_calculo <= 2826.65){
			aliquota_irrf = 0.075f;
			deducao = 158.40f;
	}
		else if (base_calculo >= 2826.66 && base_calculo <= 3751.05){
			aliquota_irrf = 0.15f;
			deducao = 370.40f;
	}
		else if (base_calculo >= 3751.06 && base_calculo <= 4664.68){
			aliquota_irrf = 0.225f;
			deducao = 651.73f;
	}
		else {
			aliquota_irrf = 0.275f;
			deducao = 884.96f;
		}

		float valor_irrf = (base_calculo*aliquota_irrf) - deducao;
		return valor_irrf;
	}

	/**
	* Calcula o valor do fgts levando em consideracao os valores intituidos por lei. 	
	* @param salario_base - salario bruto calculado a partir das horas de trabalho
	* @return - valor do fgts
	*/
	public static float fgts (float salario_base){
		float aliquota_fgts = 0.08f;
		float valor_fgts = salario_base*aliquota_fgts;

		return valor_fgts;
	}
	
}
