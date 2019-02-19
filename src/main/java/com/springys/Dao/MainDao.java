package com.springys.Dao;

import com.springys.entity.Aj;
import com.springys.entity.BigData;
import com.springys.entity.SelectPassword;
import com.springys.entity.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by yzd on 2019/2/1.
 */
@Component
@Mapper

public interface MainDao {
    List<Aj> getDataBaseList();

    void exitDatabase(@Param("config") String config, @Param("db_name") String db_name, @Param("alias") String alias, @Param("create_time") Date create_time, @Param("db_type_id") int db_type_id, @Param("dbserver_config_id") int dbserver_config_id, @Param("repository_id") int repository_id, @Param("update_time") Date update_time);

    void deleteDatabase(@Param("id") int id);
    SelectPassword login(@Param("password")String password);
    BigData Sinformation(@Param("user")String user);
    List<Students> pageSelect();
}