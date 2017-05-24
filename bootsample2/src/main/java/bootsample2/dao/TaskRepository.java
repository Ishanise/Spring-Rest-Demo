package bootsample2.dao;

import org.springframework.data.repository.CrudRepository;

import bootsample2.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{
	

}
