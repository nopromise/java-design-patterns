package com.iluwatar.visitor2.visitor;

import com.iluwatar.visitor2.node.City;
import com.iluwatar.visitor2.node.Industry;
import com.iluwatar.visitor2.node.Sightseeing;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: fjl
 * @CreateTime: 2022-12-23
 */
@Slf4j
public class ExportExcelVisitor implements Visitor {
    @Override
    public void doForCity(City city) {
        //需要把属性暴露出来给访问者
        LOGGER.info("导出城市excel：面积{},名称{}", city.area, city.getCityName());
    }

    @Override
    public void doForIndustry(Industry industry) {
        LOGGER.info("导出工厂excel：面积{},名称{}", industry.area, industry.industryName);
    }

    @Override
    public void doForSightSeeing(Sightseeing sightseeing) {
        LOGGER.info("导出景观excel：面积{},所在地{}", sightseeing.area, sightseeing.getSightseeingLocation());
    }
}