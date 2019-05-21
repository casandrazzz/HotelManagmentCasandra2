package repository;
/**
 * TODO IRepository to be implemented for RoomRepository, StaffRepository, HotelRepository
 */

import java.util.List;

public interface IRepository<T> {
    public List<T> findAll ();
    public T findByName(String name);
    public boolean addEntity(T entity);
    public void removeEntity(T entity);
}
