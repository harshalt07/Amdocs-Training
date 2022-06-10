package com.training.amdocs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.amdocs.pojo.CovidCentre;

@Component
public class CentreDaoImpl  implements ICentreDAo{
	
	List<CovidCentre> listCentre = new ArrayList<CovidCentre>();
	
	public CentreDaoImpl() {
		// TODO Auto-generated constructor stub
		
		listCentre.add(new CovidCentre(1, "RH PATHARDI", "Ahmednagar", 414102));
		listCentre.add(new CovidCentre(2, "UH Nagar", "Ahmednagar", 414001));
		listCentre.add(new CovidCentre(3, "Saideep", "Ahmednagar",414002));
		listCentre.add(new CovidCentre(4, "Lokmanya", "Shevgaon",414501));
		
	}
	
	public List<CovidCentre> getAllCentres(){
		return listCentre;
	}
	
	public CovidCentre getCovidCentre(int pinCode) {
		
		CovidCentre abc = null;
		
		for(CovidCentre m : listCentre) {
			if(m.getPincode()==pinCode) {
				abc=m;
				break;
			}
		}
		
		return abc;
	}

	@Override
	public CovidCentre addCovidCentre(CovidCentre a) {
		// TODO Auto-generated method stub
		CovidCentre newCentre = new CovidCentre(a.getId(), a.getName(), a.getAddress(), a.getPincode());
		return newCentre;
	}
	
	


}
