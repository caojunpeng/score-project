package com.cao.score.service;

import com.cao.score.entity.Role;
import com.cao.score.vo.DataTablesResult;
import com.cao.score.vo.ObjectParams;

import java.util.List;

/**
 * 角色表(Role)表服务接口
 *
 * @author makejava
 * @since 2022-01-11 17:47:07
 */
public interface RoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    Role queryById(Long roleId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Role> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role insert(Role role);

    /**
     * 修改数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role update(Role role);

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 是否成功
     */
    boolean deleteById(Long roleId);

    public DataTablesResult<Role> dataLists(ObjectParams roleParams);

}