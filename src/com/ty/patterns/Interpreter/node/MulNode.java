package com.ty.patterns.Interpreter.node;

import com.ty.patterns.Interpreter.Node;
import com.ty.patterns.Interpreter.SymbolNode;

public class MulNode extends SymbolNode {

    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
