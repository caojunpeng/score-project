package com.cao.score.service.impl;

import com.cao.score.dao.RoleDao;
import com.cao.score.entity.Role;
import com.cao.score.entity.User;
import com.cao.score.service.RoleService;
import com.cao.score.vo.DataTablesResult;
import com.cao.score.vo.ObjectParams;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色表(Role)表服务实现类
 *
 * @author makejava
 * @since 2022-01-11 17:47:07
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleDao roleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roleId 主键
     * @return 实例对象
     */
    @Override
    public Role queryById(Long roleId) {
        return this.roleDao.queryById(roleId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Role> queryAllByLimit(int offset, int limit) {
        return this.roleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    @Override
    public Role insert(Role role) {
        this.roleDao.insert(role);
        return role;
    }

    /**
     * 修改数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    @Override
    public Role update(Role role) {
        this.roleDao.update(role);
        return this.queryById(role.getRoleId());
    }

    /**
     * 通过主键删除数据
     *
     * @param roleId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long roleId) {
        return this.roleDao.deleteById(roleId) > 0;
    }

    @Override
    public DataTablesResult<Role> dataLists(ObjectParams params) {
        List<Role> roles=roleDao.getList(params);
        DataTablesResult<Role> dataTablesResult=new DataTablesResult<>();
        dataTablesResult.setData(roles);
        dataTablesResult.setRecordsFiltered(roles.size());
        dataTablesResult.setRecordsTotal(roles.size());
        return dataTablesResult;
    }
}