package singh.ashu.PetClinic.services.Map;

import singh.ashu.PetClinic.models.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {

    protected Map<Long, T> map=new HashMap<>();

    Set<T> findAll(){
          return new HashSet<>(map.values());
    }

    T save(T obj){
        if(obj!=null){
            if(true){
                obj.setId(getNextId());
            }
            map.put(obj.getId(),obj);
        }
        else {
            throw new RuntimeException();
        }


         return obj;
    }

    T findById(ID id){
        return map.get(id);
    }

    void deleteById(ID id){
        map.remove(id);

    }
    void delete(T obj){
        map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    }

    long getNextId(){
        return map.size()+1;
    }
}
