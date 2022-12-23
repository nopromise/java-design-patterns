/*
 * This project is licensed under the MIT license. Module model-view-viewmodel is using ZK framework licensed under LGPL (see lgpl-3.0.txt).
 *
 * The MIT License
 * Copyright © 2014-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.visitor.unit;

import com.iluwatar.visitor.unitVisitor.UnitVisitor;

import java.util.Arrays;

/**
 * Interface for the nodes in hierarchy.
 */
public abstract class Unit {

    private final Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }


    /**
     * 士兵、军士和长官都有的行为
     * 该类的主要行为
     */
    public abstract void fight();

    /**
     * Accept visitor.
     * 接受访客
     * 接受访客，
     */
    public void accept(UnitVisitor visitor) {
//        Arrays.stream(children).forEach(child -> child.accept(visitor));
        for (Unit child:children){
            child.accept(visitor);
        }
    }
}
