package repository;
/*
  TODO IRepository to be implemented for RoomRepository, StaffRepository, HotelRepository
 */

import java.util.List;

interface IRepository<T> {
    List<T> findAll();
    T findByName(String name);
    boolean addEntity(T entity);
    void removeEntity(T entity);
}
