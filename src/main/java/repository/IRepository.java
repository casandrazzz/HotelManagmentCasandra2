package repository;

import java.util.List;

public interface IRepository<T> {
    public List<T> findAll ();
    public T findByName(String name);
    public boolean addEntity(T entity);
    public void removeEntity(T entity);
}
