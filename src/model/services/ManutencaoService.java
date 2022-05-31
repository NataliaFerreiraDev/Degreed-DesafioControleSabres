package model.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.entities.Manutencao;

public class ManutencaoService {
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
	
	public List<Manutencao> findAll(){
		List<Manutencao> manutencoes = new ArrayList<>();
		
		try {
			manutencoes.add(new Manutencao(1, 3, sdf1.parse("17-03-2003"), "C-3PO"));
			manutencoes.add(new Manutencao(2, 3, sdf1.parse("17-04-2003"), "C-3PO"));
			manutencoes.add(new Manutencao(3, 2, sdf1.parse("17-09-2003"), "C-3PO"));
			manutencoes.add(new Manutencao(4,5,  sdf1.parse("17-12-2003"), "C-3PO"));			
		}catch(ParseException ex) {
			System.out.println(ex.getMessage());
		}	
		
		return manutencoes;
	}

}
