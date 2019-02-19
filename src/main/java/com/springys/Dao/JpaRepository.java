package com.springys.Dao;

import com.springys.entity.Students;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by yzd on 2019/2/18.
 */

@Transactional
public interface JpaRepository extends JpaRepositoryImplementation<Students, Integer> {
    @Modifying
    @Query(value = "select * from student where id>?1", nativeQuery = true)
    List<Students> select1(Integer id);
}
