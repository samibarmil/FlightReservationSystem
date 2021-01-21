package DataAccess;

import java.util.List;

public interface iDataModel {

	public boolean addEntity(Object obj);

	public Object getEntity(String Id);

	public List getall();

	public boolean deleteEntity(String Id);

}
