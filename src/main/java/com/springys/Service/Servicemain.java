package com.springys.Service;

import com.github.pagehelper.PageInfo;
import com.springys.entity.*;

/**
 * Created by yzd on 2019/2/2.
 */

public interface Servicemain  {
    RuseltData getDataBaseList();
    void exitDatabase(String config, Five five);
    void deleteDatabase(int id);
    SelectPassword login(String password);
    BigData Sinformation(String user);
    PageInfo<Students> PageSelect(int pageNum,int pageSize);
}
