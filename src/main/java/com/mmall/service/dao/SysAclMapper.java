package com.mmall.service.dao;

import com.mmall.beans.PageQuery;
import com.mmall.model.SysAcl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component(value = "SysAclMapper")
public interface SysAclMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAcl record);

    int insertSelective(SysAcl record);

    SysAcl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAcl record);

    int updateByPrimaryKey(SysAcl record);

    int countByAclModuleId(@Param("aclModuleId") int aclModuleId);

    List<SysAcl> getPageByAclModuleId(@Param("aclModuleId") int aclModuleId, @Param("page") PageQuery page);

    int countByNameAndAclModuleId(@Param("aclModuleId") int aclModuleId, @Param("name") String name, @Param("id") Integer id);

    List<SysAcl> getAll();

    List<SysAcl> getByIdList(@Param("idList") List<Integer> idList);

    List<SysAcl> getByUrl(@Param("url") String url);
}