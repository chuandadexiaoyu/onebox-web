package com.chinasofti.onebox.onebox_web.IDao;

import com.chinasofti.onebox.onebox_web.domain.Good;

public interface GoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Good record);

    int insertSelective(Good record);

    Good selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
}