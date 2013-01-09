/**
 * 
 */
package com.mc.framwork.dao;

import java.util.List;

/**
 * @author kongfeiquan
 *
 */
public interface GenericDao<T> {
	int insert(T t);  
	  
    void delete(T t);  
  
    void update(T t);  
  
    T queryById(Integer id);  
  
    List<T> queryAll();

}

