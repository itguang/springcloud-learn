package com.itguang.resttemplatetest.service;

import com.itguang.resttemplatetest.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author itguang
 * @create 2017-12-17 11:14
 **/
@Service
public class UserService {


    private List<UserEntity> init() {
        ArrayList<UserEntity> list = new ArrayList<UserEntity>();
        list.add(new UserEntity("1", "逻辑", "123456", 20, "luoji@santi.com"));
        list.add(new UserEntity("2", "叶文杰", "123456", 22, "yewenjie@santi.com"));
        list.add(new UserEntity("3", "云天明", "123456", 26, "yuntianming@santi.com"));
        list.add(new UserEntity("4", "程心", "123456", 28, "chengxin@santi.com"));

        return list;

    }



    public List<UserEntity> getAll() {
        return init();
    }


    public UserEntity getById(String id) {
        List<UserEntity> entities = init().stream()
                .filter(user -> user.getId().equals(id))
                .collect(toList());

        if (entities.size()==0){
            return null;
        }


        return entities.get(0);
    }
    public UserEntity getByUsernameAndAge(String username,Integer age) {
        List<UserEntity> entities = init().stream()
                .filter(userEntity -> userEntity.getUsername().equals(username))
                .filter(userEntity ->userEntity.getAge().equals(age))
                .collect(toList());
        if (entities.size()==0){
            return null;
        }

        return entities.get(0);
    }


}
