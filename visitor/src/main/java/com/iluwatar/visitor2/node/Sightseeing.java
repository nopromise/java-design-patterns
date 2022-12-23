package com.iluwatar.visitor2.node;

import com.iluwatar.visitor2.visitor.Visitor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: fjl
 * @CreateTime: 2022-12-23
 */
@Slf4j
public class Sightseeing extends GraphNode {
    private String sightseeingName = "泰山";
    private String sightseeingType = "山";
    private String sightseeingLocation = "山东省泰安市";

    public Sightseeing(Integer area) {
        super(area);
    }

    @Override
    public void describe() {
        LOGGER.info("我是1个景观");
    }

    @Override
    public void area() {
        LOGGER.info("我占地{}平方公里", super.area);
    }

    /**
     * 1.导致远来的类特别庞大
     * 2.exportXml、exportWord都是不相干的方法
     * 3.频繁改动原来的类
     */
    @Override
    void exportXml() {
        LOGGER.info("导出景区xml：面积{}，景区名称{}，类型{}，所在地{}", super.area,
                sightseeingName, sightseeingType, sightseeingLocation);
    }

    @Override
    void exportWord() {
        LOGGER.info("导出景区word：面积{}，景区名称{}，类型{}，所在地{}", super.area,
                sightseeingName, sightseeingType, sightseeingLocation);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doForSightSeeing(this);
    }

    public String getSightseeingName() {
        return sightseeingName;
    }

    public void setSightseeingName(String sightseeingName) {
        this.sightseeingName = sightseeingName;
    }

    public String getSightseeingType() {
        return sightseeingType;
    }

    public void setSightseeingType(String sightseeingType) {
        this.sightseeingType = sightseeingType;
    }

    public String getSightseeingLocation() {
        return sightseeingLocation;
    }

    public void setSightseeingLocation(String sightseeingLocation) {
        this.sightseeingLocation = sightseeingLocation;
    }
}