package com.iluwatar.visitor2.node;

import com.iluwatar.visitor2.visitor.Visitor;

/**
 * @Author: fjl
 * @CreateTime: 2022-12-23
 */
public abstract class GraphNode {
    public Integer area;

    public GraphNode(Integer area) {
        this.area = area;
    }

    /**
     * 描述该图形节点
     * 类的自己的行为
     */
    public abstract void describe();

    /**
     * 描述该图形节点
     * 占地面积
     */
    public abstract void area();

    /**
     * ？？？
     *
     * @return
     */
    abstract void exportXml();

    abstract void exportWord();

    /**
     * 提供1个访问接口
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}