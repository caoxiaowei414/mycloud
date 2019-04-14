package com.xiaowei.eurekaprovider8001.service.impl.cardpackage;

import com.xiaowei.eurekaprovider8001.dao.mapper.cardpackage.MCardpackageMapper;
import com.xiaowei.eurekaprovider8001.entity.cardpackage.MCardpackage;
import com.xiaowei.eurekaprovider8001.service.cardpackage.MCardpackageService;
import com.xiaowei.common.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by cxw on 2019/04/14.
 */
@Service
public class MCardpackageServiceImpl extends AbstractService<MCardpackage> implements MCardpackageService {

    @Autowired
    private MCardpackageMapper mCardpackageMapper;

}
