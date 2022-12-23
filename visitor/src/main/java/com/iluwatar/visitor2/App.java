package com.iluwatar.visitor2;

import com.iluwatar.visitor2.node.City;
import com.iluwatar.visitor2.node.Industry;
import com.iluwatar.visitor2.visitor.ExportExcelVisitor;
import com.iluwatar.visitor2.visitor.ExportWordVisitor;
import com.iluwatar.visitor2.visitor.ExportXmlVisitor;

/**
 * @Author: fjl
 * @CreateTime: 2022-12-23
 */
public class App {
    public static void main(String[] args) {
        Industry industry = new Industry(100);
        //导出工厂xml
        industry.accept(new ExportXmlVisitor());
        industry.accept(new ExportWordVisitor());
        industry.accept(new ExportExcelVisitor());

        City city = new City(100);
        //导出工厂xml
        city.accept(new ExportXmlVisitor());
        city.accept(new ExportWordVisitor());
        city.accept(new ExportExcelVisitor());
    }
}