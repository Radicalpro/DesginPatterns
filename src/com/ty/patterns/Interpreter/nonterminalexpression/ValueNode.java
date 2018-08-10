package com.ty.patterns.Interpreter.nonterminalexpression;

import com.ty.patterns.Interpreter.abstractexpression.Node;

public class ValueNode implements Node {

    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }

}
