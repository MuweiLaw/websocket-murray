package com.murray.websocketmurray.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
/**
 *
 * @param <E> 要操作的实体对象
 * @param <ID>
 */
public interface EntityService<E, ID extends Serializable> {
    
    public int insert(E e);
    
    public int update(E e);
    
    public int delete(E... e);
    
    public int deleteById(ID... ids);
    
    public E findById(ID id);
    

    public List<E> findBy(Map<?, ?> map);
    
    public List<E> findAll();
    
    public Class<E> getEntityClass();
}
