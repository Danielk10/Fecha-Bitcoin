package com.diamon.fecha;

import java.util.Date;

public class FechaBitcoin {

	public long getTiempoMaster(int dia, int mes, int ano, int hora, int minutos, int segundos) {

		int tm = minutos;

		mes = mes - 1;

		int tiemp = 1462086000;

		int ti = 0;

		int ta = 0;

		if (ano >= 2000) {

			ta = ano - 2000;

			ta = 100 + ta;

		}

		if (ano < 2000) {

			ta = ano - 1900;

		}

		Date fechac = new Date();

		fechac.setYear(ta);

		fechac.setMonth(mes);

		fechac.setDate(dia);

		fechac.setHours(hora);

		fechac.setMinutes(minutos);

		fechac.setSeconds(segundos);

		StringBuilder numero = new StringBuilder();

		String t = "" + fechac.getTime();

		numero.append(t.charAt(0));
		numero.append(t.charAt(1));
		numero.append(t.charAt(2));
		numero.append(t.charAt(3));
		numero.append(t.charAt(4));
		numero.append(t.charAt(5));
		numero.append(t.charAt(6));
		numero.append(t.charAt(7));
		numero.append(t.charAt(8));
		numero.append(t.charAt(9));

		ti = Integer.parseInt(numero.toString());

		if (ti < tiemp) {

			tm = minutos - 30;

		}

		Date fecha = new Date();

		fecha.setYear(ta);

		fecha.setMonth(mes);

		fecha.setDate(dia);

		fecha.setHours(hora);

		fecha.setMinutes(tm);

		fecha.setSeconds(segundos);

		int tiempoMaster = 0;

		StringBuilder numeroMaster = new StringBuilder();

		String tM = "" + fecha.getTime();

		numeroMaster.append(tM.charAt(0));
		numeroMaster.append(tM.charAt(1));
		numeroMaster.append(tM.charAt(2));
		numeroMaster.append(tM.charAt(3));
		numeroMaster.append(tM.charAt(4));
		numeroMaster.append(tM.charAt(5));
		numeroMaster.append(tM.charAt(6));
		numeroMaster.append(tM.charAt(7));
		numeroMaster.append(tM.charAt(8));
		numeroMaster.append(tM.charAt(9));

		tiempoMaster = Integer.parseInt(numeroMaster.toString());

		return tiempoMaster;

	}

	public Date getFechaNormal(int dia, int mes, int ano, int hora, int minutos, int segundos) {

		int ta = 0;
		mes = mes - 1;

		if (ano >= 2000) {

			ta = ano - 2000;

			ta = 100 + ta;

		}

		if (ano < 2000) {

			ta = ano - 1900;

		}

		Date fecha = new Date();

		fecha.setYear(ta);

		fecha.setMonth(mes);

		fecha.setDate(dia);

		fecha.setHours(hora);

		fecha.setMinutes(minutos);

		fecha.setSeconds(segundos);

		return fecha;

	}

	public String getFechaNormalAntes(int dia, int mes, int ano, int hora, int minutos, int segundos, int tipo) {

		int ta = 0;

		mes = mes - 1;

		int ti = 0;

		int tiemp = 1462086000;

		if (ano >= 2000) {

			ta = ano - 2000;

			ta = 100 + ta;

		}

		if (ano < 2000) {

			ta = ano - 1900;

		}

		Date fecha = new Date();

		fecha.setYear(ta);

		fecha.setMonth(mes);

		fecha.setDate(dia);

		fecha.setHours(hora);

		fecha.setMinutes(minutos);

		fecha.setSeconds(segundos);

		StringBuilder numero = new StringBuilder();

		String t = "" + fecha.getTime();

		numero.append(t.charAt(0));
		numero.append(t.charAt(1));
		numero.append(t.charAt(2));
		numero.append(t.charAt(3));
		numero.append(t.charAt(4));
		numero.append(t.charAt(5));
		numero.append(t.charAt(6));
		numero.append(t.charAt(7));
		numero.append(t.charAt(8));
		numero.append(t.charAt(9));

		ti = Integer.parseInt(numero.toString());

		int tm = 0;

		if (ti < tiemp) {

			tm = minutos - 30;

			Date fecha1 = new Date();

			fecha1.setYear(ta);

			fecha1.setMonth(mes);

			fecha1.setDate(dia);

			fecha1.setHours(hora);

			fecha1.setMinutes(tm);

			fecha1.setSeconds(segundos);

			if (tipo == 0) {

				return fecha1.toString();

			}

			if (tipo == 1) {

				return fecha1.toGMTString();

			}

		}

		return "";

	}

}
