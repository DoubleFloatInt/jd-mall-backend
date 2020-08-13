package cn.doublefloat.jdmall.project.secondkill.service.impl;

import cn.doublefloat.jdmall.project.secondkill.domain.SecondKill;
import cn.doublefloat.jdmall.project.secondkill.mapper.SecondMapper;
import cn.doublefloat.jdmall.project.secondkill.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 牛生辉
 * @version 1.0
 * @date 2020/8/13 14:44
 * @other
 */
@Service
public class SecondServiceImpl implements SecondService {
    @Autowired
    private SecondMapper secondMapper;

    @Override
    public List<SecondKill> querySecondKillList(SecondKill secondKill){
        return secondMapper.querySecondKillList(secondKill);
    }

//    @Override
//    public SecondKill querySecondKillInfo(String id){
////        return secondMapper.querySecondKillInfo(id);
//        return null;
//    }

}
