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
package com.iluwatar.visitor;

import com.iluwatar.visitor.unit.Commander;
import com.iluwatar.visitor.unit.Sergeant;
import com.iluwatar.visitor.unit.Soldier;
import com.iluwatar.visitor.unitVisitor.CommanderVisitor;
import com.iluwatar.visitor.unitVisitor.SergeantVisitor;
import com.iluwatar.visitor.unitVisitor.SoldierVisitor;

/**
 * <p>Visitor pattern defines a mechanism to apply operations on nodes in a hierarchy. New
 * operations can be added without altering the node interface.</p>
 *
 * <p>In this example there is a unit hierarchy beginning from {@link Commander}. This hierarchy is
 * traversed by visitors. {@link SoldierVisitor} applies its operation on {@link Soldier}s, {@link
 * SergeantVisitor} on {@link Sergeant}s and so on.</p>
 */
public class App {

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
/*        //正常行为
        var commander1 = new Commander();
        var sergeant1 = new Sergeant();
        var soldier1 = new Soldier();
        commander1.fight();
        sergeant1.fight();
        soldier1.fight();*/

        //需要添加新行为
        var commander = new Commander(
                new Sergeant("士官John","3级",new Soldier("士兵A"), new Soldier("士兵B"), new Soldier("士兵C")),
                new Sergeant("士官Saul","5级",new Soldier("士兵D"), new Soldier("士兵E"), new Soldier("士兵F"))
        );
        //访问士兵
        commander.accept(new SoldierVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
        //
      /*  var soldier = new Soldier();
        soldier.accept(new SoldierVisitor());
        soldier.accept(new SergeantVisitor());
        soldier.accept(new CommanderVisitor());*/
    }
}
