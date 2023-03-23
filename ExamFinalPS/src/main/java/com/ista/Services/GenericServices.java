package com.ista.Services;

import java.io.Serializable;
import java.util.List;

public interface GenericServices <T,ID extends Serializable>{

	public T save(T entity);
    public T findById(ID id);
    public List<T> findByAll();
    public void delete(ID id);
}
