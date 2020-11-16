package com.liujia.springdynamiccreatetable.service.impl;

import com.liujia.springdynamiccreatetable.domain.UserLogConfig;
import com.liujia.springdynamiccreatetable.mapper.UserLogConfigMapper;
import com.liujia.springdynamiccreatetable.mapper.UserLogMapper;
import com.liujia.springdynamiccreatetable.service.UserLogConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLogConfigServiceImpl implements UserLogConfigService {

    @Autowired
    private UserLogConfigMapper userLogConfigMapper;

    @Autowired
    private UserLogMapper userLogMapper;
    @Override
    public void save(UserLogConfig userLogConfig) {

        if(userLogConfig.getId() != null && !"".equals(userLogConfig.getId())) {
            // 更新
            userLogConfigMapper.save(userLogConfig);

            String table_name = userLogConfig.getTable_name();
            if(userLogMapper.existTable(table_name) > 0) {
                userLogMapper.dropTable(table_name);
            }
            userLogMapper.createTable(table_name);

        } else{
            userLogConfigMapper.updateById(userLogConfig);
        }
        userLogConfigMapper.save(userLogConfig);
    }

    @Override
    public List<UserLogConfig> findAll() {
        return userLogConfigMapper.findAll();
    }

    @Override
    public void updateById(UserLogConfig userLogConfig) {
        userLogConfigMapper.updateById(userLogConfig);
    }
}
