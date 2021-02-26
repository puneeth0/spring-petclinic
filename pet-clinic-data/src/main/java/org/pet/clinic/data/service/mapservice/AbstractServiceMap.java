package org.pet.clinic.data.service.mapservice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractServiceMap<T, ID> {
	
	protected Map<ID,T> map=new HashMap<ID,T>();
	public Set<T> findall(){	
		return new HashSet<>(map.values());
}
	
	public T findById(ID id) {
		return map.get(id);
	}
	
	public T save(ID id,T object) {
		map.put(id, object);
		return object;
	}
	
	public void delete(T object) {
		map.entrySet().removeIf(entry->entry.getValue().equals(object));
	}
	
	public void deleteById(ID id) {
		map.remove(id);
	}
	
}
