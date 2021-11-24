package com.diamon.fecha;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fechas {

	public static void main(String[] args) {

		// Primero se ve en que GTM esta la fecha en el blockChain
		// Segundo se lleva a GTM 1 y se obtiene las horas de diferencia
		// Tercero se le resta las horas de diferencia local a GTM 1 y obtienes la hora
		// local
		// Se mete hora y tiempo etc. local, para encontra el tiempo
		// Por ultimo no se toma los tres ultimos digitos del tiempo

		FechaBitcoin f = new FechaBitcoin();

		JLabel textoHoraGTM = new JLabel("Introdusca Hora GTM");

		JTextField dia = new JTextField("Dia", 5);
		JTextField mes = new JTextField("Mes", 5);
		JTextField ano = new JTextField("Ano", 5);
		JTextField hora = new JTextField("Hora", 5);
		JTextField minuto = new JTextField("Minuto", 5);
		JTextField segundo = new JTextField("Segundo", 5);

		JTextField tiempoMaster = new JTextField("", 10);

		JButton boton = new JButton("Generar Tiempo Master");

		JFrame ventana = new JFrame("Fecha Bitcoin");

		JLabel horaLocal = new JLabel("Hora Local: ");

		JLabel horaGTM = new JLabel("Hora GTM: ");

		JLabel horaLocalAntes = new JLabel(
				"Hora Local antes de 01/05/2016 02:30:00 AM " + "( 01/05/2016 03:00:00 AM ) Calculada: ");

		JLabel horaGTMAntes = new JLabel(
				"Hora GTM antes de 01/05/2016 06:30:00 AM " + "( 01/05/2016 07:00:00 AM ) Calculada: ");

		JTextField fecha = new JTextField("Tiempo Master", 10);

		JButton botonFecha = new JButton("Generar Fecha");

		JLabel textoFechaLocal = new JLabel("Hora Local: ");

		JLabel textoFechaGTM = new JLabel("Hora GTM: ");

		boton.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent ev) {

				try {

					tiempoMaster.setText(
							"" + f.getTiempoMaster(Integer.parseInt(dia.getText()), Integer.parseInt(mes.getText()),
									Integer.parseInt(ano.getText()), Integer.parseInt(hora.getText()),
									Integer.parseInt(minuto.getText()), Integer.parseInt(segundo.getText())));

					horaLocalAntes.setText("Hora Local antes de 01/05/2016 02:30:00 AM "
							+ "( 01/05/2016 03:00:00 AM ) Calculada: "
							+ f.getFechaNormalAntes(Integer.parseInt(dia.getText()), Integer.parseInt(mes.getText()),
									Integer.parseInt(ano.getText()), Integer.parseInt(hora.getText()),
									Integer.parseInt(minuto.getText()), Integer.parseInt(segundo.getText()), 0));

					horaGTMAntes.setText("Hora GTM antes de 01/05/2016 06:30:00 AM "
							+ "( 01/05/2016 07:00:00 AM ) Calculada: "
							+ f.getFechaNormalAntes(Integer.parseInt(dia.getText()), Integer.parseInt(mes.getText()),
									Integer.parseInt(ano.getText()), Integer.parseInt(hora.getText()),
									Integer.parseInt(minuto.getText()), Integer.parseInt(segundo.getText()), 1));

					horaLocal.setText("Hora Local: "
							+ f.getFechaNormal(Integer.parseInt(dia.getText()), Integer.parseInt(mes.getText()),
									Integer.parseInt(ano.getText()), Integer.parseInt(hora.getText()),
									Integer.parseInt(minuto.getText()), Integer.parseInt(segundo.getText())));

					horaGTM.setText("Hora GTM: " + f
							.getFechaNormal(Integer.parseInt(dia.getText()), Integer.parseInt(mes.getText()),
									Integer.parseInt(ano.getText()), Integer.parseInt(hora.getText()),
									Integer.parseInt(minuto.getText()), Integer.parseInt(segundo.getText()))
							.toGMTString());

				} catch (Exception e) {

				}

			}

			@Override
			public void mouseEntered(MouseEvent ev) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent ev) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent ev) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent ev) {
				// TODO Auto-generated method stub

			}

		});

		botonFecha.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent ev) {

				try {

					Date fecha1 = new Date();

					fecha1.setTime(Long.parseLong(fecha.getText()));

					textoFechaLocal.setText(fecha1.toString());

					textoFechaGTM.setText(fecha1.toGMTString());

				} catch (Exception e) {

				}

			}

			@Override
			public void mouseEntered(MouseEvent ev) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent ev) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent ev) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent ev) {
				// TODO Auto-generated method stub

			}

		});

		ventana.setSize(800, 600);

		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ventana.setLayout(new FlowLayout());

		ventana.add(textoHoraGTM);

		ventana.add(dia);
		ventana.add(mes);
		ventana.add(ano);
		ventana.add(hora);
		ventana.add(minuto);
		ventana.add(segundo);

		ventana.add(boton);

		ventana.add(tiempoMaster);

		ventana.add(horaLocal);

		ventana.add(horaGTM);

		ventana.add(horaLocalAntes);

		ventana.add(horaGTMAntes);

		ventana.add(fecha);

		ventana.add(botonFecha);
		ventana.add(textoFechaLocal);
		ventana.add(textoFechaGTM);

		ventana.setVisible(true);

	}

}
