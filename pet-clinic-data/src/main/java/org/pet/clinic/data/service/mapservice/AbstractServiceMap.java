package org.pet.clinic.data.service.mapservice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.pet.clinic.data.model.BaseEntity;

public abstract class AbstractServiceMap<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<Long, T>();

	public Set<T> findall() {
		return new HashSet<>(map.values());
	}

	public T findById(ID id) {
		return map.get(id);
	}

	public T save( T object) {
		if (object != null) {
			if (object.getId() == null) {
				object.setId(getNextId());
				map.put(object.getId(), object);
			}
		}

		return object;
	}

	public void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	public void deleteById(ID id) {
		map.remove(id);
	}

	private Long getNextId() {
		System.out.println("map.keySet().size() "+map.keySet().size());
		return (long) (map.keySet().size() + 1);
	}

}
