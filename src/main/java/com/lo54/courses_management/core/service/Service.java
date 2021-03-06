package com.lo54.courses_management.core.service;


import com.lo54.courses_management.core.entity.Item;

import java.util.List;

public interface Service {

    /**
     * To store an entity
     * @param entity
     */
    void storeEntity(Item entity);

    /**
     * To update an entity
     * @param id
     * @param entity
     */
    void updateEntity(int id, final Item entity) throws Exception;

    /**
     * To remove an entity
     * @param id
     */
    void removeEntity(int id) throws Exception;

    /**
     * To get an entity by his id
     * @param id
     * @return
     */
    Item getEntity(int id) throws Exception;

    /**
     * To get the list of entities
     * @return
     */
    List getEntities() throws Exception;
}
