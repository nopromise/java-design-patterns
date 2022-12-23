package com.iluwatar.visitor2.node;

import com.iluwatar.visitor2.visitor.Visitor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: fjl
 * @CreateTime: 2022-12-23
 */
@Slf4j
public class City extends GraphNode {
    private String cityName = "北京";
    private String cityPeople = "1000000";

    public City(Integer area) {
        super(area);
    }

    @Override
    public void describe() {
        LOGGER.info("我是1个城市");
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
        LOGGER.info("导出城市xml：面积{}，名称：{}，人数{}", super.area,
                cityName, cityPeople);
    }


    @Override
    void exportWord() {
        LOGGER.info("导出城市word：面积{}，名称：{}，人数{}", super.area,
                cityName, cityPeople);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doForCity(this);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityPeople() {
        return cityPeople;
    }

    public void setCityPeople(String cityPeople) {
        this.cityPeople = cityPeople;
    }
}