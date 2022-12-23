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
public class ExportWordVisitor implements Visitor {
    @Override
    public void doForCity(City city) {
        LOGGER.info("导出城市word：面积{}", city.area);
    }

    @Override
    public void doForIndustry(Industry industry) {
        LOGGER.info("导出工厂word：面积{}", industry.area);
    }

    @Override
    public void doForSightSeeing(Sightseeing sightseeing) {
        LOGGER.info("导出景观word：面积{}", sightseeing.area);
    }
}