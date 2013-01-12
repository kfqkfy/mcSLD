/**
 * 
 */
package com.mc.framwork.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author kongfeiquan
 *
 */
public interface GenericDao<T, ID extends Serializable> {
//	public ID save(T entity);  
	
	int insert(T t);  
	  
    void delete(T t);  
  
    void update(T t);  
  
    T queryById(Integer id);  
  
    List<T> queryAll();

}

