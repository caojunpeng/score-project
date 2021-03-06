package com.cao.score.service;

import com.cao.score.entity.User;
import com.cao.score.vo.DataTablesResult;
import com.cao.score.vo.ObjectParams;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-01-11 17:47:34
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    User queryById(Long userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<User> queryAllByLimit(int offset, int limit);
    /**
     * 查询单个对象
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User queryOne(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User insert(User user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    boolean deleteById(Long userId);

    /**
     * 用户列表
     * @param params
     * @return
     */
    DataTablesResult<User> dataLists(ObjectParams params);

}