package model.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.entities.Modelo;
import model.entities.SabreAutomatico;
import model.entities.SabreManual;
import model.entities.SabreSemiAutomatico;
import model.entities.Sabres;
import model.entities.Situacao;

public class SabresService {
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
	
	public List<Sabres> findAll(){
		List<Sabres> sabres = new ArrayList<>();
		
		try {
			sabres.add(new SabreManual(1,Modelo.MANUAL, sdf1.parse("17-03-2021"), Situacao.PRONTO, "Luke Skywalker", "BTN-0347"));
			sabres.add(new SabreManual(2,Modelo.MANUAL, sdf1.parse("17-03-2002"), Situacao.OBSOLETO, "Obi-Wan Kenobi", "BTN-0017"));
			sabres.add(new SabreSemiAutomatico(3,Modelo.SEMIAUTOMATICO, sdf1.parse("20-11-2003"), Situacao.OBSOLETO, "Darth Vader", "GN-Z11", "Via Láctea"));
			sabres.add(new SabreSemiAutomatico(4,Modelo.SEMIAUTOMATICO, sdf1.parse("25-05-2020"), Situacao.EMMANUTENCAO, "Ray", "GN-Z17", "Via Láctea"));
			sabres.add(new SabreAutomatico(5, Modelo.AUTOMATICO, sdf1.parse("20-11-2002"), Situacao.OBSOLETO,  "Boba Fett", "SEN-0085", sdf1.parse("20-11-2012")));
			sabres.add(new SabreAutomatico(6, Modelo.AUTOMATICO, sdf1.parse("20-11-2021"), Situacao.PRONTO, "Finn", "SEN-1007", sdf1.parse("20-11-2031")));
		} catch(ParseException ex) {
			System.out.println(ex.getMessage());
		}		
		
		return sabres;
	}

}
