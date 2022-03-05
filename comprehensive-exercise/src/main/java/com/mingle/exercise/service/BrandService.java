package com.mingle.exercise.service;

import com.mingle.exercise.entity.Brand;
import com.mingle.exercise.mapper.BrandMapper;
import com.mingle.exercise.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;


/**
 * @author mingle
 * @date 2022/3/1 17:42
 * @description Brand业务类
 */
public class BrandService {
    SqlSessionFactory factory = SqlSessionFactoryUtil.getSqlSessionFactory();

    /**
     * 查询所有
     *
     * @return List<Brand>
     */
    public List<Brand> selectAll() {
        //1. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //3. 调用方法
        List<Brand> brands = mapper.selectAll();
        sqlSession.close();
        return brands;
    }

    /**
     * 添加
     *
     * @param brand brand对象
     */
    public void add(Brand brand) {
        //1. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //3. 调用方法
        mapper.add(brand);
        //4. 提交事务
        sqlSession.commit();
        //5. 释放资源
        sqlSession.close();
    }
    public void delete(int id){
        //1. 获取SqlSession
        SqlSession sqlSession = factory.openSession();
        //2. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        //3.删除指定的ID
        mapper.delete(id);
        //4. 提交事务
        sqlSession.commit();
        //5. 释放资源
        sqlSession.close();
    }

    /**
     * 根据id查询
     *
     * @return Brand
     */
    public Brand selectById(int id) {
        SqlSession sqlSession = factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = mapper.selectById(id);
        sqlSession.close();
        return brand;
    }

    /**
     * 修改
     *
     * @param brand brand对象
     */
    public void update(Brand brand) {
        SqlSession sqlSession = factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        mapper.update(brand);
        sqlSession.commit();
        sqlSession.close();
    }

}