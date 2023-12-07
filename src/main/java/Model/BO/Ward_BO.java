package Model.BO;

import java.util.ArrayList;

import Model.DAO.Ward_DAO;
import Model.bean.Ward;

public class Ward_BO {
	Ward_DAO dao = new Ward_DAO();
	
	public ArrayList<Ward> getWardByDistrict(String name_district) {
		return dao.getWardByDistrict(name_district);
	}
}
