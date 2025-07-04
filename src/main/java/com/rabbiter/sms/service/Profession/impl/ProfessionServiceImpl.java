package com.rabbiter.sms.service.Profession.impl;

import com.rabbiter.sms.dao.Profession.ProfessionMapper;
import com.rabbiter.sms.domain.Profession;
import com.rabbiter.sms.service.Profession.ProfessionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description

 **/
@Service
public class ProfessionServiceImpl implements ProfessionService {
  @Resource
  private ProfessionMapper professionMapper;

  @Override
  public List<Profession> getProfessionList() {
    return professionMapper.getProfessionList();
  }
}
