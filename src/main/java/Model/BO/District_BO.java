package Model.BO;

import java.util.ArrayList;

import Model.DAO.District_DAO;
import Model.bean.District;

public class District_BO {
	District_DAO dao = new District_DAO();
	
	public ArrayList<District> getAllDistrict() {
		return dao.GetALLDistrict();
	}
}
