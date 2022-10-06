package singh.ashu.PetClinic.services.Map;

import org.yaml.snakeyaml.events.Event;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T,ID> {

    protected Map<ID, T> map=new HashMap<>();

    Set<T> findAll(){
          return new HashSet<>(map.values());
    }

    T save(ID id,T obj){
        map.put(id,obj);
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
}
