package com.iluwatar.visitor2.node;

import com.iluwatar.visitor2.visitor.Visitor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: fjl
 * @CreateTime: 2022-12-23
 */
@Slf4j
public class Industry extends GraphNode {
    public String people = "100";
    public String industryName = "阿里巴巴";


    public Industry(Integer area) {
        super(area);
    }

    @Override
    public void describe() {
        LOGGER.info("我是1个工厂");
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
        LOGGER.info("导出工厂xml：面积{}，名称：{}，人数{}", super.area,
                industryName, people);
    }
    @Override
    void exportWord() {
        LOGGER.info("导出工厂word：面积{}，名称：{}，人数{}", super.area,
                industryName, people);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doForIndustry(this);
    }

}