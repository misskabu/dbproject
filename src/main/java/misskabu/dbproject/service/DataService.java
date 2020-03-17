package misskabu.dbproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import misskabu.dbproject.mapper.DataMapper;

@Component
public class DataService {

	@Autowired
	private DataMapper dataDaoMapper;

	public DataMapper getDataDaoMapper() {
		return dataDaoMapper;
	}

	public void setDataDaoMapper(DataMapper dataDaoMapper) {
		this.dataDaoMapper = dataDaoMapper;
	}

}
