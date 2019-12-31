package com.edu.service.impl;

import com.edu.mapper.DeptMapper;
import com.edu.po.Dept;
import com.edu.po.DeptCustom;
import com.edu.po.DeptExample;
import com.edu.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    // 将 Dept 类型转换成 DeptCustom 类型
    public DeptCustom transformToDeptCustom(Dept dept) {
        DeptCustom deptCustom = new DeptCustom();
        if (dept != null){
            deptCustom.setDeptId(dept.getDeptId());
            deptCustom.setDeptName(dept.getDeptName());
        }
        return deptCustom;
    }

    // 将Dept类型的list，转换成DeptCustom类型的list
    public List<DeptCustom> transformToDeptCustomList(List<Dept> deptList) {
        List<DeptCustom> deptCustomList = new ArrayList<>();
        for (Dept dept : deptList) {
            deptCustomList.add(transformToDeptCustom(dept));
        }
        return deptCustomList;
    }

    @Override
    public List<DeptCustom> getDeptAll() {
        DeptExample deptExample = new DeptExample();
        List<Dept> deptList = deptMapper.selectByExample(deptExample);
        return transformToDeptCustomList(deptList);
    }

    @Override
    public DeptCustom getDeptByDid(Integer deptId) {
        Dept dept = deptMapper.selectByPrimaryKey(deptId);
        return transformToDeptCustom(dept);
    }
}
