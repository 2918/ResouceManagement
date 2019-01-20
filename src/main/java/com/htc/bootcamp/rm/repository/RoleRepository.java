/**
 * 
 */
package com.htc.bootcamp.rm.repository;

import org.springframework.data.repository.CrudRepository;

import com.htc.bootcamp.rm.entity.Project;
import com.htc.bootcamp.rm.entity.Role;

/**
 * @author Jayaprakash
 *
 */
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
