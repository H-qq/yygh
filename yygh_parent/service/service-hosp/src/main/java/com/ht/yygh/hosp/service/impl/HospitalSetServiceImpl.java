package com.ht.yygh.hosp.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ht.yygh.common.result.Result;
import com.ht.yygh.hosp.mapper.HospitalSetMapper;
import com.ht.yygh.hosp.service.HospitalSetService;
import com.ht.yygh.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService  {

    @Autowired
    private HospitalSetMapper hospitalSetMapper;



}
