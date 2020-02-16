package com.ping.mapper.mine_mapper;

import tk.mybatis.mapper.common.base.select.SelectAllMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

/**
 * @author:lyp
 * @date 2020/2/16-20:37
 */
public interface MyMapper<T> extends SelectAllMapper<T>,SelectByExampleMapper<T> {
}
