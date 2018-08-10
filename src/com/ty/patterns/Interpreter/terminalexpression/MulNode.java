package com.ty.patterns.Interpreter.terminalexpression;

import com.ty.patterns.Interpreter.abstractexpression.Node;

public class MulNode extends SymbolNode {

    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
