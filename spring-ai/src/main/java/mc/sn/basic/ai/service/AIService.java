package mc.sn.basic.ai.service;

import org.springframework.dao.DataAccessException;

public interface AIService {

	public String translate(String words) throws DataAccessException;

}
