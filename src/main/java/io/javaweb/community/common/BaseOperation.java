package io.javaweb.community.common;


import java.io.Serializable;

import io.javaweb.community.mybatis.domain.PageBounds;
import io.javaweb.community.mybatis.domain.PageList;

/**
 * Created by KevinBlandy on 2017/10/30 13:42
 */
public interface BaseOperation <T>{
    /*	---------------------	select	---------------------	*/

    /**
     * 根据pk检索一条记录
     * @param primaryKey
     * @return
     * @throws Exception
     */
    T queryByPrimaryKey(Serializable primaryKey)throws Exception;


    /**
     * 根据非空参数检索记录,带分页
     * @param entity
     * @param pageBounds
     * @return
     * @throws Exception
     */
    PageList<T> queryByParamSelective(T entity, PageBounds pageBounds)throws Exception;

    /**
     * 根据非空参数仅仅检索出一条记录
     * @param entity
     * @return
     * @throws Exception
     */
    T queryByParamSelectiveSole(T entity)throws Exception;


	/*	---------------------	insert	---------------------	*/

    /**
     * 创建一条新的记录
     * @param entity
     * @return
     * @throws Exception
     */
    Integer create(T entity)throws Exception;

	/*	---------------------	update	---------------------	*/

    /**
     * 根据pk更新非空数据
     * @param entity
     * @return
     * @throws Exception
     */
    Integer updateByPrimaryKeySelective(T entity)throws Exception;

    /**
     * 根据pk更新数据
     * @param entity
     * @return
     * @throws Exception
     */
    Integer updateByPrimaryKey(T entity)throws Exception;

	/*	---------------------	delete	---------------------	*/

    /**
     * 根据pk删除记录
     * @param primaryKey
     * @return
     * @throws Exception
     */
    Integer deleteByPrimaryKey(Serializable primaryKey)throws Exception;

    /**
     * 根据非空参数删除记录
     * @param entity
     * @return
     * @throws Exception
     */
    Integer deleteByParamSelective(T entity)throws Exception;
}
