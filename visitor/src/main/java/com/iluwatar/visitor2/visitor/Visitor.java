package com.iluwatar.visitor2.visitor;

import com.iluwatar.visitor2.node.City;
import com.iluwatar.visitor2.node.Industry;
import com.iluwatar.visitor2.node.Sightseeing;

/**
 * @Author: fjl
 * @CreateTime: 2022-12-23
 */
public  interface Visitor {
     void doForCity(City city);
     void doForIndustry(Industry industry);
     void doForSightSeeing(Sightseeing sightseeing);
}